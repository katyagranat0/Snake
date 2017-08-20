import javax.swing.*;
import java.awt.*;

public class Field {
    public static void createGameField() {
        JFrame myFrame = new JFrame("Змейка");
        JPanel Panel = new JPanel();
        Panel.setBackground(Color.black);

        GridLayout myGridLayout = new GridLayout(25,25, 1,1);

        JPanel [][] frayms = new  JPanel [25][25];



        for (int y = 0; y < 25; y++) {
            for(int x = 0; x < 25; x++) {
                frayms [y][x] = new JPanel();
                Panel.add( frayms [y][x]);
                System.out.println(y + " "+ x);
            }
        }
        Panel.setLayout(myGridLayout);
        myFrame.add(Panel);


        myFrame.setVisible(true);
        myFrame.setSize(400, 400);
    }

}
