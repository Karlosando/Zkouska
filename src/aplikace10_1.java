import java.io.File;         // Nástroj pro propojení se souborem
import java.io.IOException;
import java.util.Scanner;    // Nástroj pro čtení textu

public class aplikace10_1 {
    public static void main(String[] args) {
        try {
            // 1. Ukážeme na soubor na tvém disku C:
            File soubor = new File("src\\hra.txt");

            // 2. Dáme soubor do Scanneru (jako bychom ho začali číst)
            Scanner ctecka = new Scanner(soubor);

            // 3. Pomocí cyklu WHILE čteme soubor tak dlouho, dokud v něm jsou nějaké řádky
            // ctecka.hasNextLine() říká: "Je pod námi ještě nějaký další řádek?"
            while (ctecka.hasNextLine()) {
                String radek = ctecka.nextLine(); // Tohle je to "readline" – přečte aktuální řádek
                System.out.println(radek);       // Vytiskneme ho do konzole
            }

            // 4. Po skončení čtečku zavřeme
            ctecka.close();

        } catch (IOException e) {
            System.out.println("Soubor se nepodařilo přečíst: " + e.getMessage());
        }
    }
}