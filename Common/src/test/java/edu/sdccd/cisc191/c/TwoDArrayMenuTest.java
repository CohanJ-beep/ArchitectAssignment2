package edu.sdccd.cisc191.c;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TwoDArrayMenuTest {
    @Test
    public void testGetAtIndex() {
        TwoDArrayMenu menu = new TwoDArrayMenu();
        menu.setAtIndex(0, 0, "Test");
        assertEquals("Test", menu.getAtIndex(0, 0));
    }

    @Test
    public void testSetAtIndex() {
        TwoDArrayMenu menu = new TwoDArrayMenu();
        menu.setAtIndex(0, 0, "Test");
        assertEquals("Test", menu.getAtIndex(0, 0));
    }

    @Test
    public void testFindIndexOf() {
        TwoDArrayMenu menu = new TwoDArrayMenu();
        menu.setAtIndex(0, 0, "Test");
        assertArrayEquals(new int[]{0, 0}, menu.findIndexOf("Test"));
    }

    @Test
    public void testDeleteAtIndex() {
        TwoDArrayMenu menu = new TwoDArrayMenu();
        menu.setAtIndex(0, 0, "Test");
        menu.deleteAtIndex(0, 0);
        assertNull(menu.getAtIndex(0, 0));
    }
}
