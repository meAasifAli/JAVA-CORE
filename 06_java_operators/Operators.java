
public class Operators {

    public static void main(String[] args) {
        // Arithmetic Operators
        int a = 10;
        int b = 5;
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));
        System.out.println("++a = " + (++a));
        System.out.println("--b = " + (--b));
        System.out.println("a++ = " + (a++));
        System.out.println("b-- = " + (b--));

        // Assignment Operators
        int c = 10;

        System.out.println("c += 5 = " + (c += 5));
        System.out.println("c -= 5 = " + (c -= 5));
        System.out.println("c *= 5 = " + (c *= 5));
        System.out.println("c /= 5 = " + (c /= 5));
        System.out.println("c %= 5 = " + (c %= 5));
        // binary AND
        System.out.println("c &= 5 = " + (c &= 5));
        // binary OR
        System.out.println("c |= 5 = " + (c |= 5));
        //binary XOR
        System.out.println("c ^= 5 = " + (c ^= 5));
        // binary right shift
        System.out.println("c >>= 5 = " + (c >>= 5));
        // binary left shift
        System.out.println("c <<= 5 = " + (c <<= 5));

        //comparison operators
        int d = 10;
        int e = 20;
        System.out.println("d == e = " + (d == e));
        System.out.println("d != e = " + (d != e));
        System.out.println("d > e = " + (d > e));
        System.out.println("d < e = " + (d < e));
        System.out.println("d >= e = " + (d >= e));
        System.out.println("d <= e = " + (d <= e));

        //logical operators
        boolean f = true;
        boolean g = false;
        System.out.println("f && g = " + (f && g));
        System.out.println("f || g = " + (f || g));
        System.out.println("!f = " + (!f));

    }
}
