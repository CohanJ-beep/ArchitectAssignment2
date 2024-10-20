package edu.sdccd.cisc191.c.server.operations;


public class FindIndexOf implements Operation {
    private int[] array;
    private int value;

    public FindIndexOf(int[] array, int value) {
        this.array = array;
        this.value = value;
    }

    @Override
    public void performOperation() {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                System.out.println("Value found at index " + i);
                return;
            }
        }
        System.out.println("Value not found.");
    }
}

