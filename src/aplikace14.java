import java.util.Arrays;

public class aplikace14 {
    public static void main(String[] args) {
        int pole[] = {3,3,5,10,20};
        int pole2[] = new int[pole.length];
        int poc=0;

        for (int i = pole.length-1;i >=0;i--) {
            pole2[poc] = pole[poc]*2;
            poc++;
        }

        System.out.print(java.util.Arrays.toString(pole2));
        System.out.println(Arrays.stream(pole2).max());
    }
}
