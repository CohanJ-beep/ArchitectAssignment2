package edu.sdccd.cisc191.c.server.operations;


public class Expand implements Operation {
    private int[] array;
    private int value;

    public Expand(int[] array, int value) {
        this.array = array;
        this.value = value;
    }

    @Override
    public void performOperation() {
        int[] newArray = new int[array.length + 1];
        System.arraycopy(array, 0, newArray, 0, array.length);
        newArray[array.length] = value;
        array = newArray;
        System.out.println("Array expanded.");
    }
}

