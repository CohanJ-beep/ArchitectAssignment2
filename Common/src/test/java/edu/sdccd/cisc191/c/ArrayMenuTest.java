package edu.sdccd.cisc191.c;

import static org.junit.jupiter.api.Assertions.*;

import edu.sdccd.cisc191.c.server.ArrayMenu;
import org.junit.jupiter.api.Test;

public class ArrayMenuTest {
    @Test
    public void testGetAtIndex() {
        ArrayMenu menu = new ArrayMenu(10);
        menu.setAtIndex(0, 42);
        assertEquals(42, menu.getAtIndex(0));
    }

    @Test
    public void testSetAtIndex() {
        ArrayMenu menu = new ArrayMenu(10);
        menu.setAtIndex(0, 42);
        assertEquals(42, menu.getAtIndex(0));
    }

    @Test
    public void testFindIndexOf() {
        ArrayMenu menu = new ArrayMenu(10);
        menu.setAtIndex(0, 42);
        assertEquals(0, menu.findIndexOf(42));
    }

    @Test
    public void testDeleteAtIndex() {
        ArrayMenu menu = new ArrayMenu(10);
        menu.setAtIndex(0, 42);
        menu.deleteAtIndex(0);
        assertEquals(0, menu.getAtIndex(0)); // Assuming 0 is the default "empty" value
    }
}
