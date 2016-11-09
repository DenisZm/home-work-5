import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Helper Class for common functions.
 *
 * Created by Denis on 25.10.2016.
 **/
class Helper {

    static int inputInt(String prompt) {
        while (true) {
            System.out.print(prompt + " ");
            try {
                Scanner in = new Scanner(System.in);
                return in.nextInt();
            } catch (InputMismatchException ex) {
                System.out.println("Please input integer");
            }
        }
    }

    static void printArray(int[] arr) {
        for (int anArr: arr) {
            System.out.printf("%4d ", anArr);
        }
    }

    static void print2DArray(int[][] arr) {
        for (int[] anArr : arr) {
            Helper.printArray(anArr);
            System.out.println();
        }
    }

    static int[] generateRandomArray(int size, int startRandom,
                                     int endRandom) {
        int range = endRandom - startRandom;
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = (int) (Math.random() * range) + startRandom;
        }
        return arr;
    }

    static int[][] generateRandom2DArray(int width, int height,
                                         int startRand, int endRand) {
        int[][] arr = new int[height][width];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Helper.generateRandomArray(arr[i].length,
                                                startRand, endRand);
        }
        return arr;
    }

    static int multiplicationArrayRow(int[] arr) {
        int m = 1;
        for (int i : arr) {
            m *= i;
        }
        return m;
    }

    static int[] multiplication2DArrayRow(int[][] arr) {
        int[] result = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            result[i] = Helper.multiplicationArrayRow(arr[i]);
        }
        return result;
    }

    static int findIndexOfMinInArray(int[] arr) {
        int minIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[minIndex] > arr[i]) {
                minIndex = i;
            }
        }
        return minIndex;
    }

}