
public class Numbers {

    public static void main(String[] args) {
        byte b = 100;
        short s = 10000;
        int i = 1_000_000;
        long l = 10_000_000_000L;
        float f = 1.23f;
        double d = 1.23;
        float f1 = 35e3f;
        double d1 = 12E4d;
        char c = 'A';
        boolean bool = true;

        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
        System.out.println(f1);
        System.out.println(d1);
        System.out.println(c);
        System.out.println(bool);

        //real life examples
        int items = 50;
        float costPerItem = 9.99f;
        float totalCost = items * costPerItem;
        char currency = '$';

        // Print variables
        System.out.println("Number of items: " + items);
        System.out.println("Cost per item: " + costPerItem + currency);
        System.out.println("Total cost = " + totalCost + currency);

    }
}
