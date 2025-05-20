// import java.util.*;

// public class SumOfGoodNumbers {
//     public static void main(String args[]) {
//         Scanner scn = new Scanner(System.in);
//         System.out.println("Enter array size");
//         int n = scn.nextInt();
//         int[] arr = new int[n];
//         for (int i = 0; i < n; i++) {
//             arr[i] = scn.nextInt();
//         }
//         System.out.println("Enter the K");
//         int k = scn.nextInt();
//         int result = GoodNum(arr, k);
//         System.out.println("Sum of Good Numbers is : " + result);
//     }

//     public static int GoodNum(int[] arr, int k) {
//         int n = arr.length;
//         int sum = 0;
//         for (int i = 0; i < n; i++) {
//             if (arr[i] > i - k && arr[i] > i + k) {
//                 sum = sum + arr[i];
//             }
//         }
//         return sum;
//     }
// }

import java.util.*;

public class SumOfGoodNumbers {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int k = scn.nextInt();
        int ans = goodNums(arr, k);
        System.out.println(ans);
    }
// 1 3 2 1 5 4 n
    public static int goodNums(int[] arr, int k) {
        int n = arr.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > i - k) {
                sum = sum + arr[i];
            } else if (arr[i] > i + k) {
                sum = sum + arr[i];
            } else {
                sum = sum + arr[i];
                System.out.println("all are good numbers");
            }
        }
        return sum;
    }
}