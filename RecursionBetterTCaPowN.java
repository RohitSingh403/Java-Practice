import java.util.*;
public class RecursionBetterTCaPowN {
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the A");
        int a = scn.nextInt();
        System.out.println("Enter the N");
        int n = scn.nextInt();
        int ans = pow(a, n);
        System.out.println("answer is" + ans);
    }
    //This  program has better TIME COMPLEXITY O(logN)
    public static int pow(int a , int n){
        if(n == 1){
            return a;
        }
        int temp = pow(a, n/2);
        if(n%2==0){
            return temp * temp;
        }
        else{
            return temp * temp *a;
        }
    }
}
