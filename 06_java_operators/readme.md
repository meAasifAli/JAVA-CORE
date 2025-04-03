# java Operators

Operators are used to perform operations on variables and values.

Java divides the operators into the following groups:

- Arithmetic operators
- Assignment operators
- Comparison operators
- Logical operators
- Bitwise operators

### Arithmetic Operators

Arithmetic operators are used to perform common mathematical operations.

`Example`

```java

        int a = 10;
        int b = 5;
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));
        System.out.println("++a = " + (++a));
        System.out.println("--b = " + (--b));
        System.out.println("a++ = " + (a++));
        System.out.println("b-- = " + (b--));
```

### Assignment Operators

Assignment operators are used to assign values to variables.

`Example`

```java

        int a = 10;
        int b = 5;
        a += b;
        System.out.println("a += b = " + a);
        a -= b;
        System.out.println("a -= b = " + a);
        a *= b;
        System.out.println("a *= b = " + a);
        a /= b;
        System.out.println("a /= b = " + a);
        a %= b;
        System.out.println("a %= b = " + a);
```

### Comparison Operators

Comparison operators are used to compare two values. Resulting in either true or false.

`Example`

```java
// Comparison Operators
        int a = 10;
        int b = 5;
        System.out.println("a == b = " + (a == b));
        System.out.println("a != b = " + (a != b));
        System.out.println("a > b = " + (a > b));
        System.out.println("a < b = " + (a < b));
        System.out.println("a >= b = " + (a >= b));
        System.out.println("a <= b = " + (a <= b));
```

### Logical Operators

Logical operators are used to combine two or more conditions.

`Example`

```java
// Logical Operators
        int a = 10;
        int b = 5;
        System.out.println("a > 5 && a < 15 = " + (a > 5 && a < 15));
        System.out.println("a > 5 || a < 15 = " + (a > 5 || a < 15));
        System.out.println("!a > 5 = " + !(a > 5));
```

