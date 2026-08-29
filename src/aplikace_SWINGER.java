import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
import java.awt.*;

public class aplikace_SWINGER {
    public static void main(String[] args) {

        int click = 0;

        JFrame wn = new JFrame();
        wn.setSize(500,500);
        wn.setTitle("Swinger TEST");

        wn.setLayout(new BoxLayout(wn.getContentPane(), BoxLayout.Y_AXIS));


        JLabel popisek = new JLabel("Na co čumíš je to jenom test ne majnkraft");
        popisek.setFont(new Font("Comic Sans MS", Font.PLAIN, 50));
        wn.add(popisek);


        JButton tlacitko = new JButton("Klikni!");
        tlacitko.setFont(new Font("Comic Sans MS", Font.PLAIN,100));
        tlacitko.addActionListener(e -> {
            click = click + 1;

            popisek.setText("Počet kliknutí: " + click);
        wn.add(tlacitko);



        JLabel popisek1 = new JLabel("Kliky : "+ click);
        popisek1.setFont(new Font("Comic Sans MS", Font.PLAIN, 50));
        wn.add(popisek1);

        wn.setVisible(true);
        wn.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
