package ComparableCircle;

import java.util.Comparator;

public class RadiusComparator extends Circle implements Comparator<Circle> {
    public int compare(Circle c1, Circle c2) {
        return (int) (c1.getRadius() - c2.getRadius());
    }
}
