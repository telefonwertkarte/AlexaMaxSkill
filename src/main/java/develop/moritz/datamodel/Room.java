package develop.moritz.datamodel;

import java.util.List;

/**
 * The Class Room.
 */
public class Room {

    /** The id. */
    private int id;

    /** The order. */
    private int order;

    /** The name. */
    private String name;

    /** The devices. */
    private List<Device> devices;

    /** The week temperature profile. */
    private WeekTemperatureProfile weekTemperatureProfile;

    /** The set point temperature valid. */
    private boolean setPointTemperatureValid;

    /** The set point temperature. */
    private double setPointTemperature;

    /** The current auto temperature. */
    private double currentAutoTemperature;

    /** The actual temperature. */
    private double actualTemperature;

    /** The eco temperature. */
    private double ecoTemperature;

    /** The comfort temperature. */
    private double comfortTemperature;

    /** The maximum temperature. */
    private double maximumTemperature;

    /** The window open temperature. */
    private double windowOpenTemperature;

    /** The window open duration. */
    private int windowOpenDuration;

    /** The boost duration. */
    private int boostDuration;

    /** The boost valve angle. */
    private int boostValveAngle;

    /** The Decalcification day. */
    private String DecalcificationDay;

    /** The Decalcification hour. */
    private int DecalcificationHour;

    /** The temporary mode stop date. */
    private String temporaryModeStopDate;

    /** The control mode. */
    private String controlMode;

    /** The temperature mode. */
    private String temperatureMode;

    /** The state dirty. */
    private boolean stateDirty;

    /** The state changed. */
    private boolean stateChanged;

    /** The maximum no of heating thermostats. */
    private int maximumNoOfHeatingThermostats;

    /** The maximum no of wall mounted thermostats. */
    private int maximumNoOfWallMountedThermostats;

    /** The maximum no of shutter contacts. */
    private int maximumNoOfShutterContacts;

    /** The temperature controllable. */
    private boolean temperatureControllable;

    /**
     * Gets the id.
     *
     * @return the id
     */
    public int getId() {
        return this.id;
    }

    /**
     * Sets the id.
     *
     * @param id
     *            the new id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Gets the order.
     *
     * @return the order
     */
    public int getOrder() {
        return this.order;
    }

    /**
     * Sets the order.
     *
     * @param order
     *            the new order
     */
    public void setOrder(int order) {
        this.order = order;
    }

    /**
     * Gets the name.
     *
     * @return the name
     */
    public String getName() {
        return this.name;
    }

    /**
     * Sets the name.
     *
     * @param name
     *            the new name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the devices.
     *
     * @return the devices
     */
    public List<Device> getDevices() {
        return this.devices;
    }

    /**
     * Sets the devices.
     *
     * @param devices
     *            the new devices
     */
    public void setDevices(List<Device> devices) {
        this.devices = devices;
    }

    /**
     * Gets the week temperature profile.
     *
     * @return the week temperature profile
     */
    public WeekTemperatureProfile getWeekTemperatureProfile() {
        return this.weekTemperatureProfile;
    }

    /**
     * Sets the week temperature profile.
     *
     * @param weekTemperatureProfile
     *            the new week temperature profile
     */
    public void setWeekTemperatureProfile(WeekTemperatureProfile weekTemperatureProfile) {
        this.weekTemperatureProfile = weekTemperatureProfile;
    }

    /**
     * Checks if is sets the point temperature valid.
     *
     * @return true, if is sets the point temperature valid
     */
    public boolean isSetPointTemperatureValid() {
        return this.setPointTemperatureValid;
    }

