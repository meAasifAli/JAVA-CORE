# Collections in java
A collection is an object that represents a group of objects. A collections framework is a unified architecture for representing and manipulating collections. 

It consists of a set of interfaces and classes that allow developers to work with collections in a consistent and efficient manner.

In simple terms, the Java Collections Framework helps us manage a group of objects and perform operations on them efficiently and in an organized way. It makes it easier to develop applications by offering various methods to handle groups of objects. we can add, remove, search, and sort objects effectively using the Java Collections Framework.

## Collection Interfaces

In Java, an interface specifies a contract that must be fulfilled by any class that implements it. This means the implementing class must provide concrete implementations for all the methods declared in the interface.

In the Java Collections Framework, various collection interfaces like Set, List, and Queue extend the Collection interface, and they must adhere to the contract defined by the Collection interface.

<img src="https://cdn.hashnode.com/res/hashnode/image/upload/v1736532451482/6ef571c1-afe0-4314-9038-b472b06f4065.webp" height="300" width="100%"/>

1. At the root of the Java Collections Framework is the Iterable interface, which lets us iterate over the elements of a collection.

2. The Collection interface extends the Iterable interface. This means it inherits the properties and behavior of the Iterable interface and adds its own behavior for adding, removing, and retrieving elements.

3. Specific interfaces such as List, Set, and Queue further extend the Collection interface. Each of these interfaces has other classes implementing their methods. For example, ArrayList is a popular implementation of the List interface, HashSet implements the Set interface, and so on.

4. The Map interface is part of the Java Collections Framework, but it does not extend the Collection interface, unlike the others mentioned above.

6. All the interfaces and classes in this framework are part of the java.util package.


## Java ArrayList

The ArrayList class is a resizable array, which can be found in the java.util package.

The difference between a built-in array and an ArrayList in Java, is that the size of an array cannot be modified (if you want to add or remove elements to/from an array, you have to create a new one). While elements can be added and removed from an ArrayList whenever you want.

`example`:

```java
import java.util.ArrayList; // import the ArrayList class

ArrayList<String> cars = new ArrayList<String>(); // Create an ArrayList object
```
### Add Items

The ArrayList class has many useful methods. For example, to add elements to the list, use the add() method:

```java
import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    ArrayList<String> cars = new ArrayList<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");
    System.out.println(cars);
  }
}
```

we can also add an item at a specified position by referring to the index number:

```java
cars.add(0, "Mazda"); // Insert element at the beginning of the list (0)
```

### Access an Item
To access an element in the ArrayList, use the get() method and refer to the index number:

```java
cars.get(0);
```

### Change an Item
To modify an element, use the set() method and refer to the index number:

```java
cars.set(0, "Opel");
```

### Remove an Item
To remove an element, use the remove() method and refer to the index number:

```java
cars.remove(0);
```

To remove all the elements in the ArrayList, use the clear() method:

```java
cars.clear();
```
### ArrayList Size
To find out how many elements an ArrayList have, use the size method:

```java
cars.size();
```
### Loop Through an ArrayList
Loop through the elements of an ArrayList with a for loop, and use the size() method to specify how many times the loop should run:

```java
public class Main {
  public static void main(String[] args) {
    ArrayList<String> cars = new ArrayList<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");
    for (int i = 0; i < cars.size(); i++) {
      System.out.println(cars.get(i));
    }
  }
}
```

### Sort an ArrayList
Another useful class in the java.util package is the Collections class, which include the sort() method for sorting lists alphabetically or numerically:

```java
import java.util.ArrayList;
import java.util.Collections;  // Import the Collections class

public class Main {
  public static void main(String[] args) {
    ArrayList<String> cars = new ArrayList<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");
    Collections.sort(cars);  // Sort cars
    for (String car : cars) {
      System.out.println(car);
    }
  }
}
```

### Java LinkedList

In the previous chapter, we learned about the ArrayList class. The LinkedList class is almost identical to the ArrayList:

```java
// Import the LinkedList class
import java.util.LinkedList;

public class Main {
  public static void main(String[] args) {
    LinkedList<String> cars = new LinkedList<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");
    System.out.println(cars);
  }
}
```

### ArrayList vs. LinkedList
The LinkedList class is a collection which can contain many objects of the same type, just like the ArrayList.

The LinkedList class has all of the same methods as the ArrayList class because they both implement the List interface. This means that you can add items, change items, remove items and clear the list in the same way.

However, while the ArrayList class and the LinkedList class can be used in the same way, they are built very differently.

### How the ArrayList works
The ArrayList class has a regular array inside it. When an element is added, it is placed into the array. If the array is not big enough, a new, larger array is created to replace the old one and the old one is removed.

### How the LinkedList works
The LinkedList stores its items in "containers." The list has a link to the first container and each container has a link to the next container in the list. To add an element to the list, the element is placed into a new container and that container is linked to one of the other containers in the list.