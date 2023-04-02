package geometric;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Circle circle = new Circle();
        Rectangle rect = new Rectangle();
        System.out.println("---------------Circle-----------------");
        System.out.println("Enter color: ");
        circle.setColor(scanner.next());
        System.out.println("Enter filled: ");
        circle.setFilled(scanner.nextBoolean());
        System.out.println("Enter radius:");
        circle.setRadius(scanner.nextDouble());
        System.out.println("-------------------------Rectangle-------------------------------");
        System.out.println("Enter color: ");
        rect.setColor(scanner.next());
        System.out.println("Enter filled: ");
        rect.setFilled(scanner.nextBoolean());
        System.out.println("Enter width: ");
        rect.setWidth(scanner.nextDouble());
        System.out.println("Enter high: ");
        rect.setHigh(scanner.nextDouble());
        System.out.println(circle);
        System.out.println(rect);
        System.out.println(circle.getClass());
        System.out.println(circle.hashCode());
    }
}
