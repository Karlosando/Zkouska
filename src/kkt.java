import javax.swing.*;
import java.awt.*;

public class kkt {
    public static int pocitadlo = 0;
    public static void main(String[] args) {
        JFrame wn = new JFrame("test");
        wn.setSize(500,500);
        wn.setTitle("TEST");
        wn.setLayout(new GridBagLayout());
        wn.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GridBagConstraints gbc = new GridBagConstraints();


        JLabel label = new JLabel("TESTIK!");
        gbc.gridx = 0;
        gbc.gridy = 0;
        wn.add(label,gbc);

        JButton button = new JButton("ahoj");
        button.addActionListener(e -> {
            label.setText(String.valueOf(pocitadlo));
            pocitadlo++;
        });
        button.setFont(new Font("Serif",Font.BOLD, 36));
        gbc.gridx = 0;gbc.gridy = 20;
        wn.add(button, gbc);


        wn.setVisible(true);
    }
}
