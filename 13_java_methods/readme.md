### Java Methods

A method is a block of code which only runs when it is called.
You can pass data, known as parameters, into a method.
Methods are used to perform certain actions, and they are also known as functions.
Why use methods? To reuse code: define the code once, and use it many times.

### Create a Method

A method must be declared within a class. It is defined with the name of the method, followed by parentheses (). Java provides some pre-defined methods, such as System.out.println(), but you can also create your own methods to perform certain actions:

### example

```java
public class Main {
  static void myMethod() {
    // code to be executed
  }
}
```

- myMethod() is the name of the method
- static means that the method belongs to the Main class and not an object of the Main class. 
- void means that this method does not have a return value.

### Call a Method

To call a method in Java, write the method's name followed by two parentheses () and a semicolon

```java
public class Main {
  static void myMethod() {
    System.out.println("I just got executed!");
  }

  public static void main(String[] args) {
    myMethod();
  }
}

```

A method can also be called multiple times:

```java
public class Main {
  static void myMethod() {
    System.out.println("I just got executed!");
  }

  public static void main(String[] args) {
    myMethod();
    myMethod();
    myMethod();
  }
}

// I just got executed!
// I just got executed!
// I just got executed!
```

### Method Parameters

Information can be passed to methods as parameter. Parameters are specified after the method name, inside the parentheses. You can add as many parameters as you want, just separate them with a comma.

```java
public class Main {
  static void myMethod(String fname, int age) {
    System.out.println(fname + " is " + age);
  }

  public static void main(String[] args) {
    myMethod("John", 36);
  }
}

// John is 36
```

### Return Values

we used the void keyword in above, which indicates that the method should not return a value.

If you want the method to return a value, you can use a primitive data type (such as int, char, etc.) instead of void, and use the return keyword inside the method:

```java
public class Main {
  static int myMethod(int x) {
    return 5 + x;
  }

  public static void main(String[] args) {
    System.out.println(myMethod(3));
  }
}
// Outputs 8 (5 + 3)
```

### Java method overloading

Java allows you to define two or more methods with the same name, but with different parameters (either different number of parameters, or different types of parameters).

This is called method overloading:

```java
public class Main {
  static int myMethod(int x) {
    return 5 + x;
  }

  static double myMethod(double x) {
    return 5.0 + x;
  }

  public static void main(String[] args) {
    int myNum1 = myMethod(3);
    double myNum2 = myMethod(3.0);
    System.out.println("Integer: " + myNum1);
    System.out.println("Double: " + myNum2);
  }
}
// Integer: 8
// Double: 8.0
```
### Java Method Scope

In Java, variables are only accessible inside the region they are created. This is called scope.

### Method Scope

Variables declared directly inside a method are available anywhere in the method following the line of code in which they were declared:


```java
public class Main {
  public static void main(String[] args) {

    // Code here CANNOT use x

    int x = 100;

    // Code here can use x
    System.out.println(x);
  }
}
```

### Block Scope
A block of code refers to all of the code between curly braces {}.

Variables declared inside blocks of code are only accessible by the code between the curly braces, which follows the line in which the variable was declared:

```java
public class Main {
  public static void main(String[] args) {

    // Code here CANNOT use x

    { // This is a block

      // Code here CANNOT use x

      int x = 100;

      // Code here CAN use x
      System.out.println(x);

    } // The block ends here

  // Code here CANNOT use x

  }
}
```

### Java Recursion

A method can call itself. This is called recursion and the method that calls itself is called a recursive method.

### Example

```java
public class Main {
  static int myMethod(int x) {
    if (x > 10) {
      return x - 1;
    } else {
        return myMethod(x + 1);

    }
  }

  public static void main(String[] args) {
    int result = myMethod(6);
    System.out.println(result);
  }
}
// Outputs 5
```

