
public class Main {

    public String name = "John"; // attribute with public access modifier can be accessed by any other class
    private int age = 30; // attribute with private access modifier can only be accessed by the class itself
    protected String address = "123 Main St"; // attribute with protected access modifier can be accessed by the class itself and its subclasses
    int x = 5;
    int y = 10;
    final int z = 15;

    public void getAge() {
        System.out.println("Age: " + age);
    }

    int modelYear;
    String modelName;

    public Main(int year, String name) {
        modelYear = year;
        modelName = name;
    }

    // Static method
    static void myStaticMethod() {
        System.out.println("Static methods can be called without creating objects");
    }

    // Public method
    public void myPublicMethod() {
        System.out.println("Public methods must be called by creating objects");
    }

    public static void main(String[] args) {
        Main obj = new Main(1969, "Mustang");
        System.out.println(obj.x); // accessing attributes
        obj.x = 10; //modify attributes
        System.out.println(obj.x);
        obj.y = 20; // overwrite attributes
        System.out.println(obj.y);
        // obj.z = 10; // cannot overwrite final attributes
        // System.out.println(obj.z);

        myStaticMethod(); // Call the static method
        // myPublicMethod(); This would compile an error

        // Main myObj = new Main(); // Create an object of Main
        // myObj.myPublicMethod(); // Call the public method on the object
        System.out.println(obj.modelYear + " " + obj.modelName);
        System.out.println(obj.name);
        System.out.println(obj.age); // private attribute within the same class can be accessed
        System.out.println(obj.address);
    }
}
