// import java.util.*;

// class swap_index {
//     public static void main(String args[]) {
//         Scanner scn = new Scanner(System.in);
//         int n = scn.nextInt();
//         int[] arr = new int[n];
//         for (int i = 0; i < n; i++) {
//             arr[i] = scn.nextInt();// input array
//         }
//         int idx1 = scn.nextInt();//input swaping index one
//         int idx2 = scn.nextInt();//input swaping index two
//         int temp = arr[idx1];
//         arr[idx1] = arr[idx2];
//         arr[idx2] = temp;
//         for (int i = 0; i < n - 1; i++) {
//             System.out.print(arr[i] + " ");
//         }
//     }

// }
import java.util.*;

public class swap_index {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        System.err.println("Enter array size");
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        System.out.println("Enter first index to swap");
        int idx1 = scn.nextInt();
        System.out.println("Enter second index to swap");
        int idx2 = scn.nextInt();
        int temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
        for (int i = 0; i < n - 1; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}