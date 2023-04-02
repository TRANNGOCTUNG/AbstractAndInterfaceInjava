package animalInterfaceEdible;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ShowAll {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Fruit[] fruits = new Fruit[2];
        Animal[] animal = new Animal[2];
        System.out.println("""
                Menu.
                1.Apple and Orange.
                2.MakeSound Tiger and Chicken
                3.Tiger eat Chicken
                0.Exit.
                """);
        System.out.println("Your choice: ");
        int number = scanner.nextInt();
        switch (number) {
            case 0 -> System.exit(0);
            case 1 -> {
                fruits[0] = new Apple();
                fruits[1] = new Orange();
                for (Fruit f:fruits
                     ) {
                    System.out.println(f.howToEat());
                }
            }
            case 2 -> {
                animal[0] = new Chicken();
                animal[1] = new Tiger();
                for (Animal a: animal
                     ) {
                    System.out.println(a);
                }
            }
            case 3 -> {
                Animal[] animal1 = new Animal[2];
                animal1[0] = new Chicken1();
                animal1[1] = new Tiger();
                for (Animal A: animal1) {
                    System.out.println(A.makeSound());
                    if(A instanceof Chicken1){
                        Edible edible = ((Chicken1) A);
                        System.out.println(edible.howToEat());
                }
                }
            }
            default -> System.out.println("Please re-enter");
        }
        
    }
}
