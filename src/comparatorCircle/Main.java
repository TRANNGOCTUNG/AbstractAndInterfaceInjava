package comparatorCircle;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Circle[] circles = new Circle[3];
        circles[0] = new Circle(4,"Chicago");
        circles[1] = new Circle();
        circles[2] = new Circle(5, "indigo");

        Comparator comparator = new CircleComparator();
        Arrays.sort(circles, comparator);
        for (Circle c:circles
             ) {
            System.out.println(c);
        }

    }

}
