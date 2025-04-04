
public class Methods {

    //create a method
    static void myMethod() {
        System.out.println("I just got executed");
    }

    static void getInfo(String name, int age) {
        System.out.println("Name: " + name + " Age: " + age);
    }

    //method with return type
    static int add(int a, int b) {
        return a + b;
    }

    static double add(double a, double b) {
        return a + b;
    }

    // above two methods are overloaded
    //java recursion
    static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    static int sum(int k) {
        if (k == 0) {
            return 0;
        } else {
            return k + sum(k - 1);
        }
    }

    public static void main(String[] args) {
        //call a method
        myMethod();
        // we can also call methods several times
        myMethod();
        myMethod();

        //method with arguments
        getInfo("John", 25);

        //method with return type
        int sum = add(5, 10);
        System.out.println(sum);

        double sum2 = add(5.5, 10.5);
        System.out.println(sum2);

        //recursive method
        int fact = factorial(5);
        System.out.println(fact);

        //recursive method
        int sum3 = sum(5);
        System.out.println(sum3);
    }
}
