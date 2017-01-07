package develop.moritz.datamodel;

import java.util.List;

/**
 * The Class WeekTemperatureProfile.
 */
public class WeekTemperatureProfile {

    /** The day temperature profiles. */
    private List<DayTemperatureProfile> dayTemperatureProfiles;

    /**
     * Gets the day temperature profiles.
     *
     * @return the day temperature profiles
     */
    public List<DayTemperatureProfile> getDayTemperatureProfiles() {
        return this.dayTemperatureProfiles;
    }

    /**
     * Sets the day temperature profiles.
     *
     * @param dayTemperatureProfiles
     *            the new day temperature profiles
     */
    public void setDayTemperatureProfiles(List<DayTemperatureProfile> dayTemperatureProfiles) {
        this.dayTemperatureProfiles = dayTemperatureProfiles;
    }
}
