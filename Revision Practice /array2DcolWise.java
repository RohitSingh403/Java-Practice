import java.util.*;

public class array2DcolWise {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter rows");
        int n = scn.nextInt();
        System.out.println("Enter colums");
        int m = scn.nextInt();
        System.out.println("Enter the array elements");
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        printCols(arr);
    }

    public static void printCols(int[][] arr) {
        int n = arr.length;
        int m = arr[0].length;
        for (int j = 0; j < m; j++) {
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
