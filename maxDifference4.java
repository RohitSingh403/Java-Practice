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
        int ans2 = maxDiff2(arr);
        int ans3 = maxDiff3(arr);
        int ans4 = Math.max(ans2, ans3);
        System.out.println("Maximum Difference 4 is " + ans4);
    }
    public static int maxDiff2(int[] arr) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] + i;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] - i;
        }
        return max - min;
    }
    public static int maxDiff3(int[] arr) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] - i;
        }
        for (int i = 0; i < arr.length; i++) {
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
