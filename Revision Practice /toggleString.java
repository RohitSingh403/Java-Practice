import java.util.*;
public class toggleString {
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        String st = scn.nextLine();
        char[] ch = st.toCharArray();
        toggleCh(ch);
        for(int i = 0 ;i<ch.length;i++){
            System.out.print(ch[i]);
        }
    }
    public static void toggleCh(char[] ch){
        for(int i = 0 ;i<ch.length;i++){
            if(ch[i]>='A' && ch[i]<='Z'){
                ch[i]= (char)(ch[i]+32);
            }
            else{
                ch[i]= (char)(ch[i]-32);
            }
        }
    }
}
