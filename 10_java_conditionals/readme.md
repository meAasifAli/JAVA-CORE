# Java Conditional Statements

Java has the following conditional statements:

- Use if to specify a block of code to be executed, if a specified condition is true
- Use else to specify a block of code to be executed, if the same condition is false
- Use else if to specify a new condition to test, if the first condition is false
- Use switch to specify many alternative blocks of code to be executed

### The if Statement

Use the if statement to specify a block of Java code to be executed if a condition is true.

`syntax`

```java
if (condition) {
  // block of code to be executed if the condition is true
}
```

### examples

```java
int x = 20;
int y = 18;
if (x > y) {
  System.out.println("x is greater than y");
}
```

In the example above we use two variables, x and y, to test whether x is greater than y (using the > operator). As x is 20, and y is 18, and we know that 20 is greater than 18, we print to the screen that "x is greater than y".

### Java Else statement

Use the else statement to specify a block of code to be executed if the condition is false.

`syntax`

```java
if (condition) {
  // block of code to be executed if the condition is true
} else {
  // block of code to be executed if the condition is false
}
```

### examples

```java
int time = 20;
if (time < 18) {
  System.out.println("Good day.");
} else {
  System.out.println("Good evening.");
}
```

In the example above, time is greater than 18, so the condition is false, and the else statement is executed.

### Java Else If

Use the else if statement to specify a new condition if the first condition is false.

`syntax`

```java
if (condition1) {
  // block of code to be executed if condition1 is true
} else if (condition2) {
  // block of code to be executed if the condition1 is false and condition2 is true
} else { 
    //block of code to be executed if none of the above blocks are true
}
```

### examples

```java
int time = 22;
if (time < 10) {
  System.out.println("Good morning.");
} else if (time < 20) {
  System.out.println("Good day.");
} else {
  System.out.println("Good evening.");
}
```

In the example above, time is greater than 10, so the first condition is false. The next condition, (time < 20) is also false, so we go to the else condition and print to screen "Good evening.".

### Shorthand if-else

There is also a short-hand if else, which is known as the ternary operator because it consists of three operands.

It can be used to replace multiple lines of code with a single line, and is most often used to replace simple if else statements

`syntax`

```java
variable = (condition) ? expressionTrue :  expressionFalse;
```
### example

```java
int time = 20;
String result = (time < 18) ? "Good day." : "Good evening.";
System.out.println(result);
```
### Real-life example

This example shows how you can use if..else to "open a door" if the user enters the correct code

```java
int doorCode = 1337;

if (doorCode == 1337) {
  System.out.println("Correct code. The door is now open.");
} else {
  System.out.println("Wrong code. The door remains closed.");
}
```
