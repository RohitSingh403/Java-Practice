// Write a Java program to remove all mappings from a map.
import java.util.*;
public class HM_RemoveAll {
    public static void main(String args[]){
        HashMap <Integer,String> hm = new HashMap<>();
        hm.put(1, "Rohit");
        hm.put(2, "Rohan");
        hm.put(3, "Ronak");
        System.out.println(hm);
        hm.clear();
        System.out.println(hm);
    }
}
