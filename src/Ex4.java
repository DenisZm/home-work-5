/**
 * Created by Denis on 09.11.2016.
 */
public class Ex4 {
    private static int START_RAND = -10;
    private static int END_RAND = 10;

    public static void main(String[] args) {
        int n = Helper.inputInt("Array width :");
        int m = Helper.inputInt("Array height:");
        int[][] arr = Helper.generateRandom2DArray(n, m, START_RAND, END_RAND);

        System.out.println("Array:");
        Helper.print2DArray(arr);
        System.out.println();

        System.out.println("Row multiply:");
        Helper.printArray(Helper.multiplication2DArrayRow(arr));
    }




}
