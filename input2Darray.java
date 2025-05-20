import java.util.*;
public class input2Darray {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the rows");
        int n = scn.nextInt();// enter the size of the 2d array
        System.out.println("Enter the coloums");
        int m = scn.nextInt();
        int[][] arr = new int[n][m];
        for(int i =0 ;i<n;i++){
            for(int j =0 ;j<m;j++){
                System.out.print(" ");
                arr[i][j]= scn.nextInt();
            }
        }
        printRows(arr);
    } 
    public static void printRows(int[][] arr) {
        int n = arr.length;
        int m = arr[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
