package org.example;
import org.junit.Test;
import static org.junit.Assert.*;

public class DayIdentifierTest {

    @Test
    public void testMonday() {  // 圆形分支
        assertEquals("Monday", DayIdentifier.getDay("M", ""));
    }

    @Test
    public void testTuesday() {  // 矩形分支
        assertEquals("Tuesday", DayIdentifier.getDay("T", "u"));
    }

    @Test
    public void testThursday() {  // 菱形分支
        assertEquals("Thursday", DayIdentifier.getDay("T", "h"));
    }

    @Test
    public void testWednesday() {
        assertEquals("Wednesday", DayIdentifier.getDay("W", ""));
    }

    @Test
    public void testFriday() {
        assertEquals("Friday", DayIdentifier.getDay("F", ""));
    }

    @Test
    public void testSaturday() {  // 虚线框分支
        assertEquals("Saturday", DayIdentifier.getDay("S", "a"));
    }

    @Test
    public void testSunday() {
        assertEquals("Sunday", DayIdentifier.getDay("S", "u"));
    }

    @Test
    public void testInvalid() {  // 终止分支
        assertEquals("Invalid", DayIdentifier.getDay("X", ""));
    }
}