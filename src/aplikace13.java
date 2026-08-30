import org.w3c.dom.ls.LSOutput;

public class aplikace13 {
    public static void main(String[] args) {
        int pole[] = {1,5,4,10,11};
        int delka=pole.length;
        int prepole[] = new int[delka];
        int poc =0;


        for (int i = delka-1;i >=0;i--) {
            prepole[poc] = pole[i];
            System.out.print(pole[i]+" ");
        }
    }
}
