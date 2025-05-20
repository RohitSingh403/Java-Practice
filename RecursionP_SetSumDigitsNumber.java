import java.util.*;

public class RecursionP_SetSumDigitsNumber {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = scn.nextInt();
        int ans = sumDigitNumber(n);
        System.out.println("Sum of Digits of a Number is " + ans);
    }

    public static int sumDigitNumber(int n) {
        if (n == 0) {
            return 0;
        }
        return (n % 10) + sumDigitNumber(n / 10);
    }
}
