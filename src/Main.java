import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("TEST");

        Scanner sc = new Scanner(System.in);

        System.out.println("Jmnéno: ");
        String jmeno = sc.next();

        System.out.println("Věk: ");
        int vek = sc.nextInt();

        String urazka = "";

        if (vek >= 18){
            urazka = "jsi pekne stara mrdka";
        } else {
            urazka = "jsi peknej mladas";
        }


        System.out.println("Tvé jméno je "+jmeno+" a tvůj věk je "+vek+"." +urazka);


        int pocitadlowhile = 0;
        while (pocitadlowhile < 10) {
            System.out.println("niga");
            pocitadlowhile = pocitadlowhile+1;
        }

        for (int i = 0;i < 3; i++) {
            System.out.println("nejsem niggaa");
        }

        String auta[] = {"BMW", "AUDI", "Peugeot"};

        for (String auto : auta) {
            System.out.println(auta[1]);
        }

        System.out.println(auta[2]);

        ArrayList<String> bazar = new ArrayList<>();

        bazar.add("Porsche");
        bazar.add("Maserati");
        bazar.add("Mercedes");
        bazar.add("Lambordžíny");

        System.out.println(bazar.get(1));
    }
}

