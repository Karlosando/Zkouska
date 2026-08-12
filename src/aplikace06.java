//HLEDÁNÍ V POLI


import java.util.Scanner;

public class aplikace06 {
    public static void main(String[] args){
        String[] hry = {"Minecraft", "Fortnite", "RDR2"};

        Scanner sc = new Scanner(System.in);


        System.out.println("Hledat hru: ");
        String hledani = sc.next();

        for (String hra : hry) {
            if (hledani.equals(hra)) {
                System.out.println("podarilo");
                return;
            }
        }
        System.out.println("nepodarilo");
    }
}
