import java.util.Scanner;

public class aplikace03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String slovo = "";
        String veta = "";


        while(true) {
                System.out.println("zadej slovo: ");
                slovo = sc.next();

                if (slovo.equals("konec")) {
                    System.out.println("-----KONEC-----");
                    System.out.println("Celá věta: "+veta);
                    break;
                }

                else if (slovo.equals("niga") || slovo.equals("mrdka")) {
                    veta = veta + "[CENSORED] ";
                    System.out.println("Celá věta: "+veta);
                }

                else {
                    veta = veta + slovo+" ";
                    System.out.println("test "+veta);
                }

        }


    }
}
