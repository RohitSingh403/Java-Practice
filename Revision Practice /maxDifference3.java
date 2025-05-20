import java.util.*;

public class maxDifference3 {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the array size");
        int n = scn.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array elements");
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int ans = maxDiff3(arr);
        System.out.println("Maximum Difference 3 is " + ans);
    }

    public static int maxDiff3(int[] arr) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            arr[i] = arr[i] - i;
        }
        for (int j = 0; j < n; j++) {
            if (arr[j] > max) {
                max = arr[j];
            }
            if (arr[j] < min) {
                min = arr[j];
            }
        }
        return max - min;
    }
}
