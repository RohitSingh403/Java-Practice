import java.util.*;

public class RecursionP_SetPrintN {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the N");
        int n = scn.nextInt();
        printN(n);
    }

    public static void printN(int n) {
        if (n == 1) {
            System.out.print(n + " ");
            return;
        }
        printN(n - 1);
        System.out.print(n + " ");
    }
}
