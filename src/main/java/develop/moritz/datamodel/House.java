package develop.moritz.datamodel;

import java.util.List;

/**
 * The Class House.
 */
public class House {

    /** The id. */
    private int id;

    /** The devices. */
    private List<Device> devices;

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

}
