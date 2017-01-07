package develop.moritz.datamodel;

import javax.xml.bind.annotation.XmlElement;

/**
 * The Class Device.
 */
public class Device {

    /** The radio address. */
    private int radioAddress;

    /** The serial number. */
    private String serialNumber;

    /** The device type. */
    private String deviceType;

    /** The state. */
    @XmlElement(name = "state")
    private DeviceState state;

    /** The state info. */
    private String stateInfo;

    /** The name. */
    private String name;

    /** The radio state. */
    private String radioState;

    /**
     * Gets the radio address.
     *
     * @return the radio address
     */
    public int getRadioAddress() {
        return this.radioAddress;
    }

    /**
     * Sets the radio address.
     *
     * @param radioAddress
     *            the new radio address
     */
    public void setRadioAddress(int radioAddress) {
        this.radioAddress = radioAddress;
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
     * Gets the device type.
     *
     * @return the device type
     */
    public String getDeviceType() {
        return this.deviceType;
    }

    /**
     * Sets the device type.
     *
     * @param deviceType
     *            the new device type
     */
    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    /**
     * Gets the state.
     *
     * @return the state
     */
    public DeviceState getState() {
        return this.state;
    }

    /**
     * Sets the state.
     *
     * @param state
     *            the new state
     */
    public void setState(DeviceState state) {
        this.state = state;
    }

    /**
     * Gets the state info.
     *
     * @return the state info
     */
    public String getStateInfo() {
        return this.stateInfo;
    }

    /**
     * Sets the state info.
     *
     * @param stateInfo
     *            the new state info
     */
    public void setStateInfo(String stateInfo) {
        this.stateInfo = stateInfo;
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
     * Gets the radio state.
     *
     * @return the radio state
     */
    public String getRadioState() {
        return this.radioState;
    }

    /**
     * Sets the radio state.
     *
     * @param radioState
     *            the new radio state
     */
    public void setRadioState(String radioState) {
        this.radioState = radioState;
    }

}
