package edu.sdccd.cisc191.template;
import java.util.ArrayList;
public class Sorting {
    public static ArrayList<Assignment> sortAssignmentByDueDate(ArrayList<Assignment> assignments, int endIndex) {
//        if (endIndex == 1)
//            return assignments;
//        for (int i = 0; i < endIndex - 1; i++) {
//            if (assignments.get(i).getDaysUntilDueDate() > assignments.get(i+1).getDaysUntilDueDate()) {
//                //swap position of i, i+1
//                Assignment temp = assignments.get(i);
//                assignments.set(i, assignments.get(i+1));
//                assignments.set(i+1, temp);
//            }
//        }
//        sortAssignmentByDueDate(assignments, endIndex-1);
//        return assignments;
        //base
        if (endIndex <= 1)
            return assignments;

        sortAssignmentByDueDate(assignments, endIndex - 1);

        //insert last element
        Assignment tempAssignment = assignments.get(endIndex - 1);
        int i = endIndex - 2;

        //move elements
        while (i >= 0 && assignments.get(i).getDaysUntilDueDate() > tempAssignment.getDaysUntilDueDate()) {
            assignments.set(i+1, assignments.get(i));
            i--;
        }
        assignments.set(i + 1, tempAssignment);
        return assignments;
    }
}
