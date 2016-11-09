/**
 * Created by Denis on 09.11.2016.
 */
public class Ex3 {
    private static int ARRAY_LENGTH = 10;
    private static int START_RAND = -10;
    private static int END_RAND = 10;

    public static void main(String[] args) {
        int[] arr = Helper.generateRandomArray(ARRAY_LENGTH,
                                               START_RAND, END_RAND);

        System.out.print("Array: ");
        Helper.printArray(arr);
        System.out.println();

        System.out.println("Index of minimal element: "
                            + Helper.findIndexOfMinInArray(arr));
    }

}
