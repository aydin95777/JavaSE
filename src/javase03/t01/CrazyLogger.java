package javase03.t01;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CrazyLogger {
    private StringBuilder log = new StringBuilder();
    private SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-YYYY ':' hh-mm");

    public void addToLog(String text) {
        String date = dateFormat.format(new Date());
        log.append(date).append(" - ").append(text).append("\n");
    }

    public void printLog() {
        System.out.println(log.toString());
    }

    public String searchByString(String byString) {
        Pattern pattern = Pattern.compile(".*" + byString + ".*\\n");
        Matcher matcher = pattern.matcher(log.toString());
        StringBuilder result = new StringBuilder();

        while (matcher.find()) {
            result.append(matcher.group().trim()).append("\n");
        }

        return result.toString();
    }

    public String searchByTime(String byTime) {
        return searchByString(byTime);
    }
}
