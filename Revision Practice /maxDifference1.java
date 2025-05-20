import java.util.*;

public class maxDifference1 {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the array Size");
        int n = scn.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array Elements");
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int ans = maxDiff1(arr);
        System.out.println("Maximum Difference is " + ans);
    }

    public static int maxDiff1(int[] arr) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return max - min;
    }
}
