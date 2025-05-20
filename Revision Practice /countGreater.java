import java.util.*;

public class countGreater {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the array size");
        int n = scn.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array elements");
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int ans = countGreater1(arr);
        System.out.println("the greater then itself is " + ans);
    }

    public static int countGreater1(int[] arr) {
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        int Maxcount = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == max) {
                Maxcount++;
            }
        }
        return n - Maxcount;
    }
}
