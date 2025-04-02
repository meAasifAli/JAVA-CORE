# Print Text

we learnt already that we can use the println() method to output values or print text in Java

```Java
System.out.println("Hello World!");
```

Yowe can add as many println() methods as we want. Note that it will add a new line for each method

```java
System.out.println("Hello World!");
System.out.println("I am learning Java.");
System.out.println("It is awesome!");

```

# Double quotes

Text must be wrapped inside double quotations marks "".

```java
System.out.println("This sentence will work!");
```

# The Print() Method

The print() method is similar to the println() method. The only difference is that it does not add a new line at the end of the statement.

```java
System.out.print("Hello World!");
System.out.print("I am learning Java.");
System.out.print("It is awesome!");
```

# Escape Sequences

Java has a special character called an escape sequence. It is used to represent special characters.

```java
System.out.println("Hello \"World\"!");
```

The escape sequence is represented by a backslash (\). The backslash is followed by a character that represents a special character. In the example above, the escape sequence \" is used to represent the double quotation mark.

# Print Numbers
we can also use the println() method to print numbers.
However, unlike text, we don't put numbers inside double quotes:

```java
System.out.println(3);
System.out.println(358);
System.out.println(50000);
```

we can also perform mathematical calculations inside the println() method:

```java
System.out.println(3 + 5);
System.out.println(358 + 50000);
System.out.println(50000 - 358);
```