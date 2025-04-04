
public class Maths {

    public static void main(String[] args) {

        System.out.println(Math.max(5, 6)); // returns max value
        System.out.println(Math.min(5, 6)); // returns min value
        System.out.println(Math.sqrt(64)); // returns square root
        System.out.println(Math.abs(-4.7)); // returns absolute value
        System.out.println(Math.random()); // returns random value between 0.0 and 1.0
        int randomNum = (int) (Math.random() * 101);  // 0 to 100
        System.out.println(randomNum);
        System.out.println(Math.pow(5, 3)); // returns 5 to the power of 3
        System.out.println(Math.round(4.7)); // returns 5
        System.out.println(Math.ceil(4.2)); // returns 5
        System.out.println(Math.floor(4.2)); // returns 4
    }
}
