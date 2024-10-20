package edu.sdccd.cisc191.c.server;

import java.util.Scanner;

public class ArrayMenu {
    private int[] array;

    public ArrayMenu(int size) {
        array = new int[size];
    }

    public void displayMenu() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Get at Index");
            System.out.println("2. Set at Index");
            System.out.println("3. Find Index of Value");
            System.out.println("4. Print All");
            System.out.println("5. Delete at Index");
            System.out.println("6. Expand Array");
            System.out.println("7. Shrink Array");
            System.out.println("8. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    getAtIndex(scanner);
                    break;
                case 2:
                    setAtIndex(scanner);
                    break;
                case 3:
                    findIndexOf(scanner);
                    break;
                case 4:
                    printAll();
                    break;
                case 5:
                    deleteAtIndex(scanner);
                    break;
                case 6:
                    expand();
                    break;
                case 7:
                    shrink();
                    break;
                case 8:
                    return; // Add semicolon here
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }

    public void getAtIndex(Scanner scanner) {
        System.out.print("Enter index: ");
        int index = scanner.nextInt();
        if (index >= 0 && index < array.length) {
            System.out.println("Value at index " + index + ": " + array[index]);
        } else {
            System.out.println("Index out of bounds.");
        }
    }

    public void setAtIndex(Scanner scanner) {
        System.out.print("Enter index: ");
        int index = scanner.nextInt();
        System.out.print("Enter value: ");
        int value = scanner.nextInt();
        if (index >= 0 && index < array.length) {
            array[index] = value;
            System.out.println("Value set at index " + index);
        } else {
            System.out.println("Index out of bounds.");
        }
    }

    public void findIndexOf(Scanner scanner) {
        System.out.print("Enter value: ");
        int value = scanner.nextInt();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                System.out.println("Value found at index " + i);
                return;
            }
        }
        System.out.println("Value not found.");
    }

    public void printAll() {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public void deleteAtIndex(Scanner scanner) {
        System.out.print("Enter index: ");
        int index = scanner.nextInt();
        if (index >= 0 && index < array.length) {
            array[index] = 0; // Assuming 0 is the default "empty" value
            System.out.println("Value deleted at index " + index);
        } else {
            System.out.println("Index out of bounds.");
        }
    }

    public void expand() {
        int[] newArray = new int[array.length * 2];
        System.arraycopy(array, 0, newArray, 0, array.length);
        array = newArray;
        System.out.println("Array expanded.");
    }

    public void shrink() {
        int[] newArray = new int[array.length / 2];
        System.arraycopy(array, 0, newArray, 0, newArray.length);
        array = newArray;
        System.out.println("Array shrunk.");
    }

    public ArrayOperations getArrayMenu() {
        return this.getArrayMenu();
    }
}
