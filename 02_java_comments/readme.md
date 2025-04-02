# Java Comments
Comments can be used to explain Java code, and to make it more readable. It can also be used to prevent execution when testing alternative code.

# Single-line Comments

Single-line comments start with two forward slashes (//).
Any text between // and the end of the line is ignored by Java (will not be executed).

```java
// single line comment
System.out.println("Hello World!"); 
```
# Multi-line Comments

Multi-line comments start with a slash and an asterisk (/*) and ends with an asterisk and a slash (*/).

Any text between /* and */ is ignored by Java (will not be executed).

```java
/*
Multi-line comment
can span
multiple lines
*/
System.out.println("Hello World!"); 
```
# Documentation Comments

Documentation comments start with a slash and two asterisks (/**) and ends with an asterisk and a slash (*/).

Javadoc is a tool that extracts the documentation comments from the source code and generates an API documentation in HTML format.

```java
/**
* This is my first Java program.
* This program will print 'Hello World' as output
*/
public class MyFirstJavaProgram {
   public static void main(String[] args) {
      System.out.println("Hello World"); // prints Hello World
   }
}
```