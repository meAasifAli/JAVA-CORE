
public class Var {

    public static void main(String[] args) {
        String name = "John";
        System.out.println(name);

        double d = 3.56;
        System.out.println(d);

        // we can declare a variable without initializing it
        int num;
        num = 5; // we can initialize it later
        System.out.println(num);

        // byte b = 35;
        // b = 67; // if we assign new value to a variable, it will overwrite the old value
        // System.out.println(b);
        String n = "Aasif";
        System.out.println("Hey: " + n); // plus operator is used to To combine both text and a variable

        // we can also use + operator to combine variables
        String firstName = "John ";
        String lastName = "Doe";
        String fullName = firstName + lastName;
        System.out.println(fullName);

        //Declare many variables
        int x = 5, y = 6, z = 50;
        System.out.println(x + y + z);

        //real life example involving variables
        double marks = 85.5;
        String subject = "Math";
        boolean pass = true;
        char grade = 'A';

        System.out.println("I got " + marks + " marks in " + subject + " and I passed with grade " + grade + " pass: " + pass);

        // Calculate Area of a Rectangle
        double lengthOfRectangle = 5.678;
        double widthOfRectangle = 3.456;
        double areaOfRectangle = lengthOfRectangle * widthOfRectangle;
        System.out.println("The area of the rectangle is " + areaOfRectangle);
    }
}
