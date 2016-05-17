package main;

/**
 * Created by andreperkins on 5/17/16.
 */
public class ObjectMother {
    public static final String VALID_WEEKDAY_HTML = "\n" +
            "<!DOCTYPE html>\n" +
            "<html lang=\"en\">\n" +
            "<head>\n" +
            "<meta charset=\"utf-8\" />\n" +
            "<title>PATH Timetable | 33rd Street - Hoboken | Weekday Service</title>\n" +
            "<link rel=\"stylesheet\" type=\"text/css\" href=\"/css/new.css\"/>\n" +
            "<link rel=\"stylesheet\" type=\"text/css\" href=\"/css/path_schedules.css\"/>\n" +
            "</head>\n" +
            "<body>\n" +
            "<h2>33rd Street - Hoboken | Weekday Service</h2>\n" +
            "<p class=\"style13\">Travel time is 14 minutes. </p>\n" +
            "<table cellspacing=\"0\" cellpadding=\"0\">\n" +
            "  <thead>\n" +
            "    <tr class=\"depArr\">\n" +
            "      <th>Depart</th>\n" +
            "      <th colspan=\"4\">&nbsp;</th>\n" +
            "      <th>Arrive</th>\n" +
            "    </tr>\n" +
            "    <tr class=\"stops\">\n" +
            "      <th width=\"16%\">33 St</th>\n" +
            "      <th width=\"16%\">23 St</th>\n" +
            "      <th width=\"16%\">14 St</th>\n" +
            "      <th width=\"16%\">9 St</th>\n" +
            "      <th width=\"16%\">Chris St</th>\n" +
            "      <th width=\"16%\">Hoboken</th>\n" +
            "    </tr>\n" +
            "  </thead>\n" +
            "  <tbody>\n" +
            "    <tr>\n" +
            "      <td>6:30AM</td>\n" +
            "      <td>6:32AM</td>\n" +
            "    </tr>\n" +
            "    <tr>\n" +
            "      <td>11:58AM</td>\n" +
            "      <td><strong>12:06PM</strong></td>\n" +
            "    </tr>\n" +
            "    <tr>\n" +
            "      <td><strong>12:02PM</strong></td>\n" +
            "      <td><strong>12:04PM</strong></td>\n" +
            "    </tr>\n" +
            "  </tbody>\n" +
            "</table>\n" +
            "<p class=\"style9\">Bolded times denote PM hours. </p>\n" +
            "<p class=\"style9\">Effective May 1, 2016.</p>\n" +
            "<p id=\"backtosched\"><a href=\"/path/schedule.html\">Back to Schedules</a></p>\n" +
            "<script type=\"text/javascript\" src=\"//ajax.googleapis.com/ajax/libs/jquery/1.4.4/jquery.min.js\"></script> \n" +
            "<script type=\"text/javascript\">!window.jQuery && document.write('<script type=\"text/javascript\" src=\"/js/jquery.js\"><\\/script>')</script> \n" +
            "<script>\n" +
            "$(document).ready(function() {\n" +
            "  $('table tr:odd').addClass('odd');\n" +
            "});\n" +
            "</script>\n" +
            "</body>\n" +
            "</html>\n";
    public static final String VALID_SATURDAY_HTML = "\n" +
            "<!DOCTYPE html>\n" +
            "<html lang=\"en\">\n" +
            "<head>\n" +
            "<meta charset=\"utf-8\" />\n" +
            "<title>PATH Timetable | 33rd Street - Hoboken | Saturday Service</title>\n" +
            "<link rel=\"stylesheet\" type=\"text/css\" href=\"/css/new.css\"/>\n" +
            "<link rel=\"stylesheet\" type=\"text/css\" href=\"/css/path_schedules.css\"/>\n" +
            "</head>\n" +
            "<body>\n" +
            "<h2>33rd Street - Hoboken | Saturday Service</h2>\n" +
            "<p class=\"style13\">Travel time is 14 minutes. </p>\n" +
            "<table cellspacing=\"0\" cellpadding=\"0\">\n" +
            "  <thead>\n" +
            "    <tr class=\"depArr\">\n" +
            "      <th>Depart</th>\n" +
            "      <th colspan=\"4\">&nbsp;</th>\n" +
            "      <th>Arrive</th>\n" +
            "    </tr>\n" +
            "    <tr class=\"stops\">\n" +
            "      <th width=\"16%\">33 St</th>\n" +
            "      <th width=\"16%\">23 St</th>\n" +
            "      <th width=\"16%\">14 St</th>\n" +
            "      <th width=\"16%\">9 St</th>\n" +
            "      <th width=\"16%\">Chris St</th>\n" +
            "      <th width=\"16%\">Hoboken</th>\n" +
            "    </tr>\n" +
            "  </thead>\n" +
            "  <tbody>\n" +
            "    <tr>\n" +
            "      <td>6:30AM</td>\n" +
            "      <td>6:32AM</td>\n" +
            "    </tr>\n" +
            "    <tr>\n" +
            "      <td>11:58AM</td>\n" +
            "      <td><strong>12:06PM</strong></td>\n" +
            "    </tr>\n" +
            "    <tr>\n" +
            "      <td><strong>12:02PM</strong></td>\n" +
            "      <td><strong>12:04PM</strong></td>\n" +
            "    </tr>\n" +
            "  </tbody>\n" +
            "</table>\n" +
            "<p class=\"style9\">Bolded times denote PM hours. </p>\n" +
            "<p class=\"style9\">Effective May 1, 2016.</p>\n" +
            "<p id=\"backtosched\"><a href=\"/path/schedule.html\">Back to Schedules</a></p>\n" +
            "<script type=\"text/javascript\" src=\"//ajax.googleapis.com/ajax/libs/jquery/1.4.4/jquery.min.js\"></script> \n" +
            "<script type=\"text/javascript\">!window.jQuery && document.write('<script type=\"text/javascript\" src=\"/js/jquery.js\"><\\/script>')</script> \n" +
            "<script>\n" +
            "$(document).ready(function() {\n" +
            "  $('table tr:odd').addClass('odd');\n" +
            "});\n" +
            "</script>\n" +
            "</body>\n" +
            "</html>\n";
    public static final String VALID_SUNDAY_HTML = "\n" +
            "<!DOCTYPE html>\n" +
            "<html lang=\"en\">\n" +
            "<head>\n" +
            "<meta charset=\"utf-8\" />\n" +
            "<title>PATH Timetable | 33rd Street - Hoboken | Sunday Service</title>\n" +
            "<link rel=\"stylesheet\" type=\"text/css\" href=\"/css/new.css\"/>\n" +
            "<link rel=\"stylesheet\" type=\"text/css\" href=\"/css/path_schedules.css\"/>\n" +
            "</head>\n" +
            "<body>\n" +
            "<h2>33rd Street - Hoboken | Sunday Service</h2>\n" +
            "<p class=\"style13\">Travel time is 14 minutes. </p>\n" +
            "<table cellspacing=\"0\" cellpadding=\"0\">\n" +
            "  <thead>\n" +
            "    <tr class=\"depArr\">\n" +
            "      <th>Depart</th>\n" +
            "      <th colspan=\"4\">&nbsp;</th>\n" +
            "      <th>Arrive</th>\n" +
            "    </tr>\n" +
            "    <tr class=\"stops\">\n" +
            "      <th width=\"16%\">33 St</th>\n" +
            "      <th width=\"16%\">23 St</th>\n" +
            "      <th width=\"16%\">14 St</th>\n" +
            "      <th width=\"16%\">9 St</th>\n" +
            "      <th width=\"16%\">Chris St</th>\n" +
            "      <th width=\"16%\">Hoboken</th>\n" +
            "    </tr>\n" +
            "  </thead>\n" +
            "  <tbody>\n" +
            "    <tr>\n" +
            "      <td>6:30AM</td>\n" +
            "      <td>6:32AM</td>\n" +
            "    </tr>\n" +
            "    <tr>\n" +
            "      <td>11:58AM</td>\n" +
            "      <td><strong>12:06PM</strong></td>\n" +
            "    </tr>\n" +
            "    <tr>\n" +
            "      <td><strong>12:02PM</strong></td>\n" +
            "      <td><strong>12:04PM</strong></td>\n" +
            "    </tr>\n" +
            "  </tbody>\n" +
            "</table>\n" +
            "<p class=\"style9\">Bolded times denote PM hours. </p>\n" +
            "<p class=\"style9\">Effective May 1, 2016.</p>\n" +
            "<p id=\"backtosched\"><a href=\"/path/schedule.html\">Back to Schedules</a></p>\n" +
            "<script type=\"text/javascript\" src=\"//ajax.googleapis.com/ajax/libs/jquery/1.4.4/jquery.min.js\"></script> \n" +
            "<script type=\"text/javascript\">!window.jQuery && document.write('<script type=\"text/javascript\" src=\"/js/jquery.js\"><\\/script>')</script> \n" +
            "<script>\n" +
            "$(document).ready(function() {\n" +
            "  $('table tr:odd').addClass('odd');\n" +
            "});\n" +
            "</script>\n" +
            "</body>\n" +
            "</html>\n";
    public static final String HTML_THAT_IS_MISSING_H2_TAG_STOPS_AND_ROUTES = "<html lang=\"en\">\n" +
            "<head>\n" +
            "<meta charset=\"utf-8\" />\n" +
            "<title>PATH Timetable | 33rd Street - Hoboken | Weekday Service</title>\n" +
            "<link rel=\"stylesheet\" type=\"text/css\" href=\"/css/new.css\"/>\n" +
            "<link rel=\"stylesheet\" type=\"text/css\" href=\"/css/path_schedules.css\"/>\n" +
            "</head>\n" +
            "<body>\n" +
            "<p class=\"style13\">Travel time is 14 minutes. </p></body>\n" +
            "</html>";
    public static final String HTML_THAT_IS_MISSING_STOPS_AND_ROUTES = "\n" +
            "<!DOCTYPE html>\n" +
            "<html lang=\"en\">\n" +
            "<head>\n" +
            "<meta charset=\"utf-8\" />\n" +
            "<title>PATH Timetable | 33rd Street - Hoboken | Weekday Service</title>\n" +
            "<link rel=\"stylesheet\" type=\"text/css\" href=\"/css/new.css\"/>\n" +
            "<link rel=\"stylesheet\" type=\"text/css\" href=\"/css/path_schedules.css\"/>\n" +
            "</head>\n" +
            "<body>\n" +
            "<h2>33rd Street - Hoboken | Weekday Service</h2>\n" +
            "<p class=\"style13\">Travel time is 14 minutes. </p>\n" +
            "<table cellspacing=\"0\" cellpadding=\"0\">\n" +
            "</table>\n" +
            "<p class=\"style9\">Bolded times denote PM hours. </p>\n" +
            "<p class=\"style9\">Effective May 1, 2016.</p>\n" +
            "<p id=\"backtosched\"><a href=\"/path/schedule.html\">Back to Schedules</a></p>\n" +
            "<script type=\"text/javascript\" src=\"//ajax.googleapis.com/ajax/libs/jquery/1.4.4/jquery.min.js\"></script> \n" +
            "<script type=\"text/javascript\">!window.jQuery && document.write('<script type=\"text/javascript\" src=\"/js/jquery.js\"><\\/script>')</script> \n" +
            "<script>\n" +
            "$(document).ready(function() {\n" +
            "  $('table tr:odd').addClass('odd');\n" +
            "});\n" +
            "</script>\n" +
            "</body>\n" +
            "</html>\n";
    public static final String HTML_THAT_IS_MISSING_ROUTES = "\n" +
            "<!DOCTYPE html>\n" +
            "<html lang=\"en\">\n" +
            "<head>\n" +
            "<meta charset=\"utf-8\" />\n" +
            "<title>PATH Timetable | 33rd Street - Hoboken | Weekday Service</title>\n" +
            "<link rel=\"stylesheet\" type=\"text/css\" href=\"/css/new.css\"/>\n" +
            "<link rel=\"stylesheet\" type=\"text/css\" href=\"/css/path_schedules.css\"/>\n" +
            "</head>\n" +
            "<body>\n" +
            "<h2>33rd Street - Hoboken | Weekday Service</h2>\n" +
            "<p class=\"style13\">Travel time is 14 minutes. </p>\n" +
            "<table cellspacing=\"0\" cellpadding=\"0\">\n" +
            "  <thead>\n" +
            "    <tr class=\"depArr\">\n" +
            "      <th>Depart</th>\n" +
            "      <th colspan=\"4\">&nbsp;</th>\n" +
            "      <th>Arrive</th>\n" +
            "    </tr>\n" +
            "    <tr class=\"stops\">\n" +
            "      <th width=\"16%\">33 St</th>\n" +
            "      <th width=\"16%\">23 St</th>\n" +
            "      <th width=\"16%\">14 St</th>\n" +
            "      <th width=\"16%\">9 St</th>\n" +
            "      <th width=\"16%\">Chris St</th>\n" +
            "      <th width=\"16%\">Hoboken</th>\n" +
            "    </tr>\n" +
            "  </thead>\n" +
            "</table>\n" +
            "<p class=\"style9\">Bolded times denote PM hours. </p>\n" +
            "<p class=\"style9\">Effective May 1, 2016.</p>\n" +
            "<p id=\"backtosched\"><a href=\"/path/schedule.html\">Back to Schedules</a></p>\n" +
            "<script type=\"text/javascript\" src=\"//ajax.googleapis.com/ajax/libs/jquery/1.4.4/jquery.min.js\"></script> \n" +
            "<script type=\"text/javascript\">!window.jQuery && document.write('<script type=\"text/javascript\" src=\"/js/jquery.js\"><\\/script>')</script> \n" +
            "<script>\n" +
            "$(document).ready(function() {\n" +
            "  $('table tr:odd').addClass('odd');\n" +
            "});\n" +
            "</script>\n" +
            "</body>\n" +
            "</html>\n";
}
