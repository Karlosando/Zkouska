import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class aplikace01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Zadejte heslo: ");
        String heslo = sc.next();

        if (heslo.equals("admin") || heslo.equals("heslo123")) {
            System.out.println("Přístup schválen");

        } else {
            System.out.println("Přístup odepřen");
        }
    }
}
