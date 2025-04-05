
abstract class Animal {

    //abstract method
    public abstract void animalSound();

    //regular method
    public void sleep() {
        System.out.println("The animal sleeps");
    }
}

class Dog extends Animal {

    public void animalSound() {
        System.out.println("The dog barks");
    }

}

public class Abstraction {

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.animalSound();
        dog.sleep();
    }
}
