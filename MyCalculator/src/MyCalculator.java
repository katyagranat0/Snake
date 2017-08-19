
import javax.swing.*;
import java.awt.*;


public class MyCalculator {

    public static void main(String[] args) {
        JFrame myFrame = new JFrame("Змейка");
        JPanel myPanel = new JPanel();
        JPanel myPanel2 = new JPanel();
        JPanel myPanel3 = new JPanel();
        JPanel myPanel4 = new JPanel();
        JPanel buttonPanel = new JPanel();
        JLabel screenTextField = new JLabel( "Змейка");
       // BorderLayout myBorderLayout =new BorderLayout();
        GridLayout myGridLayout = new GridLayout(3,1);
        GridLayout myGridLayout1 = new GridLayout(1,2);

            BoxLayout myBoxLayout = new BoxLayout(myPanel,BoxLayout.Y_AXIS);



        JButton button1 = new JButton("Начало игры");
        JButton button2 = new JButton("Настройки");


        buttonPanel.setLayout(myGridLayout);
        myPanel.setLayout(myBoxLayout);
        myPanel3.setLayout(myGridLayout1);

        buttonPanel.add(button1);
        buttonPanel.add(myPanel2);
        buttonPanel.add(button2);


        myPanel3.add( buttonPanel);
        myPanel3.add( myPanel4);

        myPanel.add("Center", screenTextField);
        myPanel.add( myPanel3);




        myFrame.setContentPane(myPanel);

        myFrame.setVisible(true);
        myFrame.setSize(300, 300);

    }

}