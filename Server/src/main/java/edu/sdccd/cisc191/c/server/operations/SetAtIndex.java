package edu.sdccd.cisc191.c.server.operations;


public class SetAtIndex implements Operation {
    private int[] array;
    private int index;
    private int value;

    public SetAtIndex(int[] array, int index, int value) {
        this.array = array;
        this.index = index;
        this.value = value;
    }

    @Override
    public void performOperation() {
        if (index >= 0 && index < array.length) {
            array[index] = value;
            System.out.println("Value set at index " + index);
        } else {
            System.out.println("Index out of bounds.");
        }
    }
}
