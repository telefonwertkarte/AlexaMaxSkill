package develop.moritz.datamodel;

/**
 * The Class ProductActivationResponse.
 */
public class ProductActivationResponse {

    /** The activated. */
    private boolean activated;

    /** The activation date. */
    private String activationDate;

    /** The expiry date. */
    private String expiryDate;

    /** The days till expiry. */
    private int daysTillExpiry;

    /** The inform about expiry. */
    private boolean informAboutExpiry;

    /** The web shop URI. */
    private String webShopURI;

    /** The business name. */
    private String businessName;

    /**
     * The Class InformationText.
     */
    public class InformationText {
        // Please do not remove
        // TODO: Implement later
    };

    /** The information text. */
    private InformationText informationText;

    /** The mock. */
    private boolean mock;

    /**
     * Checks if is activated.
     *
     * @return true, if is activated
     */
    public boolean isActivated() {
        return this.activated;
    }

    /**
     * Sets the activated.
     *
     * @param activated
     *            the new activated
     */
    public void setActivated(boolean activated) {
        this.activated = activated;
    }

    /**
     * Gets the activation date.
     *
     * @return the activation date
     */
    public String getActivationDate() {
        return this.activationDate;
    }

    /**
     * Sets the activation date.
     *
     * @param activationDate
     *            the new activation date
     */
    public void setActivationDate(String activationDate) {
        this.activationDate = activationDate;
    }

    /**
     * Gets the expiry date.
     *
     * @return the expiry date
     */
    public String getExpiryDate() {
        return this.expiryDate;
    }

    /**
     * Sets the expiry date.
     *
     * @param expiryDate
     *            the new expiry date
     */
    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    /**
     * Gets the days till expiry.
     *
     * @return the days till expiry
     */
    public int getDaysTillExpiry() {
        return this.daysTillExpiry;
    }

    /**
     * Sets the days till expiry.
     *
     * @param daysTillExpiry
     *            the new days till expiry
     */
    public void setDaysTillExpiry(int daysTillExpiry) {
        this.daysTillExpiry = daysTillExpiry;
    }

    /**
     * Checks if is inform about expiry.
     *
     * @return true, if is inform about expiry
     */
    public boolean isInformAboutExpiry() {
        return this.informAboutExpiry;
    }

    /**
     * Sets the inform about expiry.
     *
     * @param informAboutExpiry
     *            the new inform about expiry
     */
    public void setInformAboutExpiry(boolean informAboutExpiry) {
        this.informAboutExpiry = informAboutExpiry;
    }

    /**
     * Gets the web shop URI.
     *
     * @return the web shop URI
     */
    public String getWebShopURI() {
        return this.webShopURI;
    }

    /**
     * Sets the web shop URI.
     *
     * @param webShopUri
     *            the new web shop URI
     */
    public void setWebShopURI(String webShopUri) {
        this.webShopURI = webShopUri;
    }

    /**
     * Gets the business name.
     *
     * @return the business name
     */
    public String getBusinessName() {
        return this.businessName;
    }

    /**
     * Sets the business name.
     *
     * @param businessName
     *            the new business name
     */
    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    /**
     * Checks if is mock.
     *
     * @return true, if is mock
     */
    public boolean isMock() {
        return this.mock;
    }

    /**
     * Sets the mock.
     *
     * @param mock
     *            the new mock
     */
    public void setMock(boolean mock) {
        this.mock = mock;
    }

    /**
     * Gets the information text.
     *
     * @return the information text
     */
    public InformationText getInformationText() {
        return this.informationText;
    }

    /**
     * Sets the information text.
     *
     * @param informationText
     *            the new information text
     */
    public void setInformationText(InformationText informationText) {
        this.informationText = informationText;
    }

}
