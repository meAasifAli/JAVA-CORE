# Java Booleans
Very often, in programming, you will need a data type that can only have one of two values, like:

- YES / NO
- ON / OFF
- TRUE / FALSE

For this, Java has a boolean data type, which can store true or false values.

### Boolean Values

A boolean type is declared with the boolean keyword and can only take the values true or false

```java
boolean isJavaFun = true;
boolean isFishTasty = false;
```

### Boolean Expression

A Boolean expression returns a boolean value: true or false.
This is useful to build logic, and find answers.

```java
int x = 10;
int y = 9;
System.out.println(x > y); // returns true, because 10 is higher than 9
```

### Real Life Example

Let's think of a "real life example" where we need to find out if a person is old enough to vote.

In the example below, we use the >= comparison operator to find out if the age (25) is greater than OR equal to the voting age limit, which is set to 18:

```java
int myAge = 25;
int votingAge = 18;
System.out.println(myAge >= votingAge);

```