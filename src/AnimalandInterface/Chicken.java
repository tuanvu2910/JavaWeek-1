package AnimalandInterface;

import AnimalandInterface.edible.Edible;

public   class Chicken extends Animal implements Edible {
    public String makeSound(){
        return "Chicken : Cuc ta! Cuc tac";
    }
    @Override
    public String howToEat() {
        return "could be fried";
    }
}
