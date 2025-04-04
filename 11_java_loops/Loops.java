
public class Loops {

    public static void main(String[] args) {
        //while loop in java
        int i = 0;
        while (i < 10) {
            System.out.println(i);
            i++;
        }

        //do while loop in java
        int j = 0;
        do {
            System.out.println(j);
            j++;
        } while (j < 10);

        //real-life example of while loop
        int countdown = 3;

        while (countdown > 0) {
            System.out.println(countdown);
            countdown--;
        }

        System.out.println("Happy New Year!!");

        // for loop
        for (int k = 0; k < 5; k++) {
            System.out.println(k);
        }

        //nested loop 
        // Outer loop
        for (int a = 1; a <= 2; a++) {
            System.out.println("Outer: " + a); // Executes 2 times

            // Inner loop
            for (int b = 1; b <= 3; b++) {
                System.out.println(" Inner: " + b); // Executes 6 times (2 * 3)
            }
        }

        // for each loop
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String car : cars) {
            System.out.println(car);
        }

        int number = 2;

        // Print the multiplication table for the number 2
        for (int c = 1; c <= 10; c++) {
            System.out.println(number + " x " + c + " = " + (number * c));
        }

        // breaking out of the loop
        for (int d = 0; d < 10; d++) {
            if (d == 4) {
                break;
            }
            System.out.println(d);
        }

        //continue
        for (int e = 0; e < 10; e++) {
            if (e == 4) {
                continue;
            }
            System.out.println(e);
        }
    }
}
