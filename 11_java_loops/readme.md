# Loops

Loops can execute a block of code as long as a specified condition is reached.
Loops are handy because they save time, reduce errors, and they make code more readable.

### Java While Loop

The while loop loops through a block of code as long as a specified condition is true

`syntax`

```java
while (condition) {
  // code block to be executed
}
```

### example

```java
        int i = 0;
        while (i < 10) {
            System.out.println(i);
            i++;
        }
```

`note` :  Do not forget to increase the variable used in the condition, otherwise the loop will never end!

### Java Do/While Loop

The do/while loop is a variant of the while loop. This loop will execute the code block once, before checking if the specified condition is true, then it will repeat the loop as long as the condition is true.

`syntax`

```java
do {
  // code block to be executed
}
while (condition);
```

### example

```java
        int i = 0;
        do {
            System.out.println(i);
            i++;
        } while (i < 10);
```

### Real life example of while loop

To demonstrate a practical example of the while loop, we have created a simple "countdown" program:

```java
int countdown = 3;

while (countdown > 0) {
  System.out.println(countdown);
  countdown--;
}

System.out.println("Happy New Year!!");
```

### Java for loop

When you know exactly how many times you want to loop through a block of code, use the for loop instead of a while loop

`syntax`

```java
for (statement 1; statement 2; statement 3) {
  // code block to be executed
}
```
- Statement 1 is executed (one time) before the execution of the code block.

- Statement 2 defines the condition for executing the code block.

- Statement 3 is executed (every time) after the code block has been executed.

### example

```java
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
```

### Nested loops

It is also possible to place a loop inside another loop. This is called a nested loop.
The "inner loop" will be executed one time for each iteration of the "outer loop":

```java
// Outer loop
for (int i = 1; i <= 2; i++) {
  System.out.println("Outer: " + i); // Executes 2 times
  
  // Inner loop
  for (int j = 1; j <= 3; j++) {
    System.out.println(" Inner: " + j); // Executes 6 times (2 * 3)
  }
} 
```

### for each loop

There is also a "for-each" loop, which is used exclusively to loop through elements in an array

`syntax`

```java
for (type variableName : arrayName) {
  // code block to be executed
}
```

### example

```java
        int[] numbers = {1, 2, 3, 4, 5};
        for (int number : numbers) {
            System.out.println(number);
        }
```

### real life example of for loop
In this example, we will use a for loop to print the multiplication table for the number 2:

```java
int number = 2;

// Print the multiplication table for the number 2
for (int i = 1; i <= 10; i++) {
  System.out.println(number + " x " + i + " = " + (number * i));
} 
```


### Java Break

we have already seen the break statement used in a switch statement. It was used to "jump out" of a switch statement.
The break statement can also be used to jump out of a loop.

```java
for (int i = 0; i < 10; i++) {
  if (i == 4) {
    break;
  }
  System.out.println(i);
}
```
### Java Continue

The continue statement breaks one iteration (in the loop), if a specified condition occurs, and continues with the next iteration in the loop.

```java
for (int i = 0; i < 10; i++) {
  if (i == 4) {
    continue;
  }
  System.out.println(i);
}
```