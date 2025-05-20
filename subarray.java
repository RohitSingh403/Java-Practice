import java.util.*;

public class subarray {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        SubArray(arr);
    }

    public static int SubArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                for (int k = 0; k <= j; k++) {
                    System.out.print(arr[i]);
                }
                System.out.println(" ");
            }
            System.out.println(arr[j]);
        }
        return 0;
    }
}
