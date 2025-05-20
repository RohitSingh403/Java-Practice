import java.util.*;

public class rotateArray {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the array size");
        int n = scn.nextInt();
        System.out.println("Enter the array elements");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        System.out.println("Enter the K");
        int k = scn.nextInt();
        if (k > n) {
            k = k % n;
        }
        rotateArrayK(arr, 0, n - 1);
        rotateArrayK(arr, 0, k - 1);
        rotateArrayK(arr, k, n - 1);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void rotateArrayK(int[] arr, int s, int e) {
        int sp = s;
        int ep = e;
        while (sp < ep) {
            int temp = arr[sp];
            arr[sp] = arr[ep];
            arr[ep] = temp;
            sp++;
            ep--;
        }
    }
}
