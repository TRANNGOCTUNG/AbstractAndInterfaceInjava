package ComparableCircle;

import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ComparableCircle[] circles = new ComparableCircle[3];
        circles[0] = new ComparableCircle(4,"Chicago",true);
        circles[1] = new ComparableCircle();
        circles[2] = new ComparableCircle(3.5, "indigo", false);

        for (ComparableCircle circle : circles)
             {
                 System.out.println(circle);
        }
        Arrays.sort(circles);
        for (ComparableCircle circle : circles)
              {
                  System.out.println(circle);
        }
    }
}
