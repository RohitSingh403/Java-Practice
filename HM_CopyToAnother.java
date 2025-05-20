// Write a Java program to copy all mappings from the specified map to another map.
import java.util.*;
public class HM_CopyToAnother {
    public static void main(String args[]){
        HashMap <Integer,String> hm = new HashMap<>();
        HashMap <Integer,String> hm1 = new HashMap<>();
        hm.put(1, "Rohit");
        hm.put(2, "Rohan");
        hm.put(3, "Ronak");
        hm1.putAll(hm);
        System.out.println(hm);
        System.out.println(hm1);
    }
}
