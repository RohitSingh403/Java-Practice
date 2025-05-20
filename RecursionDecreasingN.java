import java.util.*;

public class RecursionDecreasingN {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the N");
        int n = scn.nextInt();
        System.out.println("Numbers in Decreasing ");
        printDecreaseN(n);
    }
    public static void printDecreaseN(int n) {
        if (n == 1) {
            System.out.print(n + " ");
            return;
        }
        System.out.print(n + " ");
        printDecreaseN(n - 1);
    }
}
