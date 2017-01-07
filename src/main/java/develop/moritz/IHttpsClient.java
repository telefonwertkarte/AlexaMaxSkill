package develop.moritz;

import java.util.List;
import java.util.Optional;

import develop.moritz.datamodel.MaxCubeState;

/**
 * The Interface IHttpsClient.
 */
public interface IHttpsClient {

    /**
     * Login.
     *
     * @param username
     *            the username
     * @param password
     *            the password
     * @return the login data
     */
    public LoginData login(String username, String password);

    /**
     * Check product activation.
     *
     * @param loginData
     *            the login data
     * @return true, if successful
     */
    public boolean checkProductActivation(LoginData loginData);

    /**
     * Gets the max cube state.
     *
     * @param loginData
     *            the login data
     * @return the max cube state
     */
    public MaxCubeState getMaxCubeState(LoginData loginData);

    /**
     * Sets the room auto mode.
     *
     * @param loginData
     *            the login data
     * @param roomId
     *            the room id
     * @return true, if successful
     */
    public boolean setRoomAutoMode(LoginData loginData, Integer roomId);

    /**
     * Sets the room auto mode with temperature.
     *
     * @param loginData
     *            the login data
     * @param roomId
     *            the room id
     * @param Temperature
     *            the temperature
     * @return true, if successful
     */
    public boolean setRoomAutoMode(LoginData loginData, Integer roomId, Double Temperature);

    /**
     * Sets the room permanent mode.
     *
     * @param loginData
     *            the login data
     * @param roomId
     *            the room id
     * @param temperature
     *            the temperature
     * @return true, if successful
     */
    public boolean setRoomPermanentMode(LoginData loginData, Integer roomId, Double temperature);

    List<String> getRoomNames(LoginData loginData);

    Optional<Integer> getRoomId(LoginData loginData, String roomName);

}