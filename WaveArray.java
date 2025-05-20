import java.util.*;

public class WaveArray {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the Array Size");
        int n = scn.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array elements");
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        convertToWave(arr);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void convertToWave(int[] arr) {
        int n = arr.length;
        for (int i = 0; i <= n; i++) {
            int idx1 = arr[0];
            int idx2 = arr[1];
            if (idx2 >= idx1) {
                int temp = idx1;
                idx1 = idx2;
                idx2 = temp;
            }
            idx1 = idx1 + 2;
            idx2 = idx2 + 2;
        }
    }
}
