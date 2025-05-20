// 2. Write a Java program to count the number of key-value (size) mappings in a map.
import java.util.*;
public class HM_CountSize {
    public static void main(String args[]){
        HashMap <Integer,String> hm = new HashMap<>();
        hm.put(1, "Rohit");
        hm.put(2, "Rohan");
        hm.put(3, "Ronak");
        System.out.println("Size is "+hm.size());
    }
}
