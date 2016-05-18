package main;

import main.domain.DayOfWeek;
import main.domain.Line;
import main.domain.Route;
import main.domain.TrainStop;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by andreperkins on 5/17/16.
 *
 * This class is responsible for reading through the current understanding of the PATH website format and then extracting
 * out the relevant Line information.
 */
public class JsoupParser implements SchedulerParser {

    public static final String NAME_TAG = "h2";
    public static final String STOPS_CLASS_NAME = "stops";
    public static final String TBODY_TAG_NAME = "tbody";
    public static final String STRONG_TAG = "strong";

    @Override
    public Line parse(String html) throws LineDataNotFoundException {
        Document document = Jsoup.parse(html);
        String name = getName(document);
        DayOfWeek dayOfWeek = getDayOfWeek(document);
        List<String> stopsStrings = getStops(document);
        List<TrainStop> trainStops = convertStops(stopsStrings);
        List<List<String>> routesStrings = getRoutes(document);
        List<Route> routes = convertTrainStops(dayOfWeek, routesStrings);
        return new Line(name, trainStops, routes);
    }

    private DayOfWeek getDayOfWeek(Document document) throws LineDataNotFoundException {
        int obtainIndexOfNameString = 1;
        String dayOfWeekString = getName(document, obtainIndexOfNameString);
        dayOfWeekString = dayOfWeekString.split(" ")[0].toUpperCase();
        DayOfWeek dayOfWeek = DayOfWeek.convert(dayOfWeekString);
        return dayOfWeek;
    }

    private List<Route> convertTrainStops(DayOfWeek dayOfWeek, List<List<String>> routesStrings) {
        List<Route> routes = new ArrayList<>();
        for(List<String> stringList: routesStrings){
            Route route = new Route(stringList, dayOfWeek);
            routes.add(route);
        }
        return routes;
    }

    private List<TrainStop> convertStops(List<String> stopsStrings) {
        List<TrainStop> trainStops = new ArrayList<>();
        for(String stopString: stopsStrings){
            TrainStop trainStop = TrainStop.convert(stopString);
            trainStops.add(trainStop);
        }
        return trainStops;
    }

    private List<List<String>> getRoutes(Document document) throws LineDataNotFoundException {
        List<List<String>> routes = new ArrayList<>();
        Elements tBodyElements = document.getElementsByTag(TBODY_TAG_NAME);
        if(tBodyElements.size() != 1){
            throw new LineDataNotFoundException("At the time of the creation of this program, it was expected that" +
                    " there was only one tbody tag. Please update this program" +
                    " to accommodate for the change that there was an unexpected number of stops classes.");
        }
        Element tableBodyElement = tBodyElements.get(0);
        for(Element tableRows: tableBodyElement.children()){
            List<String> newList = new ArrayList<>();
            for(Element tableData: tableRows.children()){
                Elements elementsWithStrongTag = tableData.getElementsByTag(STRONG_TAG);
                String timeStamp;
                if(elementsWithStrongTag.isEmpty()){
                    timeStamp = tableData.text();
                } else {
                    timeStamp =  elementsWithStrongTag.get(0).text();
                }
                newList.add(timeStamp);
            }
            routes.add(newList);
        }
        return routes;
    }

    private List<String> getStops(Document document) throws LineDataNotFoundException {
        Elements elements = document.getElementsByClass(STOPS_CLASS_NAME);
        if(elements.size() == 1){
            List<String> stops = new ArrayList<>();
            Element stopElement = elements.get(0);
            for(Element childStopElements: stopElement.children()){
                stops.add(childStopElements.text());
            }
            return stops;
        } else {
            throw new LineDataNotFoundException("At the time of the creation of this program, it was expected that" +
                    " there was only one stops classes. Please update this program" +
                    " to accommodate for the change that there was an unexpected number of stops classes.");
        }
    }

    private String getName(Document document) throws LineDataNotFoundException {
        Elements elements = document.getElementsByTag(NAME_TAG);
        if(elements.size() == 1){
            String header = elements.get(0).text();
            return header;
        } else {
            throw new LineDataNotFoundException("At the time of the creation of this program, it was expected that" +
                    " there was only one h2 tag. Please update this program" +
                    " to accommodate for the change that there was an unexpected number of h2 tags.");
        }
    }

    private String getName(Document document, int obtainIndexOfNameString) throws LineDataNotFoundException {
        String name;
        Elements elements = document.getElementsByTag(NAME_TAG);
        if(elements.size() == 1){
            String header = elements.get(0).text();
            name = header.split("\\|")[obtainIndexOfNameString].trim();
            name = name.replaceAll(",", "");
        } else {
            throw new LineDataNotFoundException("At the time of the creation of this program, it was expected that" +
                    " there was only one h2 tag. Please update this program" +
                    " to accommodate for the change that there was an unexpected number of h2 tags.");
        }
        return name;
    }
}
