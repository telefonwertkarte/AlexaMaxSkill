package develop.moritz;

/**
 * The Class LoginData.
 */
public class LoginData {

    /** The session id. */
    private final String sessionId;

    /** The cookie. */
    private final String cookie;

    /**
     * Instantiates a new login data.
     *
     * @param sessionId
     *            the session id
     * @param cookie
     *            the cookie
     */
    public LoginData(final String sessionId, final String cookie) {
        this.sessionId = sessionId;
        this.cookie = cookie;
    }

    /**
     * Gets the session id.
     *
     * @return the session id
     */
    public String getSessionId() {
        return this.sessionId;
    }

    /**
     * Gets the cookie.
     *
     * @return the cookie
     */
    public String getCookie() {
        return this.cookie;
    }

}
