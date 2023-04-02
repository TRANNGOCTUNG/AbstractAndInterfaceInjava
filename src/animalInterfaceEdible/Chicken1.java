package animalInterfaceEdible;

public class Chicken1 extends Animal implements Edible{
    @Override
    public String makeSound() {
        return "Chicken : Ò ó o o, Ò ó o o";
    }

    @Override
    public String howToEat() {
        return "Chicken for meat.";
    }
}
