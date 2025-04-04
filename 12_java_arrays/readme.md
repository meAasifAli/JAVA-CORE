# Java Arrays

Arrays are used to store multiple values in a single variable, instead of declaring separate variables for each value.

To declare an array, define the variable type with square brackets:

```java
String[] cars;
```

We have now declared a variable that holds an array of strings. To insert values to it, you can place the values in a comma-separated list, inside curly braces:

```java
String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
```

### Access array elements

You access an array element by referring to the index number.

This example accesses the first element in the cars array.

```java
String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
System.out.println(cars[0]);
```

### Change an Array Element

To change an element, specify the index number and assign the new value:

```java
String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
cars[0] = "Opel";
System.out.println(cars[0]);
```

### Array Length

To find out how many elements an array has, use the length property:

```java
String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
System.out.println(cars.length);
```

### Loop Through an Array

You can loop through the array by using a for/for-each loops
```java
String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
for (String i : cars) {
    System.out.println(i);
}
```

### Array Methods in java

- compare() : Compares two arrays lexicographically.
- equals() :  Compares two arrays for equality.
- fill() :  Fills the specified element of the array with the specified value.
- sort() :  Sorts the specified array of objects into ascending order.
- toString() :  Returns a string representation of the contents of the specified array.


```java
String[] cars = {"Volvo", "BMW", "Tesla"};
String[] cars2 = {"Volvo", "BMW", "Tesla"};

System.out.println(Arrays.compare(cars, cars2)); 
```
```java
String[] cars = {"Volvo", "BMW", "Tesla"};
String[] cars2 = {"Volvo", "BMW", "Tesla"};

System.out.println(Arrays.equals(cars, cars2)); 
```

```java
String[] carLists = {"Volvo", "BMW", "Tesla", "Ford", "Fiat", "Mazda", "Audi"};
java.util.Arrays.sort(carLists);
for (String car : carLists) {
    System.out.println(car);
}
```

```java
String[] fruits = {"Banana", "Orange", "Apple", "Mango"};
java.util.Arrays.fill(fruits, "Kiwi");
for (String fruit : fruits) {
    System.out.println(fruit);
}

```