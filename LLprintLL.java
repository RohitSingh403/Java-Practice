import java.util.*;
public class LLprintLL {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        // Create linked list nodes
        node head = new node(5);
        head.next = new node(10);
        head.next.next = new node(15);
        head.next.next.next = new node(20);
        System.out.println("LinkedList elements are : ");
        PrintValLL(head);
    }
    public static class node {
        int val;
        node next;
        //Constructor
        node(int v1) {
            val = v1;
            next = null;
        }
    }
    public static void PrintValLL(node head) {
        node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
    }
}
