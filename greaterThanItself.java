import java.util.*;
public class greaterThanItself {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int result = CountGreater(arr);
        System.out.println("The Greater then itself : " + result);
    }
    public static int CountGreater(int[] arr) {
        int n = arr.length;
        int max = arr[0];
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        int maxCount = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == max) {
                maxCount++;
            }
        }
        return n - maxCount;
    }
}
