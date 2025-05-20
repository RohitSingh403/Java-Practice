import java.util.*;

public class Rotate_Array {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter array size and array");
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        System.out.println("Enter number of rotations you want to do");
        int k = scn.nextInt();
        if (k > n) {
            k = k % n;
        }
        rotate_Array(arr, 0, n - 1);
        rotate_Array(arr, 0, k - 1);
        rotate_Array(arr, k, n - 1);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]);
        }
    }
    public static void rotate_Array(int[] arr, int s, int e) {
        int n = arr.length;
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
