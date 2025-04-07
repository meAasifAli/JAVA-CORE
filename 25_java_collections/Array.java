
import java.util.ArrayList;
import java.util.Collections;

public class Array {

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        //add elements
        names.add("John");
        names.add("Jane");
        names.add("Doe");

        // loop through ArrayList
        for (String name : names) {
            System.out.println(name);
        }

        //we can also add element at an index
        names.add(0, "Bob");

        //get name
        String name = names.get(0);
        System.out.println(name);

        //we can also change the value
        names.set(0, "Alice");

        //remove an element
        names.remove(0);

        //to remove all elements we can use clear()
        names.clear();
        System.out.println(names);

        //to check if the ArrayList is empty
        System.out.println(names.isEmpty());

        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        Collections.sort(cars);  // Sort cars
        for (String car : cars) {
            System.out.println(car);
        }

        //sort integers
        ArrayList<Integer> myNumbers = new ArrayList<Integer>();
        myNumbers.add(33);
        myNumbers.add(15);
        myNumbers.add(20);
        myNumbers.add(34);
        myNumbers.add(8);
        myNumbers.add(12);

        Collections.sort(myNumbers);  // Sort myNumbers

        for (int i : myNumbers) {
            System.out.println(i);
        }

    }
}
