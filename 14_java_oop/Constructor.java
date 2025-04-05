
public class Constructor {

    int x;

    public Constructor() {
        x = 10;
    }

    //constructors can also take parameters
    public Constructor(int y) {
        x = y;
    }

    // constructor is used to initialise the attributes of the class
    public static void main(String[] args) {
        Constructor cons = new Constructor(10);
        System.out.println(cons.x);
    }
}
