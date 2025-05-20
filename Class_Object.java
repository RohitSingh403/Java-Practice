import java.util.*;

public class Class_Object {
    public static void main(String args[]) {
        home rs = new home();// reference 1 default value
        rs.floor = 100;// reference 1 update the default value

        home zr = rs;// reference 1 copy to zr
        zr.floor = 700;// reference 1 updated
        System.out.println(rs.floor);// printing reference 1
        System.out.println(rs);// reference 1 hash code
    }

    public static class home {
        int floor;
        int room;
        boolean gym;
        boolean pool;
    }
}
