package develop.moritz.datamodel;

/**
 * The Class DeviceState.
 */
public class DeviceState {

    /** The transmit error. */
    private boolean transmitError;

    /** The set point temperature. */
    private double setPointTemperature;

    /** The temperature offset. */
    private double temperatureOffset;

    /** The battery low. */
    private boolean batteryLow;

    /** The window open. */
    // Only Window Open Detector
    private boolean windowOpen;

    /** The actual temperature. */
    // Only Wall Thermostat
    private double actualTemperature;

    /** The display actual temperature. */
    private boolean displayActualTemperature;

    /**
     * Checks if is transmit error.
     *
     * @return true, if is transmit error
     */
    public boolean isTransmitError() {
        return this.transmitError;
    }

    /**
     * Sets the transmit error.
     *
     * @param transmitError
     *            the new transmit error
     */
    public void setTransmitError(boolean transmitError) {
        this.transmitError = transmitError;
    }

    /**
     * Gets the sets the point temperature.
     *
     * @return the sets the point temperature
     */
    public double getSetPointTemperature() {
        return this.setPointTemperature;
    }

    /**
     * Sets the sets the point temperature.
     *
     * @param setPointTemperature
     *            the new sets the point temperature
     */
    public void setSetPointTemperature(double setPointTemperature) {
        this.setPointTemperature = setPointTemperature;
    }

    /**
     * Gets the temperature offset.
     *
     * @return the temperature offset
     */
    public double getTemperatureOffset() {
        return this.temperatureOffset;
    }

    /**
     * Sets the temperature offset.
     *
     * @param temperatureOffset
     *            the new temperature offset
     */
    public void setTemperatureOffset(double temperatureOffset) {
        this.temperatureOffset = temperatureOffset;
    }

    /**
     * Checks if is battery low.
     *
     * @return true, if is battery low
     */
    public boolean isBatteryLow() {
        return this.batteryLow;
    }

    /**
     * Sets the battery low.
     *
     * @param batteryLow
     *            the new battery low
     */
    public void setBatteryLow(boolean batteryLow) {
        this.batteryLow = batteryLow;
    }

    /**
     * Checks if is window open.
     *
     * @return true, if is window open
     */
    public boolean isWindowOpen() {
        return this.windowOpen;
    }

    /**
     * Sets the window open.
     *
     * @param windowOpen
     *            the new window open
     */
    public void setWindowOpen(boolean windowOpen) {
        this.windowOpen = windowOpen;
    }

    /**
     * Gets the actual temperature.
     *
     * @return the actual temperature
     */
    public double getActualTemperature() {
        return this.actualTemperature;
    }

    /**
     * Sets the actual temperature.
     *
     * @param actualTemperature
     *            the new actual temperature
     */
    public void setActualTemperature(double actualTemperature) {
        this.actualTemperature = actualTemperature;
    }

    /**
     * Checks if is display actual temperature.
     *
     * @return true, if is display actual temperature
     */
    public boolean isDisplayActualTemperature() {
        return this.displayActualTemperature;
    }

    /**
     * Sets the display actual temperature.
     *
     * @param displayActualTemperature
     *            the new display actual temperature
     */
    public void setDisplayActualTemperature(boolean displayActualTemperature) {
        this.displayActualTemperature = displayActualTemperature;
    }

}
