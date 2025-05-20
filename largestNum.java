import java.util.*;
public class largestNum {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int ans = LargestNumber(arr);
        System.out.println("Largest Number is " + ans);
    }
    public static int LargestNumber(int[] arr) {
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        int second_max = Integer.MIN_VALUE;
        int index = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                second_max = max;
                max = arr[i];
                index = i;
            } else if (arr[i] > second_max) {
                second_max = arr[i];
            }
        }
        if (second_max * 2 <= max) {
            return index;
        } else
            return -1;
    }
}
