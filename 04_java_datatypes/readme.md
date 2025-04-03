# Data types in Java

A variable in Java must be a specified data type

```java
int myNum = 5;               // Integer (whole number)
float myFloatNum = 5.99f;    // Floating point number
char myLetter = 'D';         // Character
boolean myBool = true;       // Boolean
String myText = "Hello";     // String
```

# Data types are divided into two groups:

- Primitive data types - includes `byte`, `short`, `int`, `long`, `float`, `double`, `boolean` and `char`
- Non-primitive data types - such as `String`, `Arrays` and `Classes` 

### Primitive Data Types

A primitive data type specifies the type of a variable and the kind of values it can hold.

There are eight primitive data types in Java:

- `byte`: 	Stores whole numbers from -128 to 127

- `short`: 	Stores whole numbers from -32,768 to 32,767
- `int`: 	Stores whole numbers from -2^31 to 2^31-1
- `long`: 	Stores whole numbers from -2^63 to 2^63-1
- `float`: 	Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
- `double`: 	Stores fractional numbers. Sufficient for storing 15 decimal digits
- `boolean`: 	Stores true or false values
- `char`: 	Stores a single character/letter or ASCII values

# Java Numbers

Primitive number types are divided into two groups:

- `Integer` types stores whole numbers, positive or negative (such as 123 or -456), without decimals. Valid types are `byte`, `short`, `int` and `long`. Which type you should use, depends on the numeric value.

- `Floating` point types represents numbers with a fractional part, containing one or more decimals. There are two types: `float` and `double`.

# Integer types

- `Byte` : The byte data type can store whole numbers from -128 to 127. This can be used instead of int or other integer types to save memory when you are certain that the value will be within -128 and 127:

```java
byte myNum = 100;
System.out.println(myNum);
```

- `short`: The short data type can store whole numbers from -32,768 to 32,767:

```java
short myNum = 5000;
System.out.println(myNum);
```

- `int`: By default, the int data type is a 32-bit signed two's complement integer. It has a minimum value of -2^31 and a maximum value of 2^31-1:

```java
int myNum = 100000;
System.out.println(myNum);
```

- `long`: The long data type is a 64-bit two's complement integer. The signed long has a minimum value of -2^63 and a maximum value of 2^63-1:

```java

long myNum = 15000000000L;
System.out.println(myNum);
```
# Floating Point Types

Yowe should use a floating point type whenever we need a number with a decimal, such as 9.99 or 3.14515.

The float and double data types can store fractional numbers. Note that you should end the value with an "f" for floats and "d" for doubles


- `Float Example`

```java
float myNum = 5.75f;
System.out.println(myNum);
```

- `Double Example`

```java
double myNum = 19.99d;
System.out.println(myNum);
```

# Scientific Numbers

A floating point number can also be a scientific number with an "e" to indicate the power of 10

```java
float f1 = 35e3f;
double d1 = 12E4d;
System.out.println(f1);
System.out.println(d1);
```

# Boolean Type

The boolean data type can only have two values: true or false.

```java
boolean isJavaFun = true;
boolean isFishTasty = false;
System.out.println(isJavaFun);     // Outputs true
System.out.println(isFishTasty);   // Outputs false
```

# Character Type

The char data type is used to store a single character. The character must be surrounded by single quotes, like 'A' or 'c'

```java
char myGrade = 'B';
System.out.println(myGrade);
```
Alternatively, if we are familiar with `ASCII `values, we can use those to display certain characters:

```java
char myChar = 65; // ASCII value for 'A'
System.out.println(myChar);
```

### Real-Life Example of Data types

```java
// Create variables of different data types
int items = 50;
float costPerItem = 9.99f;
float totalCost = items * costPerItem;
char currency = '$';

// Print variables
System.out.println("Number of items: " + items);
System.out.println("Cost per item: " + costPerItem + currency);
System.out.println("Total cost = " + totalCost + currency);
```

# Non-Primitive Data Types

Non-primitive data types are called reference types because they refer to objects.

The main differences between primitive and non-primitive data types are:

- Primitive types in Java are predefined and built into the language, while non-primitive types are created by the programmer (except for String).
- Non-primitive types can be used to call methods to perform certain operations, whereas primitive types cannot.
- Primitive types start with a lowercase letter (like int), while non-primitive types typically starts with an uppercase letter (like String).
- Primitive types always hold a value, whereas non-primitive types can be null.