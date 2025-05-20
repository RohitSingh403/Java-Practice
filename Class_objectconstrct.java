import java.util.*;

public class Class_objectconstrct {
    public static void main(String args[]) {
        home rs = new home(25, true);// without parameter
        System.out.println(rs.floor);
        System.out.println(rs.gym);
        // System.out.println(rs.pool);
        // System.out.println(rs.room);
    }

    public static class home {
        int floor;// v1
        int room;// v2
        boolean gym;// b1
        boolean pool;// b2

        // Constructor
        home(int v1, int v2, boolean b1, boolean b2) {
            floor = v1;
            room = v2;
            gym = b1;
            pool = b2;
        }

        // Default Comstructor
        home() {

        }
        home(boolean b1,int v1 ){
            room = v1;
            pool = b1;
        }
        //constructor 3
        home(int v2, boolean b2) {
            floor = v2;
            gym = b2;
        }
    }
}
