import java.util.*;

public class array2DRowWise {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Row");
        int n = scn.nextInt();
        System.out.println("Enter coloums");
        int m = scn.nextInt();
        System.out.println("Enter array elements");
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(" ");
                arr[i][j] = scn.nextInt();
            }
        }
        printRows(arr);
    }

    public static void printRows(int[][] arr) {
        int n = arr.length;
        int m = arr[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}