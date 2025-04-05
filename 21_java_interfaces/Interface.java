
interface Animal {

    public void animalSound();

    public void sleep();
}

class Pig implements Animal {

    public void animalSound() {
        // The body of animalSound() is provided here
        System.out.println("The pig says: wee wee");
    }

    public void sleep() {
        // The body of sleep() is provided here
        System.out.println("Zzz");
    }
}

public class Interface {

    public static void main(String[] args) {
        Pig pig = new Pig();  // Create a Pig object
        pig.animalSound();

        pig.sleep();

    }
}
