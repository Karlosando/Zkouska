import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class aplikace10 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("zadejte text k ulozeni: ");
            String slovo = sc.next();

            FileWriter zapis = new FileWriter("src\\hra.txt", true);
            zapis.write(slovo+"\n");
            zapis.close();
            System.out.println("ANO");
        } catch (IOException e) {
            System.out.println("NE");
        }

        try {
            // Jeden řádek, který přečte úplně všechno ze souboru
            String obsah = Files.readString(Path.of("src\\hra.txt"));

            System.out.println("----- cteni -----");
            System.out.println(obsah);

        } catch (IOException e) {
            System.out.println("Chyba při čtení: " + e.getMessage());
        }
    }
}
