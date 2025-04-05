# Java User Input
The Scanner class is used to get user input, and it is found in the java.util package.

To use the Scanner class, create an object of the class and use any of the available methods found in the Scanner class documentation. In our example, we will use the nextLine() method, which is used to read Strings:

```java
import java.util.Scanner;  // Import the Scanner class

class Main {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Enter username");

    String userName = myObj.nextLine();  // Read user input
    System.out.println("Username is: " + userName);  // Output user input
  }
}

```
### methods

- nextLine() :  The nextLine() method reads a line of text input by the user.

- nextInt(): The nextInt() method reads a integer input by the user.

- nextDouble():  The nextDouble() method reads a double input by the user.

- nextFloat(): The nextFloat() method reads a float input by the user.

- nextBoolean():  The nextBoolean() method reads a boolean input by the user.

- nextByte(): The nextByte() method reads a byte input by the user.

- nextShort(): The nextShort() method reads a short input by the user.

- nextLong(): The nextLong() method reads a long input by the user.

```java
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);

    System.out.println("Enter name, age and salary:");

    // String input
    String name = myObj.nextLine();

    // Numerical input
    int age = myObj.nextInt();
    double salary = myObj.nextDouble();

    // Output input by user
    System.out.println("Name: " + name);
    System.out.println("Age: " + age);
    System.out.println("Salary: " + salary);
  }
}
```