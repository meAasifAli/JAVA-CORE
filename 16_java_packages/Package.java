
import java.util.Scanner;

public class Package {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a username: ");
        String username = sc.nextLine();
        System.out.println("Hello " + username);

        sc.close();
    }
}
