package org.example;

/**
 * @author 作者
 * @create 2025-03-18-17:13
 */
public class DayIdentifier {
    public static String getDay(String firstChar, String secondChar) {
        switch (firstChar) {
            case "M":
                return "Monday";
            case "T":
                return secondChar.equals("u") ? "Tuesday" :
                        (secondChar.equals("h") ? "Thursday" : "Invalid");
            case "W":
                return "Wednesday";
            case "F":
                return "Friday";
            case "S":
                return secondChar.equals("a") ? "Saturday" :
                        (secondChar.equals("u") ? "Sunday" : "Invalid");
            default:
                return "Invalid";
        }
    }
}
