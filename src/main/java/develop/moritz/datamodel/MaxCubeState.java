package develop.moritz.datamodel;

import java.util.List;

/**
 * The Class MaxCubeState.
 */
public class MaxCubeState {

    /** The house. */
    private House house;

    /** The cube last ping. */
    private CubeLastPing cubeLastPing;

    /** The daylight saving. */
    private boolean daylightSaving;

    /** The push button configuration. */
    private PushButtonConfiguration pushButtonConfiguration;

    /** The serial number. */
    private String serialNumber;

    /** The firmware version. */
    private int firmwareVersion;

    /** The rf address. */
    private int rfAddress;

    /** The rooms. */
    private List<Room> rooms;

    /** The cube date. */
    private String cubeDate;

    /** The state cube time. */
    private int stateCubeTime;

    /** The ntpcounter. */
    private int ntpcounter;

    /**
     * Gets the house.
     *
     * @return the house
     */
    public House getHouse() {
        return this.house;
    }

    /**
     * Sets the house.
     *
     * @param house
     *            the new house
     */
    public void setHouse(House house) {
        this.house = house;
    }

    /**
     * Gets the cube last ping.
     *
     * @return the cube last ping
     */
    public CubeLastPing getCubeLastPing() {
        return this.cubeLastPing;
    }

    /**
     * Sets the cube last ping.
     *
     * @param cubeLastPing
     *            the new cube last ping
     */
    public void setCubeLastPing(CubeLastPing cubeLastPing) {
        this.cubeLastPing = cubeLastPing;
    }

    /**
     * Checks if is daylight saving.
     *
     * @return true, if is daylight saving
     */
    public boolean isDaylightSaving() {
        return this.daylightSaving;
    }

    /**
     * Sets the daylight saving.
     *
     * @param daylightSaving
     *            the new daylight saving
     */
    public void setDaylightSaving(boolean daylightSaving) {
        this.daylightSaving = daylightSaving;
    }

    /**
     * Gets the push button configuration.
     *
     * @return the push button configuration
     */
    public PushButtonConfiguration getPushButtonConfiguration() {
        return this.pushButtonConfiguration;
    }

    /**
     * Sets the push button configuration.
     *
     * @param pushButtonConfiguration
     *            the new push button configuration
     */
    public void setPushButtonConfiguration(PushButtonConfiguration pushButtonConfiguration) {
        this.pushButtonConfiguration = pushButtonConfiguration;
    }

    /**
     * Gets the serial number.
     *
     * @return the serial number
     */
    public String getSerialNumber() {
        return this.serialNumber;
    }

    /**
     * Sets the serial number.
     *
     * @param serialNumber
     *            the new serial number
     */
    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    /**
     * Gets the firmware version.
     *
     * @return the firmware version
     */
    public int getFirmwareVersion() {
        return this.firmwareVersion;
    }

    /**
     * Sets the firmware version.
     *
     * @param firmwareVersion
     *            the new firmware version
     */
    public void setFirmwareVersion(int firmwareVersion) {
        this.firmwareVersion = firmwareVersion;
    }

    /**
     * Gets the rf address.
     *
     * @return the rf address
     */
    public int getRfAddress() {
        return this.rfAddress;
    }

    /**
     * Sets the rf address.
     *
     * @param rfAddress
     *            the new rf address
     */
    public void setRfAddress(int rfAddress) {
        this.rfAddress = rfAddress;
    }

    /**
     * Gets the rooms.
     *
     * @return the rooms
     */
    public List<Room> getRooms() {
        return this.rooms;
    }

    /**
     * Sets the rooms.
     *
     * @param rooms
     *            the new rooms
     */
    public void setRooms(List<Room> rooms) {
        this.rooms = rooms;
    }

    /**
     * Gets the cube date.
     *
     * @return the cube date
     */
    public String getCubeDate() {
        return this.cubeDate;
    }

    /**
     * Sets the cube date.
     *
     * @param cubeDate
     *            the new cube date
     */
    public void setCubeDate(String cubeDate) {
        this.cubeDate = cubeDate;
    }

    /**
     * Gets the state cube time.
     *
     * @return the state cube time
     */
    public int getStateCubeTime() {
        return this.stateCubeTime;
    }

    /**
     * Sets the state cube time.
     *
     * @param stateCubeTime
     *            the new state cube time
     */
    public void setStateCubeTime(int stateCubeTime) {
        this.stateCubeTime = stateCubeTime;
    }

    /**
     * Gets the ntpcounter.
     *
     * @return the ntpcounter
     */
    public int getNtpcounter() {
        return this.ntpcounter;
    }

    /**
     * Sets the ntpcounter.
     *
     * @param ntpcounter
     *            the new ntpcounter
     */
    public void setNtpcounter(int ntpcounter) {
        this.ntpcounter = ntpcounter;
    }

}
