import java.util.*;

public class RecursionP_SetNto1 {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the N");
        int n = scn.nextInt();
        printNto1(n);
    }
    public static void printNto1(int n) {
        if (n == 1) {
            System.out.print(n + " ");
            return;
        }
        System.out.print(n + " ");
        printNto1(n - 1);
    }
}