    /**
     * Sets the sets the point temperature valid.
     *
     * @param setPointTemperatureValid
     *            the new sets the point temperature valid
     */
    public void setSetPointTemperatureValid(boolean setPointTemperatureValid) {
        this.setPointTemperatureValid = setPointTemperatureValid;
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
     * Gets the current auto temperature.
     *
     * @return the current auto temperature
     */
    public double getCurrentAutoTemperature() {
        return this.currentAutoTemperature;
    }

    /**
     * Sets the current auto temperature.
     *
     * @param currentAutoTemperature
     *            the new current auto temperature
     */
    public void setCurrentAutoTemperature(double currentAutoTemperature) {
        this.currentAutoTemperature = currentAutoTemperature;
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
     * Gets the eco temperature.
     *
     * @return the eco temperature
     */
    public double getEcoTemperature() {
        return this.ecoTemperature;
    }

    /**
     * Sets the eco temperature.
     *
     * @param ecoTemperature
     *            the new eco temperature
     */
    public void setEcoTemperature(double ecoTemperature) {
        this.ecoTemperature = ecoTemperature;
    }

    /**
     * Gets the comfort temperature.
     *
     * @return the comfort temperature
     */
    public double getComfortTemperature() {
        return this.comfortTemperature;
    }

    /**
     * Sets the comfort temperature.
     *
     * @param comfortTemperature
     *            the new comfort temperature
     */
    public void setComfortTemperature(double comfortTemperature) {
        this.comfortTemperature = comfortTemperature;
    }

    /**
     * Gets the maximum temperature.
     *
     * @return the maximum temperature
     */
    public double getMaximumTemperature() {
        return this.maximumTemperature;
    }

    /**
     * Sets the maximum temperature.
     *
     * @param maximumTemperature
     *            the new maximum temperature
     */
    public void setMaximumTemperature(double maximumTemperature) {
        this.maximumTemperature = maximumTemperature;
    }

    /**
     * Gets the window open temperature.
     *
     * @return the window open temperature
     */
    public double getWindowOpenTemperature() {
        return this.windowOpenTemperature;
    }

    /**
     * Sets the window open temperature.
     *
     * @param windowOpenTemperature
     *            the new window open temperature
     */
    public void setWindowOpenTemperature(double windowOpenTemperature) {
        this.windowOpenTemperature = windowOpenTemperature;
    }

    /**
     * Gets the window open duration.
     *
     * @return the window open duration
     */
    public int getWindowOpenDuration() {
        return this.windowOpenDuration;
    }

    /**
     * Sets the window open duration.
     *
     * @param windowOpenDuration
     *            the new window open duration
     */
    public void setWindowOpenDuration(int windowOpenDuration) {
        this.windowOpenDuration = windowOpenDuration;
    }

    /**
     * Gets the boost duration.
     *
     * @return the boost duration
     */
    public int getBoostDuration() {
        return this.boostDuration;
    }

    /**
     * Sets the boost duration.
     *
     * @param boostDuration
     *            the new boost duration
     */
    public void setBoostDuration(int boostDuration) {
        this.boostDuration = boostDuration;
    }

    /**
     * Gets the boost valve angle.
     *
     * @return the boost valve angle
     */
    public int getBoostValveAngle() {
        return this.boostValveAngle;
    }

    /**
     * Sets the boost valve angle.
     *
     * @param boostValveAngle
     *            the new boost valve angle
     */
    public void setBoostValveAngle(int boostValveAngle) {
        this.boostValveAngle = boostValveAngle;
    }

    /**
     * Gets the decalcification day.
     *
     * @return the decalcification day
     */
    public String getDecalcificationDay() {
        return this.DecalcificationDay;
    }

    /**
     * Sets the decalcification day.
     *
     * @param decalcificationDay
     *            the new decalcification day
     */
    public void setDecalcificationDay(String decalcificationDay) {
        this.DecalcificationDay = decalcificationDay;
    }

    /**
     * Gets the decalcification hour.
     *
     * @return the decalcification hour
     */
    public int getDecalcificationHour() {
        return this.DecalcificationHour;
    }

    /**
     * Sets the decalcification hour.
     *
     * @param decalcificationHour
     *            the new decalcification hour
     */
    public void setDecalcificationHour(int decalcificationHour) {
        this.DecalcificationHour = decalcificationHour;
    }

    /**
     * Gets the temporary mode stop date.
     *
     * @return the temporary mode stop date
     */
    public String getTemporaryModeStopDate() {
        return this.temporaryModeStopDate;
    }

    /**
     * Sets the temporary mode stop date.
     *
     * @param temporaryModeStopDate
     *            the new temporary mode stop date
     */
    public void setTemporaryModeStopDate(String temporaryModeStopDate) {
        this.temporaryModeStopDate = temporaryModeStopDate;
    }

    /**
     * Gets the control mode.
     *
     * @return the control mode
     */
    public String getControlMode() {
        return this.controlMode;
    }

    /**
     * Sets the control mode.
     *
     * @param controlMode
     *            the new control mode
     */
    public void setControlMode(String controlMode) {
        this.controlMode = controlMode;
    }

    /**
     * Gets the temperature mode.
     *
     * @return the temperature mode
     */
    public String getTemperatureMode() {
        return this.temperatureMode;
    }

    /**
     * Sets the temperature mode.
     *
     * @param temperatureMode
     *            the new temperature mode
     */
    public void setTemperatureMode(String temperatureMode) {
        this.temperatureMode = temperatureMode;
    }

    /**
     * Checks if is state dirty.
     *
     * @return true, if is state dirty
     */
    public boolean isStateDirty() {
        return this.stateDirty;
    }

    /**
     * Sets the state dirty.
     *
     * @param stateDirty
     *            the new state dirty
     */
    public void setStateDirty(boolean stateDirty) {
        this.stateDirty = stateDirty;
    }

    /**
     * Checks if is state changed.
     *
     * @return true, if is state changed
     */
    public boolean isStateChanged() {
        return this.stateChanged;
    }

    /**
     * Sets the state changed.
     *
     * @param stateChanged
     *            the new state changed
     */
    public void setStateChanged(boolean stateChanged) {
        this.stateChanged = stateChanged;
    }

    /**
     * Gets the maximum no of heating thermostats.
     *
     * @return the maximum no of heating thermostats
     */
    public int getMaximumNoOfHeatingThermostats() {
        return this.maximumNoOfHeatingThermostats;
    }

    /**
     * Sets the maximum no of heating thermostats.
     *
     * @param maximumNoOfHeatingThermostats
     *            the new maximum no of heating thermostats
     */
    public void setMaximumNoOfHeatingThermostats(int maximumNoOfHeatingThermostats) {
        this.maximumNoOfHeatingThermostats = maximumNoOfHeatingThermostats;
    }

    /**
     * Gets the maximum no of wall mounted thermostats.
     *
     * @return the maximum no of wall mounted thermostats
     */
    public int getMaximumNoOfWallMountedThermostats() {
        return this.maximumNoOfWallMountedThermostats;
    }

    /**
     * Sets the maximum no of wall mounted thermostats.
     *
     * @param maximumNoOfWallMountedThermostats
     *            the new maximum no of wall mounted thermostats
     */
    public void setMaximumNoOfWallMountedThermostats(int maximumNoOfWallMountedThermostats) {
        this.maximumNoOfWallMountedThermostats = maximumNoOfWallMountedThermostats;
    }

    /**
     * Gets the maximum no of shutter contacts.
     *
     * @return the maximum no of shutter contacts
     */
    public int getMaximumNoOfShutterContacts() {
        return this.maximumNoOfShutterContacts;
    }

    /**
     * Sets the maximum no of shutter contacts.
     *
     * @param maximumNoOfShutterContacts
     *            the new maximum no of shutter contacts
     */
    public void setMaximumNoOfShutterContacts(int maximumNoOfShutterContacts) {
        this.maximumNoOfShutterContacts = maximumNoOfShutterContacts;
    }

    /**
     * Checks if is temperature controllable.
     *
     * @return true, if is temperature controllable
     */
    public boolean isTemperatureControllable() {
        return this.temperatureControllable;
    }

    /**
     * Sets the temperature controllable.
     *
     * @param temperatureControllable
     *            the new temperature controllable
     */
    public void setTemperatureControllable(boolean temperatureControllable) {
        this.temperatureControllable = temperatureControllable;
    }

}
