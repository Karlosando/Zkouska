import java.util.Scanner;
public class skola {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Zadej A: ");
        int A = sc.nextInt();

        System.out.print("Zadej B: ");
        int B = sc.nextInt();

        int vysledek = A * B;

        System.out.printf("C = %d",vysledek);

    }
}
