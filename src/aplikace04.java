//HÁDÁNÍ ČÍSLA 1-10


import java.util.Random;
import java.util.Scanner;

public class aplikace04 {
    public static void main(String[] args){
        Random rand = new Random();
        int randcs = rand.nextInt(10)+1;

        Scanner sc = new Scanner(System.in);

        int pocitadlo = 0;

    while(true) {
        System.out.println("hádej číslo 1-10: ");
        int cislo = sc.nextInt();

        if (cislo < randcs){
            System.out.println("Větší");
            pocitadlo = pocitadlo + 1;
        }else if (cislo > randcs){
            System.out.println("Menší");
            pocitadlo = pocitadlo + 1;
        }else if (cislo == randcs){
            pocitadlo = pocitadlo + 1;
            System.out.println("Správně!");
            System.out.println("---Konec hry---");
            System.out.println("Počet pokusů: "+pocitadlo);
            break;
        }
    }






    }



}
