package edu.sdccd.cisc191.c.server.operations;


public class DeleteAtIndex implements Operation {
    private int[] array;
    private int index;

    public DeleteAtIndex(int[] array, int index) {
        this.array = array;
        this.index = index;
    }

    @Override
    public void performOperation() {
        if (index >= 0 && index < array.length) {
            array[index] = 0; // Assuming 0 is the default "empty" value
            System.out.println("Value deleted at index " + index);
        } else {
            System.out.println("Index out of bounds.");
        }
    }
}
