package geometric;

public class Rectangle extends GeometricObject{
    private double width, high;

    public Rectangle() {
        width = 4;
        high = 5;
    }
    public Rectangle(double width, double high) {
        this.width = width;
        this.high = high;
    }

    public Rectangle(String color, boolean filled, double width, double high) {
        super(color, filled);
        this.width = width;
        this.high = high;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHigh() {
        return high;
    }

    public void setHigh(double high) {
        this.high = high;
    }

    @Override
    public double getArea() {
        return width * high;
    }

    @Override
    public double getPerimeter() {
        return (width + high) * 2;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + high +
                super.toString() +
                " Area = " + getArea() +
                " Perimeter = " + getPerimeter() +
                '}';
    }
}
