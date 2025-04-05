
public class Child extends Parent {

    private int graduationYear = 2018;

    public static void main(String[] args) {
        Child c = new Child();
        System.out.println(c.age); //accessed protected attribute within the child
        System.out.println(c.graduationYear);
    }
}
