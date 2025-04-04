The Java Math class has many methods that allows you to perform mathematical tasks on numbers.

### Math.max(x,y)
The Math.max(x,y) method can be used to find the highest value of x and y

```java
public class Main {
  public static void main(String[] args) {
    System.out.println(Math.max(5, 10));
  }
}
```

### Math.min(x,y)

The Math.min(x,y) method can be used to find the lowest value of x and y

```java
public class Main {
  public static void main(String[] args) {
    System.out.println(Math.min(5, 10));
  }
}
```

### Math.sqrt(x)

The Math.sqrt(x) method returns the square root of x

```java
public class Main {
  public static void main(String[] args) {
    System.out.println(Math.sqrt(64));
  }
}
```

### Math.abs(x)

The Math.abs(x) method returns the absolute (positive) value of x

```java
System.out.println(Math.abs(-4.7));
```

### Math.random()

The Math.random() method returns a random number between 0.0, and 1.0

```java
public class Main {
  public static void main(String[] args) {
    System.out.println(Math.random());
  }
}
```

`note`: to get more control over random numbers, you can multiply the random number by the highest number you want to get, and then round the result

```java
public class Main {
  public static void main(String[] args) {
    int randomNum = (int)(Math.random() * 101);
    System.out.println(randomNum);
  }
}
```

### Math.pow(a,b)

The Math.pow(a,b) method returns the value of a raised to the power of b

```java
public class Main {
  public static void main(String[] args) {
    System.out.println(Math.pow(5, 2));
  }
}
```

### Math.round(x)

The Math.round(x) method rounds a number to the nearest integer

```java
public class Main {
    public static void main(String[] args) {
        System.out.println(Math.round(9.99));
    }
}

### Math.ceil(x)

The Math.ceil(x) method rounds a number UP to the nearest integer

```java
public class Main {
    public static void main(String[] args) {
        System.out.println(Math.ceil(9.99));
    }
}
```

### Math.floor(x)

The Math.floor(x) method rounds a number DOWN to the nearest integer

```java
public class Main {

    public static void main(String[] args) {
        System.out.println(Math.floor(9.99));
    }
    
}