// 1. Write a Java program to associate the specified value with the specified key in a HashMap.
import java.util.*;
public class HM_Associate{
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        HashMap <String,Integer> stdData = new HashMap<>();
        stdData.put("Rohit", 001);
        stdData.put("Rohan", 002);
        stdData.put("Ronak", 003);
        for(Map.Entry x : stdData.entrySet()){
            System.err.println(x.getKey() + " " + x.getValue());
        }
    }
}