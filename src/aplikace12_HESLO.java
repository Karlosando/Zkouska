import java.util.Random;
import java.util.Scanner;

public class aplikace12_HESLO {
    public static void main() {

        Scanner sc = new Scanner(System.in);
        Random rn = new Random();

        String index="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

        System.out.println("jak dlouhe chces heslo?");
        int pocetopakovani = sc.nextInt();


        String heslo ="";


        for (int i = 0; i < pocetopakovani; i++) {
            int randcs = rn.nextInt(index.length());
            char character= index.charAt(randcs);
            heslo = heslo + character;
        }

        System.out.println(heslo);

    }
}
