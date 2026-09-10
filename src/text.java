import java.io.FileWriter;
import java.io.IOException;

public class text {
    public static void main(String[] args){
        try(FileWriter writer = new FileWriter("hra.txt",true)) {
            writer.append("cus bro\n");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}


