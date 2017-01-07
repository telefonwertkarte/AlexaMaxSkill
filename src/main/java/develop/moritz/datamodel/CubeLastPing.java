package develop.moritz.datamodel;

/**
 * The Class CubeLastPing.
 */
public class CubeLastPing {

    /** The outdated. */
    private boolean outdated;

    /** The date. */
    private String date;

    /**
     * Checks if is outdated.
     *
     * @return true, if is outdated
     */
    public boolean isOutdated() {
        return this.outdated;
    }

    /**
     * Sets the outdated.
     *
     * @param outdated
     *            the new outdated
     */
    public void setOutdated(boolean outdated) {
        this.outdated = outdated;
    }

    /**
     * Gets the date.
     *
     * @return the date
     */
    public String getDate() {
        return this.date;
    }

    /**
     * Sets the date.
     *
     * @param date
     *            the new date
     */
    public void setDate(String date) {
        this.date = date;
    }

}
