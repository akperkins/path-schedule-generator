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
    WEEKDAY(0),
    @SerializedName("saturday")
    SATURDAY(1),
    @SerializedName("sunday")
    SUNDAY(2);

    /**
     * Contains the order in which the days should be sorted.
     */
    final private int order;

    DayOfWeek(int order) {
        this.order = order;
    }

    public int getOrder() {
        return order;
    }

    public static DayOfWeek convert(String dayOfWeekString) {
        return Enum.valueOf(DayOfWeek.class, dayOfWeekString);
    }
}
