# What is Java?
Java is a popular programming language, created in 1995.
It is owned by Oracle, and more than 3 billion devices run Java.

It is used for:

- Mobile applications (specially Android apps)
- Desktop applications
- Web applications
- Web servers and application servers
- Games
- Database connection
- And much, much more!

# Why Use Java?

- Java works on different platforms (Windows, Mac, Linux, Raspberry Pi, etc.)
- It is one of the most popular programming languages in the world
- It has a large demand in the current job market
- It is easy to learn and simple to use
- It is open-source and free
- It is secure, fast and powerful
- It has huge community support (tens of millions of developers)
- Java is an object oriented language which gives a clear structure to programs and allows code to be reused, lowering development costs
- As Java is close to C++ and C#, it makes it easy for programmers to switch to Java or vice versa

# Java Quickstart

In Java, every application begins with a class name, and that class must match the filename.

Let's create our first Java file, called Main.java, which can be done in any text editor (like Notepad).

The file should contain a "Hello World" message, which is written with the following code:

```java
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}

```

# Java Syntax

Above we created a Java file called Main.java, and we used the following code to print "Hello World" to the screen

```java
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}

```

Every line of code that runs in Java must be inside a class. And the class name should always start with an uppercase first letter. In our example, we named the class Main.

The name of the java file must match the class name. When saving the file, save it using the class name and add ".java" to the end of the filename. To run the example above on your computer, make sure that Java is properly installed

```
Hello World
```
# The main Method

The main() method is required and you will see it in every Java program

```java
public static void main(String[] args){}
```
Any code inside the main() method will be executed. 

# System.out.println()

The System.out.println() method is used to print text to the screen.

```java
System.out.println("Hello World");
```
