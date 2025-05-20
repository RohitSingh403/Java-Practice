import java.util.*;

public class PrintRows2Darrya {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter rows");
        int n = scn.nextInt();
        System.out.println("Enter coloums");
        int m = scn.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        printrows(arr);
    }

    public static void printrows(int[][] arr) {
        int n = arr.length;
        int m = arr[0].length;
        System.out.println("2D Array matix is : ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
