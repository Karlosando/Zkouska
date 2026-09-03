import javax.swing.*;
import java.awt.*;

public class kkt {
    public static void main(String[] args) {
        JFrame wn = new JFrame("test");
        wn.setSize(500,500);
        wn.setVisible(true);
        wn.setTitle("TEST");
        wn.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        JLabel label = new JLabel("TESTIK!");
        wn.add(label);

        JButton button = new JButton("ahoj");
        button.setFont(new Font("Serif",Font.BOLD, 36));




        wn.add(button);
    }
}
