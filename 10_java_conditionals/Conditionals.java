
public class Conditionals {

    public static void main(String[] args) {
        // if statement
        int age = 18;
        if (age >= 18) {
            System.out.println("You are eligible to vote");
        }

        //else statement
        int number = 9;
        if (number % 2 == 0) {
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }

        // else if statement
        int day = 3;
        if (day == 1) {
            System.out.println("Monday");
        } else if (day == 2) {
            System.out.println("Tuesday");
        } else if (day == 3) {
            System.out.println("Wednesday");
        } else {
            System.out.println("Invalid day");
        }
    }
}
