package develop.moritz;

import java.util.List;
import java.util.Optional;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import develop.moritz.datamodel.MaxCubeState;
import develop.moritz.datamodel.Room;

/**
 * The Class MaxControl communicates with the max web portal. To do this, it
 * needs username and password.
 */
@Path("maxcontrol")
public class MaxControl {

    /** The Constant TEMPERATURE. */
    private static final String TEMPERATURE = "temperature";

    /** The Constant ROOM. */
    private static final String ROOM = "room";

    /** The Constant USERNAME. */
    private final static String USERNAME = "username";

    /** The Constant PASSWORD. */
    private static final String PASSWORD = "password";

    /** The Constant MODUS. */
    private static final String MODUS = "modus";

    /** The Constant INCREMENTATION_STEP */
    private final static double INCREMENTATION_STEP = 0.5;

    /**
     * Gets the temperature.
     *
     * @param username
     *            the username of the max user
     * @param password
     *            the password of the max user
     * @param room
     *            the room to get the temperature from
     * 
     * @return the temperature in {@link Room}
     */
    @SuppressWarnings("static-method")
    @GET
    @Path("/getTemp")
    @Produces("text/plain")
    public String getTemperature(@QueryParam(USERNAME) String username, @QueryParam(PASSWORD) String password,
            @QueryParam(ROOM) final String room) {
        // System.out.println("Service getTemperature for rooms " + room);
        String result = null;
        IHttpsClient httpsClient = new HttpsClient();
        LoginData loginData = httpsClient.login(username, password);
        if (loginData != null) {
            MaxCubeState maxCubeState = httpsClient.getMaxCubeState(loginData);
            if (maxCubeState != null && room != null) {
                List<Room> rooms = maxCubeState.getRooms();
                Optional<Room> roomResult = rooms.stream().filter(p -> p.getName().equalsIgnoreCase(room)).findFirst();
                if (roomResult != null && roomResult.isPresent()) {
                    result = "" + roomResult.get().getSetPointTemperature();
                }
            }

        }
        return result;
    }

    /**
     * Sets the temperature in given room
     *
     * @param username
     *            the username of the max user
     * @param password
     *            the password of the max user
     * @param room
     *            the room the room where to set the temperature
     * @param temperature
     *            the temperature to set in {@link Room}
     * 
     * @return true, if successful
     */
    @SuppressWarnings("static-method")
    public boolean setTemperature(@QueryParam(USERNAME) String username, @QueryParam(PASSWORD) String password,
            @QueryParam(ROOM) final String room, @QueryParam(TEMPERATURE) String temperature) {
        boolean result = false;
        IHttpsClient httpsClient = new HttpsClient();
        LoginData loginData = httpsClient.login(username, password);
        if (loginData != null) {
            MaxCubeState maxCubeState = httpsClient.getMaxCubeState(loginData);

            if (maxCubeState != null && room != null) {
                List<Room> rooms = maxCubeState.getRooms();
                Optional<Room> roomResult = rooms.stream().filter(p -> p.getName().equalsIgnoreCase(room)).findFirst();
                if (roomResult != null && roomResult.isPresent()) {
                    int roomId = roomResult.get().getId();
                    result = httpsClient.setRoomAutoMode(loginData, Integer.valueOf(roomId),
                            Double.valueOf(Double.parseDouble(temperature)));
                }
            }
        }
        return result;
    }

    /**
     * Gets the modus of the room
     *
     * @param username
     *            the username for the max user
     * @param password
     *            the password for the max user
     * @param room
     *            the room to get the modus from
     * 
     * @return the modus of {@link Room}
     */
    public String getModus(@QueryParam(USERNAME) String username, @QueryParam(PASSWORD) String password,
            @QueryParam(ROOM) final String room) {
        String result = null;
        IHttpsClient httpsClient = new HttpsClient();
        LoginData loginData = httpsClient.login(username, password);
        if (loginData != null) {
            MaxCubeState maxCubeState = httpsClient.getMaxCubeState(loginData);
            if (maxCubeState != null && room != null) {
                List<Room> rooms = maxCubeState.getRooms();
                Optional<Room> roomResult = rooms.stream().filter(p -> p.getName().equalsIgnoreCase(room)).findFirst();
                if (roomResult != null && roomResult.isPresent()) {
                    result = "" + roomResult.get().getControlMode();
                }
            }
        }
        return result;
    }

    /**
     * Sets the modus. Not implemented yet
     *
     * @param username
     *            the username
     * @param password
     *            the password
     * @param room
     *            the room
     * @param modus
     *            the modus
     * @return true, if successful
     */
    public boolean setModus(@QueryParam(USERNAME) String username, @QueryParam(PASSWORD) String password,
            @QueryParam(ROOM) String room, @QueryParam(MODUS) String modus) {
        boolean result = false;

        return result;
    }

    /**
     * Increment temperature
     *
     * @param username
     *            the username
     * @param password
     *            the password
     * @param room
     *            the room
     * @return true, if successful
     */
    public boolean incrementTemperature(@QueryParam(USERNAME) String username, @QueryParam(PASSWORD) String password,
            @QueryParam(ROOM) final String room) {
        boolean result = false;
        IHttpsClient httpsClient = new HttpsClient();
        LoginData loginData = httpsClient.login(username, password);
        if (loginData != null) {
            MaxCubeState maxCubeState = httpsClient.getMaxCubeState(loginData);

            if (maxCubeState != null && room != null) {
                List<Room> rooms = maxCubeState.getRooms();
                Optional<Room> roomResult = rooms.stream().filter(p -> p.getName().equalsIgnoreCase(room)).findFirst();
                if (roomResult != null && roomResult.isPresent()) {
                    int roomId = roomResult.get().getId();
                    result = httpsClient.setRoomAutoMode(loginData, Integer.valueOf(roomId),
                            Double.valueOf(roomResult.get().getSetPointTemperature() + INCREMENTATION_STEP));
                }
            }
        }
        return result;
    }

    /**
     * Decrement temperature.
     *
     * @param username
     *            the username
     * @param password
     *            the password
     * @param room
     *            the room
     * @return true, if successful
     */
    public boolean decrementTemperature(@QueryParam(USERNAME) String username, @QueryParam(PASSWORD) String password,
            @QueryParam(ROOM) final String room) {
        boolean result = false;

        IHttpsClient httpsClient = new HttpsClient();
        LoginData loginData = httpsClient.login(username, password);
        if (loginData != null) {
            MaxCubeState maxCubeState = httpsClient.getMaxCubeState(loginData);

            if (maxCubeState != null && room != null) {
                List<Room> rooms = maxCubeState.getRooms();
                Optional<Room> roomResult = rooms.stream().filter(p -> p.getName().equalsIgnoreCase(room)).findFirst();
                if (roomResult != null && roomResult.isPresent()) {
                    int roomId = roomResult.get().getId();
                    result = httpsClient.setRoomAutoMode(loginData, Integer.valueOf(roomId),
                            Double.valueOf(roomResult.get().getSetPointTemperature() - INCREMENTATION_STEP));
                }
            }
        }
        return result;

    }
}
