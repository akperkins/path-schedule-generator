package main.domain;
import java.util.List;

/**
 * @author Andre Perkins (Fuzz).
 *
 * Represents a collection of {@link TrainStop}s that represent a {@link Route}.
 */
public class Line {
    private static final String DEFAULT = "default";
    final private String name;
    /**
     * Contains the list for this particular train in the order in which they occurr.
     */
    final private List<TrainStop> trainStops;
    /**
     * Contains all the various times a train will come for a Trainstop.
     */
    final private List<Route> routes;

    public Line(String name, List<TrainStop> trainStops, List<Route> routes) {
        this.name = name;
        this.trainStops = trainStops;
        this.routes = routes;
    }

    /**
     * Adds this stop as the next stop in the list.
     *
     */
    public void addNextStop(TrainStop trainStop) {
        trainStops.add(trainStop);
    }

    public List<TrainStop> getStops() {
        return trainStops;
    }

    /**
     * Adds this route as the next route in the list.
     *
     */
    public void addRoute(Route route) {
        routes.add(route);
    }

    public List<Route> getRoutes() {
        return routes;
    }

    /**
     *
     * Returns true if this line has a valid connection to the starting and final destinations.
     */
    public boolean hasConnection(TrainStop startingDestination, TrainStop finalDestination) {
        boolean foundStartingDestination = false;
        for(TrainStop current: trainStops){
            if(startingDestination == current){
                foundStartingDestination = true;
            }
            if(finalDestination == current){
                return foundStartingDestination;
            }
        }
        return false;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Line line = (Line) o;

        if (getName() != null ? !getName().equals(line.getName()) : line.getName() != null) return false;
        if (trainStops != null ? !trainStops.equals(line.trainStops) : line.trainStops != null) return false;
        return getRoutes() != null ? getRoutes().equals(line.getRoutes()) : line.getRoutes() == null;

    }

    @Override
    public int hashCode() {
        int result = getName() != null ? getName().hashCode() : 0;
        result = 31 * result + (trainStops != null ? trainStops.hashCode() : 0);
        result = 31 * result + (getRoutes() != null ? getRoutes().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Line{" +
                "name='" + name + '\'' +
                ", trainStops=" + trainStops +
                ", routes=" + routes +
                '}';
    }
}
