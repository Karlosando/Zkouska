import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class skola3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\t---TO-DO LIST---");
        boolean list = true;
        String path = "TO-DO LIST.txt";
        Random random = new Random();

        try(BufferedWriter writer = new BufferedWriter(new FileWriter(path,true))) {
        } catch (IOException e) {
            throw new RuntimeException(e);
        } ;


        ArrayList<String> quest = new ArrayList<>();

        while (list==true){
            System.out.println("---Přidej úkol, 1-Konec---");
            String questA = sc.next();
            if (questA.equals("1")){
                list=false;
            }
            quest.add(questA);
            System.out.println(quest);
        }


    }
}
