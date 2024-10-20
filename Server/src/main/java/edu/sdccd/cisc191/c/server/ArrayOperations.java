package edu.sdccd.cisc191.c.server;
import java.util.Arrays;

public class ArrayOperations {
    private int[] array;

    public ArrayOperations(int[] array) {
        if (array == null) {
            throw new IllegalArgumentException("Array cannot be null");
        }
        this.array = array;
    }

    public ArrayOperations() {

    }

    public int getAtIndex(int index) {
        if (index < 0 || index >= array.length) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        return array[index];
    }

    public void setAtIndex(int index, int value) {
        if (index < 0 || index >= array.length) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        array[index] = value;
    }

    public int findIndexOf(int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1; // Value not found
    }

    public void printAll() {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public void deleteAtIndex(int index) {
        if (index >= 0 && index < array.length) {
            for (int i = index; i < array.length - 1; i++) {
                array[i] = array[i + 1];
            }
            array = Arrays.copyOf(array, array.length - 1);
        }
    }

    public void expand(int newSize) {
        array = Arrays.copyOf(array, newSize);
    }

    public void shrink(int newSize) {
        if (newSize < array.length) {
            array = Arrays.copyOf(array, newSize);
        }
    }
}
