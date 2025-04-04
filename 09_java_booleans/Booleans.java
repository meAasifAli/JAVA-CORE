
public class Booleans {

    public static void main(String[] args) {

        //boolean values
        boolean isJavaFun = true;
        boolean isJavaHard = false;
        System.out.println(isJavaFun);     // prints true
        System.out.println(isJavaHard);     // prints false

        //boolean expressions
        int x = 10;
        int y = 9;
        System.out.println(x > y); // returns true, because 10 is higher than 9

        //real life example
        int myAge = 25;
        int votingAge = 18;

        if (myAge >= votingAge) {
            System.out.println("Old enough to vote!");
        } else {
            System.out.println("Not old enough to vote.");
        }
    }
}
