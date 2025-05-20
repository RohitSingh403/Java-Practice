import java.util.*;

public class maxDifference4 {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the array size");
        int n = scn.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array elements");
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int ans1 = maxDiff2(arr);
        int ans2 = maxDiff3(arr);
        int ans3 = Math.max(ans1, ans2);
        System.out.println("Max Difference four is " + ans3);
    }
    public static int maxDiff2(int[] arr) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            arr[i] = arr[i] + i;
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
