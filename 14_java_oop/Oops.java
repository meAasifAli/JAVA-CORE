
//creating a class
public class Oops {

    int x = 5;

    public static void main(String[] args) {
        Oops m = new Oops(); //create an object
        System.out.println(m.x);
        // we can create multiple objects of a class
        Oops m1 = new Oops();
        System.out.println(m1.x);
        Oops m2 = new Oops();
        System.out.println(m2.x);

        // Main obj = new Main(2017, "Aasif");
        // System.out.println(obj.name); // public attribute is accessed here from Main class
        // // System.out.println(obj.age); // private attribute can't be directly accessed here from Main class
        // // we can call getter method to acces it here
        // obj.getAge();
    }

}
