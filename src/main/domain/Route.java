package main.domain;

import java.util.List;

/**
 * @author Andre Perkins (Fuzz).
 *
 * Represents one instance of a {@link Line}.
 */
public class Route {
    final private List<String> timeStamps;
    final private DayOfWeek scheduleDay;

    public Route(List<String> timeStamps, DayOfWeek scheduleDay) {
        this.timeStamps = timeStamps;
        this.scheduleDay = scheduleDay;
    }

    public DayOfWeek getDayOfWeek() {
        return scheduleDay;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Route route = (Route) o;

        if (timeStamps != null ? !timeStamps.equals(route.timeStamps) : route.timeStamps != null) return false;
        return scheduleDay == route.scheduleDay;

    }

    @Override
    public int hashCode() {
        int result = timeStamps != null ? timeStamps.hashCode() : 0;
        result = 31 * result + (scheduleDay != null ? scheduleDay.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Route{" +
                "timeStamps=" + timeStamps +
                ", scheduleDay=" + scheduleDay +
                '}';
    }
}