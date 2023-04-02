package ComparableCircle;

public class ComparableCircle extends Circle implements Comparable<ComparableCircle> {


    public ComparableCircle() {
    }

    public ComparableCircle(double radius, String color, boolean filled) {
        super(radius, color, filled);
    }
    @Override
    public int compareTo(ComparableCircle o) {
        return (int) (getRadius() - o.getRadius());
    }
}
