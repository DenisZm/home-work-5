/**
 * Created by Denis on 09.11.2016.
 */
public class Ex5 {
    private static int ARRAY_LENGTH = 20;
    private static int START_RAND = 0;
    private static int END_RAND = 100;

    public static void main(String[] args) {
        int[] arr = Helper.generateRandomArray(ARRAY_LENGTH, START_RAND, END_RAND);

        System.out.println("Unsorted Array:");
        Helper.printArray(arr);
        System.out.println();

        System.out.println("Sorted Array:");
        Helper.printArray(bubbleSort(arr));
    }

    static int[] bubbleSort(int[] arr) {
        boolean swap;
        int counter = 0;
        int step = 0;
        int length = arr.length;
        do {
            swap = false;
            for (int i = 0; i < length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int t = arr[i + 1];
                    arr[i + 1] = arr[i];
                    arr[i] = t;
                    swap = true;
                }
                step++;
            }
            System.out.print(step + " ");
            length--;
            counter++;
            step = 0;
        } while (swap);
        System.out.println("Iteration: " + counter);
        return arr;
    }
}
