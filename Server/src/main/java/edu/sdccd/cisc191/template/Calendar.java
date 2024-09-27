package edu.sdccd.cisc191.template;

import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

import javax.swing.text.html.ImageView;
import java.util.ArrayList;

public class Calendar {
    private final ArrayList<Assignment>[][] calendar = new ArrayList[6][7];
    public void createArrayList(){
        for(int row = 0; row < calendar.length; row++){
            for(int col = 0; col < calendar[row].length; col++){
                calendar[row][col] = new ArrayList<Assignment>();
            }
        }
    }
    public void addAssignment(int date, Assignment assignment){
        calendar[date/7][date%7].add(assignment);
    }
    public void removeAssignment(int date, int index){
        calendar[date/7][date%7].remove(index);
    }
    public void setAssignment(int date, int index, Assignment assignment){
        calendar[date/7][date%7].set(index, assignment);
    }
    public int findIndex(int date, Assignment assignment){
        return calendar[date/7][date%7].indexOf(assignment);
    }
    public Assignment getAssignment(int date, int index){
        return calendar[date/7][date%7].get(index);
    }

}

