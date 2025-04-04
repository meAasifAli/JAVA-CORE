
public class Arrays {

    public static void main(String[] args) {
        //declare an array
        String[] names = {"Aasif", "John", "Jane"};
        //access an array
        System.out.println(names[0]);
        //change an array
        names[0] = "Aasif Ali";
        //print an array
        for (String name : names) {
            System.out.println(name);
        }

        //array methods
        String[] cars = {"Volvo", "BMW", "Tesla"};
        String[] cars2 = {"Volvo", "BMW", "Tesla"};

        System.out.println(java.util.Arrays.compare(cars, cars2)); // returns 0
        System.out.println(java.util.Arrays.equals(cars, cars2)); // returns true

        String[] carLists = {"Volvo", "BMW", "Tesla", "Ford", "Fiat", "Mazda", "Audi"};

        java.util.Arrays.sort(carLists);

        for (String car : carLists) {
            System.out.println(car);
        }

        int[] nums = {2, 5, 4, 3, 6};
        java.util.Arrays.sort(nums);

        for (int num : nums) {
            System.out.println(num);
        }

        String[] fruits = {"Banana", "Orange", "Apple", "Mango"};
        java.util.Arrays.fill(fruits, "Kiwi");

        for (String fruit : fruits) {
            System.out.println(fruit);
        }

    }
}
