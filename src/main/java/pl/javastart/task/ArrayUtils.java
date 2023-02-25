package pl.javastart.task;

import java.util.Scanner;

class ArrayUtils {
    private static final Scanner INPUT = new Scanner(System.in);

    int[][] createArray() {
        System.out.println("Podaj liczbę wierszy:");
        int rows = setArrayDimensions(100);
        System.out.println("Podaj liczbę kolumn:");
        int cols = setArrayDimensions(100);
        int[][] array = new int[rows][cols];
        fillArray(array);

        return array;
    }

    private int setArrayDimensions(int maxDimension) {
        int dim = 0;
        boolean validDimension = false;
        while (!validDimension) {
            dim = INPUT.nextInt();
            if (dim > maxDimension || dim < 1) {
                System.out.printf("Nieprawidłowa liczba wierszy. Podaj liczbę z zakresu (0; %d]\n", maxDimension);
            } else {
                validDimension = true;
            }
        }
        return dim;
    }

    private void fillArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = i * j;
            }
        }
    }

    void printArray(int[][] array) {
        for (int[] row : array) {
            printCells(row);
            System.out.println();
            printDividers(row);
            System.out.println();
        }
    }

    private void printCells(int[] row) {
        for (int i : row) {
            System.out.printf("%4d |", i);
        }
    }

    private void printDividers(int[] row) {
        for (int i : row) {
            System.out.print("------");
        }
    }
}
