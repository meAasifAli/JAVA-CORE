
import java.util.Collections;
import java.util.LinkedList;

public class LL {

    public static void main(String[] args) {
        LinkedList<String> cars = new LinkedList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        //methods
        cars.addFirst("Opel");
        cars.addLast("Fiat");

        Collections.sort(cars); // sort

        //loop
        for (String car : cars) {
            System.out.println(car);
        }

        System.out.println(cars.getLast()); //get last element
        System.out.println(cars.getFirst()); //get first element

        System.out.println(cars.get(2));

        // remove
        cars.remove(0);
        cars.removeFirst();
        cars.removeLast();

        LinkedList<Integer> myNumbers = new LinkedList<Integer>();

        myNumbers.add(33);
        myNumbers.add(15);
        myNumbers.add(20);
        myNumbers.add(34);
        myNumbers.add(8);
        myNumbers.add(12);

        Collections.sort(myNumbers, Collections.reverseOrder()); // Sort myNumbers

        for (int num : myNumbers) {
            System.out.println(num);
        }
    }

}
