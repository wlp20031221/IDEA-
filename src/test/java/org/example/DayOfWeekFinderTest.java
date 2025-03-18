package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author 作者
 * @create 2025-03-18-16:40
 */
public class DayOfWeekFinderTest {
    @Test
    public void testMonday() {
        assertEquals("Monday", DayOfWeekFinder.getDayOfWeek('M', 'x'));
    }

    @Test
    public void testTuesday() {
        assertEquals("Tuesday", DayOfWeekFinder.getDayOfWeek('T', 'u'));
    }

    @Test
    public void testThursday() {
        assertEquals("Thursday", DayOfWeekFinder.getDayOfWeek('T', 'h'));
    }

    @Test
    public void testWednesday() {
        assertEquals("Wednesday", DayOfWeekFinder.getDayOfWeek('W', 'e'));
    }

    @Test
    public void testFriday() {
        assertEquals("Friday", DayOfWeekFinder.getDayOfWeek('F', 'r'));
    }

    @Test
    public void testSaturday() {
        assertEquals("Saturday", DayOfWeekFinder.getDayOfWeek('S', 'a'));
    }

    @Test
    public void testSunday() {
        assertEquals("Sunday", DayOfWeekFinder.getDayOfWeek('S', 'u'));
    }
}