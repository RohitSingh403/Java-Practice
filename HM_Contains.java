// 5. Write a Java program to check whether a map contains key-value mappings (empty) or not.
import java.util.*;
public class HM_Contains {
    public static void main(String args[]){
        HashMap <Integer,String> hm = new HashMap<>();
        hm.put(1, "Rohit");
        hm.put(2, "Rohan");
        hm.put(3, "Ronit");
        System.out.println(hm.containsKey(1));
    }
}
