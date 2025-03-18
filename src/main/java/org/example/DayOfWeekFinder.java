package org.example;

/**
 * @author 作者
 * @create 2025-03-18-16:39
 */
public class DayOfWeekFinder {
    public static String getDayOfWeek(char firstChar, char secondChar) {
        switch (Character.toUpperCase(firstChar)) {
            case 'M':
                return "Monday";
            case 'W':
                return "Wednesday";
            case 'F':
                return "Friday";
            case 'T':
                if (Character.toLowerCase(secondChar) == 'u') {
                    return "Tuesday";
                } else {
                    return "Thursday";
                }
            case 'S':
                if (Character.toLowerCase(secondChar) == 'a') {
                    return "Saturday";
                } else {
                    return "Sunday";
                }
            default:
                return "Invalid";
        }
    }
}
