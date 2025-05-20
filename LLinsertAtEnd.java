import java.util.*;

public class LLinsertAtEnd {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the value");
        int val = scn.nextInt();
        node head = new node(10);
        head.next = new node(20);
        head.next.next = new node(30);
        head.next.next.next = new node(40);
        System.out.println("Now the inserted node is become the End node");
        InsertLL(val, head);
    }

    public static class node {
        int val;
        node next;

        node(int v1) {
            val = v1;
            next = null;
        }
    }

    public static void InsertLL(int v, node head) {
        node n1 = new node(v);
        node temp = head;
        while (temp.next != null) {
            System.out.println(temp.val);
            temp = temp.next;
        }
        temp.next = n1;
    }
}
