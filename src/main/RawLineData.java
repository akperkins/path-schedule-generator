package main;

import java.util.List;

/**
 * Created by andreperkins on 5/17/16.
 *
 * This class represents the information for a line right before we serialize it to json.
 */
public class RawLineData {
    final private String name;
    final private List<String> stops;
    final private List<List<String>> routes;


    public RawLineData(String name, List<String> stops, List<List<String>> routes) {
        this.name = name;
        this.stops = stops;
        this.routes = routes;
    }

    public String getName() {
        return name;
    }

    public List<String> getStops() {
        return stops;
    }

    public List<List<String>> getRoutes() {
        return routes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RawLineData that = (RawLineData) o;

        if (getName() != null ? !getName().equals(that.getName()) : that.getName() != null) return false;
        if (getStops() != null ? !getStops().equals(that.getStops()) : that.getStops() != null) return false;
        return getRoutes() != null ? getRoutes().equals(that.getRoutes()) : that.getRoutes() == null;

    }

    @Override
    public int hashCode() {
        int result = getName() != null ? getName().hashCode() : 0;
        result = 31 * result + (getStops() != null ? getStops().hashCode() : 0);
        result = 31 * result + (getRoutes() != null ? getRoutes().hashCode() : 0);
        return result;
    }
}
