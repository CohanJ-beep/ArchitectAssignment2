package edu.sdccd.cisc191.c.server.operations;


public class GetAtIndex implements Operation {
    private int[] array;
    private int index;

    public GetAtIndex(int[] array, int index) {
        this.array = array;
        this.index = index;
    }

    @Override
    public void performOperation() {
        if (index >= 0 && index < array.length) {
            System.out.println("Value at index " + index + ": " + array[index]);
        } else {
            System.out.println("Index out of bounds.");
        }
    }
}

