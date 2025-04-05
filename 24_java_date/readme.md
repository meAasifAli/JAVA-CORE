# Java Dates

Java does not have a built-in Date class, but we can import the java.time package to work with the date and time API. The package includes many date and time classes.

## LocalDate

The LocalDate class represents a date (year, month, day) without a time.

```java
import java.time.LocalDate;

public class Main {
  public static void main(String[] args) {
    LocalDate myObj = LocalDate.now(); // Create a date object
    System.out.println(myObj); // Display the current date
  }
}
```

## LocalTime	
Represents a time (hour, minute, second and nanoseconds (HH-mm-ss-ns))

```java
import java.time.LocalTime;

public class Main {
  public static void main(String[] args) {
    LocalTime myObj = LocalTime.now(); // Create a time object
    System.out.println(myObj); // Display the current time
  }
}
```

## LocalDateTime	
Represents both a date and a time (year, month, day, hour, minute, second, nanoseconds)

```java
import java.time.LocalDateTime;

public class Main {
  public static void main(String[] args) {
    LocalDateTime myObj = LocalDateTime.now(); // Create a date and time object
    System.out.println(myObj); // Display the current date and time
  }
}
```

## DateTimeFormatter	
Formatter for displaying and parsing date-time objects

```java
import java.time.LocalDateTime; // Import the LocalDateTime class
import java.time.format.DateTimeFormatter; // Import the DateTimeFormatter class

public class Main {
  public static void main(String[] args) {
    LocalDateTime myDateObj = LocalDateTime.now();
    System.out.println("Before formatting: " + myDateObj);
    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

    String formattedDate = myDateObj.format(myFormatObj);
    System.out.println("After formatting: " + formattedDate);
  }
}
```




