import java.util.*;
public class SortingGoodIntegerDuplicate {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter array size");
        int n = scn.nextInt();
        System.out.println("enter array elements");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int result = duplicateGoodInteger(arr);
        System.out.println("Good Integer with Duplicate values is " + result);
    }
    public static int duplicateGoodInteger(int[] arr) {
        Arrays.sort(arr);
        int ans = 0;
        int lessCount = 0;
        if (arr[0] == 0) {
            ans++;
        }
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                lessCount = i;
            }
            if (arr[i] == lessCount) {
                ans++;
            }
        }
        return ans;
    }
}
