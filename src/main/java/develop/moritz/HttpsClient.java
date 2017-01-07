package develop.moritz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import javax.net.ssl.HttpsURLConnection;

import com.fasterxml.jackson.databind.ObjectMapper;

import develop.moritz.datamodel.MaxCubeState;
import develop.moritz.datamodel.ProductActivationResponse;
import develop.moritz.datamodel.Room;

/**
 * The Class HttpsClient.
 */
public class HttpsClient implements IHttpsClient {

    /*
     * (non-Javadoc)
     * 
     * @see eu.ehnes.max2.IHttpsClient#login(java.lang.String, java.lang.String)
     */
    @Override
    public LoginData login(String username, String password) {
        String https_url = "https://www.max-portal.elv.de/soap/restJson/login";
        LoginData result = null;
        URL url = null;

        try {

            url = new URL(https_url);
            HttpsURLConnection con = (HttpsURLConnection) url.openConnection();

            con.setDoOutput(true);
            con.setRequestMethod("POST");
            con.setDoInput(true);
            con.setUseCaches(false);
            con.setAllowUserInteraction(false);
            con.setRequestProperty("Content-Type", "application/json");
            con.setRequestProperty("Content-Length", "4");
            con.setRequestProperty("charset", "utf-8");
            con.setRequestProperty("User-Agent", "max-elv/3.1.0 CFNetwork/808.1.4 Darwin/16.1.0");
            con.setRequestProperty("Accept", "*/*");

            OutputStream os = con.getOutputStream();
            os.write(new String("{ \"username\":\"" + username + "\", \"password\":\"" + password + "\"}").getBytes());
            os.close();

            if (con.getResponseCode() == 200) {
                try (BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));) {

                    String input;

                    while ((input = br.readLine()) != null) {

                        Map<String, List<String>> headerFields = con.getHeaderFields();

                        List<String> cookies = headerFields.get("Set-Cookie");

                        // System.out.println("Session-ID: " + input);
                        // String cookie = con.getHeaderField("Set-Cookie");

                        if (cookies != null) {
                            Optional<String> cookie = cookies.stream()
                                    .filter(c -> c.toUpperCase().contains("JSESSIONID")).findFirst();
                            Pattern pattern = Pattern.compile("JSESSIONID=[0-9a-z]*;");

                            if (cookie != null && cookie.isPresent()) {
                                Matcher matcher = pattern.matcher(cookie.get());
                                if (matcher.find()) {

                                    // System.out.println("Cookie: " +
                                    // matcher.group(0));
                                    result = new LoginData(input, matcher.group(0));

                                }
                            }
                        }
                    }
                }
            }

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }

    /*
     * (non-Javadoc)
     * 
     * @see eu.ehnes.max2.IHttpsClient#checkProductActivation(eu.ehnes.max2.
     * LoginData)
     */
    @Override
    public boolean checkProductActivation(LoginData loginData) {
        String https_url = "https://www.max-portal.elv.de/soap/restJson/checkProductActivation";
        URL url = null;

        try {
            url = new URL(https_url);
            HttpsURLConnection con = (HttpsURLConnection) url.openConnection();

            con.setDoOutput(true);
            con.setRequestMethod("GET");
            con.setDoInput(true);
            con.setUseCaches(false);
            con.setAllowUserInteraction(false);
            con.setRequestProperty("charset", "utf-8");
            con.setRequestProperty("User-Agent", "max-elv/3.1.0 CFNetwork/808.1.4 Darwin/16.1.0");
            con.setRequestProperty("Accept", "*/*");
            con.setRequestProperty("Session-Token", loginData.getSessionId());
            con.setRequestProperty("Cookie", loginData.getCookie());

            if (con.getResponseCode() == 200) {
                try (BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));) {

                    String response = "";
                    String input;

                    while ((input = br.readLine()) != null) {
                        response += input + "\n";
                    }

                    System.out.println(response);

                    ObjectMapper mapper = new ObjectMapper();

                    ProductActivationResponse productActivationResponse = mapper.readValue(response,
                            ProductActivationResponse.class);
                    productActivationResponse.getClass();
                }
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return true;
    }

    /*
     * (non-Javadoc)
     * 
     * @see eu.ehnes.max2.IHttpsClient#getMaxCubeState(eu.ehnes.max2.LoginData)
     */
    @Override
    public MaxCubeState getMaxCubeState(LoginData loginData) {
        String https_url = "https://www.max-portal.elv.de/soap/restJson/maxCubeState";
        URL url = null;
        MaxCubeState result = null;

        try {
            url = new URL(https_url);
            HttpsURLConnection con = (HttpsURLConnection) url.openConnection();

            con.setDoOutput(true);
            con.setRequestMethod("GET");
            con.setDoInput(true);
            con.setUseCaches(false);
            con.setAllowUserInteraction(false);
            con.setRequestProperty("charset", "utf-8");
            con.setRequestProperty("User-Agent", "max-elv/3.1.0 CFNetwork/808.1.4 Darwin/16.1.0");
            con.setRequestProperty("Accept", "*/*");
            con.setRequestProperty("Session-Token", loginData.getSessionId());
            con.setRequestProperty("Cookie", loginData.getCookie());

            if (con.getResponseCode() == 200) {
                try (BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));) {

                    String response = "";
                    String input;

                    while ((input = br.readLine()) != null) {
                        response += input + "\n";
                    }

                    System.out.println(response);

                    ObjectMapper mapper = new ObjectMapper();

                    MaxCubeState maxCubeState = mapper.readValue(response, MaxCubeState.class);

                    result = maxCubeState;
                }
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return result;
    }

    /*
     * (non-Javadoc)
     * 
     * @see eu.ehnes.max2.IHttpsClient#setRoomAutoMode(eu.ehnes.max2.LoginData,
     * java.lang.Integer)
     */
    @Override
    public boolean setRoomAutoMode(LoginData loginData, Integer roomId) {
        return setRoomAutoMode(loginData, roomId, null);
    }

    /*
     * (non-Javadoc)
     * 
     * @see eu.ehnes.max2.IHttpsClient#setRoomAutoMode(eu.ehnes.max2.LoginData,
     * java.lang.Integer, java.lang.Double)
     */
    @Override
    public boolean setRoomAutoMode(LoginData loginData, Integer roomId, Double temperature) {
        String https_url = null;
        String jsonString = null;

        if (temperature == null) {
            https_url = "https://www.max-portal.elv.de/soap/restJson/setRoomAutoMode";
            jsonString = "{ \"roomId\": " + roomId + "}";
        } else {
            https_url = "https://www.max-portal.elv.de/soap/restJson/setRoomAutoModeWithTemperature";
            jsonString = "{ \"roomId\": " + roomId + ", \"temperature\": " + temperature + " }";

        }
        URL url = null;
        boolean result = false;

        try {

            url = new URL(https_url);
            HttpsURLConnection con = (HttpsURLConnection) url.openConnection();

            con.setDoOutput(true);
            con.setRequestMethod("POST");
            con.setDoInput(true);
            con.setUseCaches(false);
            con.setAllowUserInteraction(false);
            con.setRequestProperty("Content-Type", "application/json");
            con.setRequestProperty("charset", "utf-8");
            con.setRequestProperty("User-Agent", "max-elv/3.1.0 CFNetwork/808.1.4 Darwin/16.1.0");
            con.setRequestProperty("Accept", "*/*");
            con.setRequestProperty("Session-Token", loginData.getSessionId());
            con.setRequestProperty("Cookie", loginData.getCookie());

            con.setRequestProperty("Content-Length", "" + jsonString.length());

            OutputStream os = con.getOutputStream();
            os.write(jsonString.getBytes());
            os.close();

            if (con.getResponseCode() == 200) {
                try (BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));) {

                    String input;

                    while ((input = br.readLine()) != null) {
                        if ("true".equalsIgnoreCase(input)) {
                            result = true;
                            break;
                        }
                    }
                }
            }

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * eu.ehnes.max2.IHttpsClient#setRoomPermanentMode(eu.ehnes.max2.LoginData,
     * java.lang.Integer, java.lang.Double)
     */
    @Override
    public boolean setRoomPermanentMode(LoginData loginData, Integer roomId, Double temperature) {
        String https_url = "https://www.max-portal.elv.de/soap/restJson/setRoomPermanentMode";
        URL url = null;
        boolean result = false;

        try {

            url = new URL(https_url);
            HttpsURLConnection con = (HttpsURLConnection) url.openConnection();

            con.setDoOutput(true);
            con.setRequestMethod("POST");
            con.setDoInput(true);
            con.setUseCaches(false);
            con.setAllowUserInteraction(false);
            con.setRequestProperty("Content-Type", "application/json");
            con.setRequestProperty("charset", "utf-8");
            con.setRequestProperty("User-Agent", "max-elv/3.1.0 CFNetwork/808.1.4 Darwin/16.1.0");
            con.setRequestProperty("Accept", "*/*");
            con.setRequestProperty("Session-Token", loginData.getSessionId());
            con.setRequestProperty("Cookie", loginData.getCookie());

            final String jsonString = "{ \"roomId\": " + roomId + ",\n\"temperature\": " + temperature + "\n}";
            con.setRequestProperty("Content-Length", "" + jsonString.length());

            OutputStream os = con.getOutputStream();
            os.write(jsonString.getBytes());
            os.close();

            if (con.getResponseCode() == 200) {
                try (BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));) {

                    String input;

                    while ((input = br.readLine()) != null) {
                        if ("true".equalsIgnoreCase(input)) {
                            result = true;
                            break;
                        }
                    }
                }
            }

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }

    /*
     * (non-Javadoc)
     * 
     * @see eu.ehnes.max2.IHttpsClient#getRoomNames(eu.ehnes.max2.LoginData)
     */
    @Override
    public List<String> getRoomNames(LoginData loginData) {
        List<String> roomNames;
        MaxCubeState maxCubeState = getMaxCubeState(loginData);

        List<Room> rooms = maxCubeState.getRooms();
        roomNames = rooms.stream().map(Room::getName).collect(Collectors.toList());
        return roomNames;
    }

    @Override
    public Optional<Integer> getRoomId(LoginData loginData, String roomName) {
        Optional<Integer> result = null;
        MaxCubeState maxCubeState = getMaxCubeState(loginData);

        List<Room> rooms = maxCubeState.getRooms();
        result = rooms.stream().filter(p -> p.equals(roomName)).map(q -> q.getId()).findFirst();
        return result;
    }
}
