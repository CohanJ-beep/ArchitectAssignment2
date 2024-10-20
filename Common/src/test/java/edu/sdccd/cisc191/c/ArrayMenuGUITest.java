package edu.sdccd.cisc191.c;
import static org.junit.jupiter.api.Assertions.*;

import edu.sdccd.cisc191.c.client.ArrayMenuGUI;
import edu.sdccd.cisc191.c.server.ArrayOperations;
import edu.sdccd.cisc191.c.server.ArrayMenu;
import org.junit.jupiter.api.Test;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import org.testfx.framework.junit5.ApplicationTest;
import static org.junit.jupiter.api.Assertions.*;
import edu.sdccd.cisc191.c.client.ArrayMenuGUI;
import org.junit.jupiter.api.Test;
import javafx.scene.control.TextField;
import org.testfx.framework.junit5.ApplicationTest;

public class ArrayMenuGUITest extends ApplicationTest {
    private ArrayMenuGUI gui;

    @Override
    public void start(Stage stage) {
        gui = new ArrayMenuGUI();
        gui.start(stage);
    }

    @Test
    public void testSetAtIndex() {
        clickOn("#setButton");
        write("0");
        clickOn("#valueField");
        write("Test");
        clickOn("#submitButton");
        assertEquals("Test", gui.getArrayMenu().getArrayMenu().getAtIndex(0));
    }

    @Test
    public void testGetAtIndex() {
        gui.getArrayMenu().getArrayMenu().setAtIndex(0, Integer.parseInt("Test"));
        clickOn("#getButton");
        write("0");
        clickOn("#submitButton");
        assertEquals("Test", ((TextField) gui.getScene().lookup("#resultField")).getText());
    }
}
