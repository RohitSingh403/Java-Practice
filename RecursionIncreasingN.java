// import java.util.*;

// public class RecursionIncreasingN {
//     public static void main(String args[]) {
//         Scanner scn = new Scanner(System.in);
//         System.out.println("Enter the N");
//         int n = scn.nextInt();
//         int ans = increaseN(n);
//         System.out.println(ans);
//     }
//     public static int increaseN(int n) {
//         if (n == 1) {
//             return 1;
//         }
//         int temp = increaseN(n - 1);
//         System.out.print(temp + " ");
//         return temp + 1;
//     }
// }
//SECOND APROCH
import java.util.*;

public class RecursionIncreasingN {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the N");
        int n = scn.nextInt();
        increaseN(n);
    }
    public static void increaseN(int n) {
        if (n == 1) {
            System.out.print(n + " ");
            return;
        }
        increaseN(n - 1);
        System.out.print(n + " ");
        return;
    }
} 
