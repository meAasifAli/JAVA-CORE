# OOP

OOP stands for Object-Oriented Programming.

Procedural programming is about writing procedures or methods that perform operations on the data, while object-oriented programming is about creating objects that contain both data and methods.

Object-oriented programming has several advantages over procedural programming:

- OOP is faster and easier to execute
- OOP provides a clear structure for the programs
- OOP helps to keep the Java code DRY "Don't Repeat Yourself", and makes the code easier to maintain, modify and debug
- OOP makes it possible to create full reusable applications with less code and shorter development time

### What are Classes and Objects?

Classes and objects are the two main aspects of object-oriented programming.

Imagine a car , A car is a blueprint for a car object. Car has multiple objects such as Audi, BMW, Tesla etc.

For Each object has it's own properties and methods. like speed, break, stop etc.


So, a class is a template for objects, and an object is an instance of a class.

When the individual objects are created, they inherit all the variables and methods from the class.

### Java Classes/Objects

Java is an object-oriented programming language.

Everything in Java is associated with classes and objects, along with its attributes and methods. For example: in real life, a car is an object. The car has attributes, such as weight and color, and methods, such as drive and brake.

### Create a Class in Java

```java
public class Main {
  int x = 5;
}
```

### Create an Object in Java

```java
public class Main {
  int x = 5;

  public static void main(String[] args) {
    Main myObj = new Main(); // Create an object of Main
    System.out.println(myObj.x); // Call the object
  }
}
```

### Multiple objects

```java
public class Main {
  int x = 5;

  public static void main(String[] args) {
    Main myObj1 = new Main();  // Create a myObj1 object of Main
    Main myObj2 = new Main();  // Create a myObj2 object of Main
    System.out.println(myObj1.x);  // Outputs 5
  } 
}
```  

### using multiple classes

we can also create an object of a class and access it in another class. This is often used for better organization of classes (one class has all the attributes and methods, while the other class holds the main() method (code to be executed)).

`Main.java`

```java
public class Main {
  int x = 5;

  public static void main(String[] args) {
   
  }
}
```

`Second.java`

```java
class Second {
  public static void main(String[] args) {
    Main myObj = new Main();
    System.out.println(myObj.x);
  }
}

```
### class Attributes

Above we used the term "variable" for x in the example (as shown below). It is actually an attribute of the class. Or you could say that class attributes are variables within a class:

`Create a class called "Main" with two attributes: x and y`

```java
public class Main {
  int x = 5;
  int y = 3;
}
```
### Accessing Attributes

we can access attributes by creating an object of the class, and by using the dot syntax (.):

The following example will create an object of the Main class, with the name myObj. We use the x attribute on the object to print its value:

```java
public class Main {
  int x = 5;

  public static void main(String[] args) {
    Main myObj = new Main();
    System.out.println(myObj.x);
  }
}
```

### Modify attributes

```java
public class Main {
  int x;

  public static void main(String[] args) {
    Main myObj = new Main();
    myObj.x = 40;
    System.out.println(myObj.x);
  }
}
```
### override existing values

```java
public class Main {
  int x = 10;

  public static void main(String[] args) {
    Main myObj = new Main();
    myObj.x = 25; // x is now 25
    System.out.println(myObj.x);
  }
}
```

### final attribute

If we don't want the ability to override existing values, declare the attribute as final

```java
public class Main {
  final int x = 10;

  public static void main(String[] args) {
    Main myObj = new Main();
    myObj.x = 25; // will generate an error: cannot assign a value to a final variable
    System.out.println(myObj.x);
  }
}

```

### Multiple Objects

If we create multiple objects of one class, we can change the attribute values in one object, without affecting the attribute values in the other:

```java
public class Main {
  int x = 5;

  public static void main(String[] args) {
    Main myObj1 = new Main();  // Object 1
    Main myObj2 = new Main();  // Object 2
    myObj2.x = 25;
    System.out.println(myObj1.x);  // Outputs 5
    System.out.println(myObj2.x);  // Outputs 25
  }
}
```
### Multiple Attributes

```java
public class Main {
  String fname = "John";
  String lname = "Doe";
  int age = 24;

  public static void main(String[] args) {
    Main myObj = new Main();
    System.out.println("Name: " + myObj.fname + " " + myObj.lname);
    System.out.println("Age: " + myObj.age);
  }
}
```

### Class Methods


```java
public class Main {
  static void myMethod() {
    System.out.println("Hello World!");
  }
}
```

```java
public class Main {
  static void myMethod() {
    System.out.println("Hello World!");
  }

  public static void main(String[] args) {
    myMethod();
  }
}

// Outputs "Hello World!"

```

### Static vs. Public

we will often see Java programs that have either static or public attributes and methods.

In the example above, we created a static method, which means that it can be accessed without creating an object of the class, unlike public, which can only be accessed by objects

