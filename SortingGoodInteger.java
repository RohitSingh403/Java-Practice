import java.util.*;
public class SortingGoodInteger {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the array size");
        int n = scn.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array elements");
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int result = goodInteger(arr);
        System.out.println("The Good Integer is " + result);
    }
    public static int goodInteger(int[] arr) {
        Arrays.sort(arr);
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == i) {
                ans++;
            }
        }
        return ans;
    }
}
