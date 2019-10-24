package AnimalandInterface;

import AnimalandInterface.edible.Edible;

public class main {
    public static void main(String[] args) {

        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Orange();
        fruits[1] = new Apple();
        for (Animal animal : animals) {
            System.out.println(animal.makeSound());


            if (animal instanceof Chicken) {
                Edible edibler = (Chicken) animal;
                System.out.println(edibler.howToEat());
            }
            for (Fruit fruit : fruits) {
                System.out.println(fruit.howToEat());
            }
        }
     }
}