```java
public class Main {
  // Static method
  static void myStaticMethod() {
    System.out.println("Static methods can be called without creating objects");
  }

  // Public method
  public void myPublicMethod() {
    System.out.println("Public methods must be called by creating objects");
  }

  // Main method
  public static void main(String[] args) {
    myStaticMethod(); // Call the static method
    // myPublicMethod(); This would compile an error

    Main myObj = new Main(); // Create an object of Main
    myObj.myPublicMethod(); // Call the public method on the object
  }
}
```

### Java Constructors 

A constructor in Java is a special method that is used to initialize objects. The constructor is called when an object of a class is created. It can be used to set initial values for object attributes:

```java
// Create a Main class
public class Main {
  int x;  // Create a class attribute

  // Create a class constructor for the Main class
  public Main() {
    x = 5;  // Set the initial value for the class attribute x
  }

  public static void main(String[] args) {
    Main myObj = new Main(); // Create an object of class Main (This will call the constructor)
    System.out.println(myObj.x); // Print the value of x
  }
}

```

### Constructor Parameters
Constructors can also take parameters, which is used to initialize attributes.

```java
public class Main {
  int x;

  public Main(int y) {
    x = y;
  }

  public static void main(String[] args) {
    Main myObj = new Main(5);
    System.out.println(myObj.x);
  }
}

// Outputs 5
```

### Access Modifiers

By now, we are quite familiar with the public keyword that appears in almost all of our examples:

```java
public class Main {

}
```
The public keyword is an access modifier, meaning that it is used to set the access level for classes, attributes, methods and constructors.

We divide modifiers into two groups:

- Access Modifiers - controls the access level
- Non-Access Modifiers - do not control access level, but provides other functionality

### Access Modifiers for classes

There are four access modifiers for classes:

- public - accessible from anywhere
- default (no modifier) - accessible only in the same package

```java
//public
public class Main {
  public static void main(String[] args) {
    System.out.println("Hello World");
  }
}

//default (no modifier)
class MyClass {
  public static void main(String[] args) {
    System.out.println("Hello World");
  }
}

```

### Access Modifiers for Attributes, methods and constructors

- public - accessible from anywhere
- private - accessible only within the same class
- protected - accessible within the same package and by subclasses
- default (no modifier) - accessible only in the same package

```java
//public
public class Main {
  public String fname = "John";
  public String lname = "Doe";
  public String email = "john@doe.com";
  public int age = 24;
}

//private
public class Main {
  private String fname = "John";
  private String lname = "Doe";
  private String email = "john@doe.com";
  private int age = 24;
  
  public static void main(String[] args) {
    Main myObj = new Main();
    System.out.println("Name: " + myObj.fname + " " + myObj.lname);
    System.out.println("Email: " + myObj.email);
    System.out.println("Age: " + myObj.age);
  }
}

//default

class Person {
  String fname = "John";
  String lname = "Doe";
  String email = "john@doe.com";
  int age = 24;
  
  public static void main(String[] args) {
    Person myObj = new Person();
    System.out.println("Name: " + myObj.fname + " " + myObj.lname);
    System.out.println("Email: " + myObj.email);
    System.out.println("Age: " + myObj.age);
  }
}


//protected

class Person {
  protected String fname = "John";
  protected String lname = "Doe";
  protected String email = "john@doe.com";
  protected int age = 24;
}

class Student extends Person {
  private int graduationYear = 2018;
  public static void main(String[] args) {
    Student myObj = new Student();
    System.out.println("Name: " + myObj.fname + " " + myObj.lname);
    System.out.println("Email: " + myObj.email);
    System.out.println("Age: " + myObj.age);
    System.out.println("Graduation Year: " + myObj.graduationYear);
  }
}


```

### Non-Access Modifiers

For classes, you can use either final or abstract:

- final - the class cannot be inherited from
- abstract - the class cannot be used to create objects

For attributes and methods

- final - Attributes and methods cannot be overridden/modified
- static - Attributes and methods belong to the class, rather than an object
- abstract - Can only be used in an abstract class, and can only be used on methods. The method does not have a body, for example abstract void run();
- transient - Attributes and methods are not serialized (saved) when an object is saved
- synchronized - Methods can only be accessed by one thread at a time
- volatile - The value of an attribute is always read from the main memory and not from the cache or registers of the processor

### Abstract method

An abstract method belongs to an abstract class, and it does not have a body. The body is provided by the subclass:

```java
// Code from filename: Main.java
// abstract class
abstract class Main {
  public String fname = "John";
  public int age = 24;
  public abstract void study(); // abstract method
}

// Subclass (inherit from Main)
class Student extends Main {
  public int graduationYear = 2018;
  public void study() { // the body of the abstract method is provided here
    System.out.println("Studying all day long");
  }
}
// End code from filename: Main.java

// Code from filename: Second.java
class Second {
  public static void main(String[] args) {
    // create an object of the Student class (which inherits attributes and methods from Main)
    Student myObj = new Student();

    System.out.println("Name: " + myObj.fname);
    System.out.println("Age: " + myObj.age);
    System.out.println("Graduation Year: " + myObj.graduationYear);
    myObj.study(); // call abstract method
  }
}
```