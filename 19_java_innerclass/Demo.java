
class OuterClass {

    int x = 10;

    class InnerClass {

        int y = 20;
    }
}

public class Demo {

    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        OuterClass.InnerClass inner = outer.new InnerClass();
        System.out.println(outer.x + inner.y); // o/p = 30
    }
}
