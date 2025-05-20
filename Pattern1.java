import java.util.*;
// public class Pattern1 {
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=n;j++){
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
// }

public class Pattern1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        starPattern(n);
    }
    public static void starPattern(int n) {
        int nst = n;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= nst; j++) {
                System.out.print("* ");
            }
            nst--;
            System.out.println();
        }
    }
}