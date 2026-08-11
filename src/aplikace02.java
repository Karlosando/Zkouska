//SMYČKA UKONČENÁ 0, SOUČET VŠECH ČÍSEL


import java.util.Scanner;

public class aplikace02 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int pocitadlo = 0;
        int cislo = 0;

        System.out.println("Zadejte číslo, pro ukončení smyčky zmáčkněte - 0 -");
        cislo = sc.nextInt();

        while(true) {
            if (cislo == 0) {
                System.out.println("dohromady: "+pocitadlo);
                break;
            }
            else if (cislo != 0)
                pocitadlo = pocitadlo + cislo;
                System.out.println("Zadejte číslo, pro ukončení smyčky zmáčkněte - 0 -");
                cislo = sc.nextInt();
        }
    }
}
