# Java Variables
Variables are containers for storing data values.

In Java, there are different types of variables, for example:

- String - stores text, such as "Hello". String values are surrounded by double quotes
- int - stores integers (whole numbers), without decimals, such as 123 or -123
- float - stores floating point numbers, with decimals, such as 19.99 or -19.99
- char - stores single characters, such as 'a' or 'B'. Char values are surrounded by single quotes
- boolean - stores values with two states: true or false

# Declaring (Creating) Variables
To create a variable, you must specify the type and assign it a value:

```java
type variableName = value;
```

Where type is one of Java's types (such as int or String), and variableName is the name of the variable (such as x or name). The equal sign is used to assign values to the variable.

# Example 1

```java
String name = "John";
System.out.println(name);
```

# Example 2

```java
double d = 3.56;
System.out.println(d);
```

`note`: We can also declare a variable without assigning it a value, and assign a value later:

```java
int myNum;
myNum = 5;
System.out.println(myNum);
```
`note`:  if we assign a new value to an existing variable, it will overwrite the previous value:

```java
int myNum = 5;
myNum = 10;
System.out.println(myNum);
//output will be 10
```
# Final Variables

If we don't want others (or ourselves) to overwrite existing values, use the final keyword (this will declare the variable as "final" or "constant", which means unchangeable and read-only)

```java
final int myNum = 15;
myNum = 20;  // will generate an error: cannot assign a value to a final variable
```

# Display varaibles

The println() method is often used to display variables,To combine both text and a variable, use the + character

```java
String name = "John";
System.out.println("Hello " + name);
```

`note`: we can also use the + character to add a variable to another variable

```java
String firstName = "John ";
String lastName = "Doe";
String fullName = firstName + lastName;
System.out.println(fullName);
```

`note`: For numeric values, the + character works as a mathematical operator 

```java
int x = 5;
int y = 6;
System.out.println(x + y);
// output will be 11
```

# Declare Many Variables

To declare more than one variable of the same type, you can use a comma-separated list:

```java
int x = 5, y = 6, z = 50;
System.out.println(x + y + z);
```

# One Value to Multiple Variables

You can also assign the same value to multiple variables in one line:

```java
int x, y, z;
x = y = z = 50;
System.out.println(x + y + z);
```

# Java identifiers

All Java variables must be identified with unique names.
These unique names are called `identifiers`.
Identifiers can be short names (like x and y) or more descriptive names (age, sum, totalVolume).

`note`: It is recommended to use descriptive names in order to create understandable and maintainable code:

```java
// Good
int minutesPerHour = 60;

// OK, but not so easy to understand what m actually is
int m = 60;
```

# Naming Rules

- Names can contain letters, digits, underscores, and dollar signs
- Names must begin with a letter
- Names should start with a lowercase letter, and cannot contain whitespace
- Names can also begin with $ and _
- Names are case-sensitive ("myVar" and "myvar" are different variables)
- Reserved words (like Java keywords, such as int or boolean) cannot be used as names

# Real Life Variables

```java
double marks = 85.5;
String subject = "Math";
boolean pass = true;
char grade = 'A';

System.out.println("I got " + marks + " marks in " + subject + " and I passed with grade " + grade + " pass: " + pass);
```

### Calculate area of a Rectangle

```java
double lengthOfRectangle = 5.678;
double widthOfRectangle = 3.456;
double areaOfRectangle = lengthOfRectangle * widthOfRectangle;
System.out.println("The area of the rectangle is " + areaOfRectangle);
```