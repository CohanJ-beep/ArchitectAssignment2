package edu.sdccd.cisc191.c.server.operations;


public class Shrink implements Operation {
    private int[] array;

    public Shrink(int[] array) {
        this.array = array;
    }

    @Override
    public void performOperation() {
        if (array.length > 0) {
            int[] newArray = new int[array.length - 1];
            System.arraycopy(array, 0, newArray, 0, newArray.length);
            array = newArray;
            System.out.println("Array shrunk.");
        } else {
            System.out.println("Array cannot be shrunk further.");
        }
    }
}

