public class aplikace15 {
    public static void main(String[] args) {
        int pole[] = {100,5,3,66,43,67};
        int max=0;
        int poc=0;

        for (int i = pole.length-1;i >= 0;i--) {


            if (pole[poc] > max) {
                max = pole[poc];
                poc++;
            }
            else {
                poc++;
            }
        }

        System.out.println(max);
    }
}
