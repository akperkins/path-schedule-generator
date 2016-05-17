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
    @SerializedName("0")
    WEEKDAY(0),
    @SerializedName("1")
    SATURDAY(1),
    @SerializedName("2")
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
}
