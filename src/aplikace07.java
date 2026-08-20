//APLIAKCE - BANKOMAT


import java.util.Scanner;

public class aplikace07 {
    public static void main(String[] args) {

        System.out.println("╔══════════════════════════════════════╗");
        System.out.println("║         ----- BANKOMAT -----         ║");
        System.out.println("║ 1-PŘEHLED, 2-VKLAD, 3-VÝBĚR, 4-KONEC ║");
        System.out.println("╚══════════════════════════════════════╝");

        Scanner sc = new Scanner(System.in);

        System.out.println("┌──────────────────────────────────────┐");
        System.out.println("│             Vyber (1-4):             │");
        System.out.println("│                 ▼▼▼                  │");
        System.out.println("└──────────────────────────────────────┘");
        String vyber = sc.next();

        int celek = 0;

        while(true) {
            if (vyber.equals("1")){
                System.out.println(" ");
                System.out.println("╔══════════════════════════════════════╗");
                System.out.println("║        ----- VÁŠ PŘEHLED -----       ║");
                System.out.println("║    Váš zůstatek je: " + celek +"                ║");
                System.out.println("╚══════════════════════════════════════╝");
                System.out.println(" ");
                System.out.println("╔══════════════════════════════════════╗");
                System.out.println("║         ----- BANKOMAT -----         ║");
                System.out.println("║ 1-PŘEHLED, 2-VKLAD, 3-VÝBĚR, 4-KONEC ║");
                System.out.println("╚══════════════════════════════════════╝");
                System.out.println(" ");
                System.out.println("┌──────────────────────────────────────┐");
                System.out.println("│             Vyber (1-4):             │");
                System.out.println("│                 ▼▼▼                  │");
                System.out.println("└──────────────────────────────────────┘");
                vyber = sc.next();
            }else if (vyber.equals("2")) {
                System.out.println(" ");
                System.out.println("╔══════════════════════════════════════╗");
                System.out.println("║       ----- VLOŽTE PENÍZE -----      ║");
                System.out.println("║     Váš zůstatek je: " + celek+"     ║");
                System.out.println("║             Vložte měnu              ║");
                System.out.println("║                 ▼▼▼                  ║");
                System.out.println("╚══════════════════════════════════════╝");
                System.out.println(" ");
                int cislo = sc.nextInt();
                celek = celek + cislo;
                System.out.println(" ");
                System.out.println("╔══════════════════════════════════════╗");
                System.out.println("║         ----- BANKOMAT -----         ║");
                System.out.println("║ 1-PŘEHLED, 2-VKLAD, 3-VÝBĚR, 4-KONEC ║");
                System.out.println("╚══════════════════════════════════════╝");
                System.out.println(" ");
                System.out.println("┌──────────────────────────────────────┐");
                System.out.println("│             Vyber (1-4):             │");
                System.out.println("│                 ▼▼▼                  │");
                System.out.println("└──────────────────────────────────────┘");
                vyber = sc.next();
            }else if (vyber.equals("3")){
                System.out.println(" ");
                System.out.println("╔══════════════════════════════════════╗");
                System.out.println("║      ----- VYBERTE PENÍZE -----      ║");
                System.out.println("║     Váš zůstatek je: " + celek+"     ║");
                System.out.println("║            Vyberte měnu              ║");
                System.out.println("║                 ▼▼▼                  ║");
                System.out.println("╚══════════════════════════════════════╝");
                System.out.println(" ");
                System.out.print("Vyberte měnu: ");
                int cislo = sc.nextInt();
                celek = celek - cislo;
                System.out.println(" ");
                System.out.println("╔══════════════════════════════════════╗");
                System.out.println("║         ----- BANKOMAT -----         ║");
                System.out.println("║ 1-PŘEHLED, 2-VKLAD, 3-VÝBĚR, 4-KONEC ║");
                System.out.println("╚══════════════════════════════════════╝");
                System.out.println(" ");
                System.out.println("┌──────────────────────────────────────┐");
                System.out.println("│             Vyber (1-4):             │");
                System.out.println("│                 ▼▼▼                  │");
                System.out.println("└──────────────────────────────────────┘");
                vyber = sc.next();
            }else if (vyber.equals("4")){
                System.out.println(" ");
                System.out.println("╔══════════════════════════════════════╗");
                System.out.println("║          ----- KONEC -----           ║");
                System.out.println("╚══════════════════════════════════════╝");
                break;
            }



        }
    }
}
