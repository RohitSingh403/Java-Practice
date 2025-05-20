import java.util.*;

public class array_Reverse {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        reverse(arr);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]);
        }
    }
    public static void reverse(int arr[]) {
        int n = arr.length;
        int sp = 0;
        int ep = n - 1;
        while (sp < ep) {
            int temp = arr[sp];
            arr[sp] = arr[ep];
            arr[ep] = temp;
            sp++;
            ep--;
        }
    }
}
