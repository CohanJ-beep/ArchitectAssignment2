package edu.sdccd.cisc191.c.server.operations;


public class PrintAll implements Operation {
    private int[] array;

    public PrintAll(int[] array) {
        this.array = array;
    }

    @Override
    public void performOperation() {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}

