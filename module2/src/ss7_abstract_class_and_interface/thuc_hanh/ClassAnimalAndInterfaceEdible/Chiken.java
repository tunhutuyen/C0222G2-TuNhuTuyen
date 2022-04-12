package ss7_abstract_class_and_interface.thuc_hanh.ClassAnimalAndInterfaceEdible;

public class Chiken extends Animal implements Edible{
    @Override
    public String makeSound() {
        return "Chicken: ò ó o!!!";
    }
    @Override
    public String howToEat(){
        return "could be fried";
    }
}
