package develop.moritz.datamodel;

/**
 * The Class PushButtonConfiguration.
 */
public class PushButtonConfiguration {

    /** The upper key. */
    private UpperKey upperKey;

    /** The lower key. */
    private LowerKey lowerKey;

    /**
     * Gets the upper key.
     *
     * @return the upper key
     */
    public UpperKey getUpperKey() {
        return this.upperKey;
    }

    /**
     * Sets the upper key.
     *
     * @param upperKey
     *            the new upper key
     */
    public void setUpperKey(UpperKey upperKey) {
        this.upperKey = upperKey;
    }

    /**
     * Gets the lower key.
     *
     * @return the lower key
     */
    public LowerKey getLowerKey() {
        return this.lowerKey;
    }

    /**
     * Sets the lower key.
     *
     * @param lowerKey
     *            the new lower key
     */
    public void setLowerKey(LowerKey lowerKey) {
        this.lowerKey = lowerKey;
    }

}
