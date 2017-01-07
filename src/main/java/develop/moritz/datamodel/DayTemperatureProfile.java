package develop.moritz.datamodel;

import java.util.List;

/**
 * The Class DayTemperatureProfile.
 */
public class DayTemperatureProfile {

    /** The switch points. */
    private List<SwitchPoint> switchPoints;

    /** The day of week. */
    private String dayOfWeek;

    /**
     * Gets the switch points.
     *
     * @return the switch points
     */
    public List<SwitchPoint> getSwitchPoints() {
        return this.switchPoints;
    }

    /**
     * Sets the switch points.
     *
     * @param switchPoints
     *            the new switch points
     */
    public void setSwitchPoints(List<SwitchPoint> switchPoints) {
        this.switchPoints = switchPoints;
    }

    /**
     * Gets the day of week.
     *
     * @return the day of week
     */
    public String getDayOfWeek() {
        return this.dayOfWeek;
    }

    /**
     * Sets the day of week.
     *
     * @param dayOfWeek
     *            the new day of week
     */
    public void setDayOfWeek(String dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

}
