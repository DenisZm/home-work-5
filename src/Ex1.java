/**
 * Created by Denis on 08.11.2016.
 */
public class Ex1 {
    public static void main(String[] args) {
        printTable(7, 8);
    }

    static void printTable(int a, int b) {
        for (int i = a; i >= 1; i--) {
            for (int j = b; j >= 1; j--) {
                System.out.print(i * j + " ");
            }
            System.out.print("\n");
        }
    }
}
