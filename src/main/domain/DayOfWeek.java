package main.domain;
import com.google.gson.annotations.SerializedName;

/**
 * @author Andre Perkins (Fuzz).
 *
 * This enum is responsible for illustrating the different days of the week for different
 * {@link Route}.
 *
 */
public enum DayOfWeek {
    @SerializedName("weekday")
    WEEKDAY(0, "weekday"),
    @SerializedName("saturday")
    SATURDAY(1, "saturday"),
    @SerializedName("sunday")
    SUNDAY(2, "sunday");

    /**
     * Contains the order in which the days should be sorted.
     */
    final private int order;

    /**
     * Contains the name the field will be serialized to.
     */
    final private String serializedName;

    DayOfWeek(int order, String serializedName) {
        this.order = order;
        this.serializedName = serializedName;
    }

    public int getOrder() {
        return order;
    }

    public static DayOfWeek convert(String dayOfWeekString) {
        for(DayOfWeek day: values())
        if(day.serializedName.equalsIgnoreCase(dayOfWeekString)){
            return day;
        }
        throw new IllegalArgumentException(String.format("Unable to find DayOfWeek associated with string=%s",
                dayOfWeekString));
    }
}
