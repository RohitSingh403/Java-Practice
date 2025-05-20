import java.util.*;
public class factFun {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int result = fact(n);
        System.out.println(result);
        }
        public static int fact(int n){
            int fact =1;
            for(int i=1;i<=n;i++){
                fact = fact*i;
            }
            return fact;
        }
}
