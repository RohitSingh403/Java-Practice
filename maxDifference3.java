import java.util.*;
public class maxDifference3 {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter array size");
        int n = scn.nextInt();
        System.out.println("Enter array elements");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int ans = MaxDiff3(arr);
        System.out.println("Maximum Difference 3 is : " + ans);
    }
    public static int MaxDiff3(int[] arr) {
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
