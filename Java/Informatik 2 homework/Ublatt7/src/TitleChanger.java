import javax.swing.*;
import java.awt.*;

public class TitleChanger extends JFrame {
    public static void main(String[] args) {
        JFrame frame = new JFrame("TitleChanger");
        frame.setSize(350, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //frame.setLayout(new BorderLayout());

        /*  oder
        JPanel buttonPanel = new JPanel(new GridLayout(2,2));
        JButton button1 = new JButton("Button1");
        JButton button2 = new JButton("Button2");
        JButton button3 = new JButton("Button3");
        JButton button4 = new JButton("Button4");

        buttonPanel.add(button1);
        buttonPanel.add(button2);
        buttonPanel.add(button3);
        buttonPanel.add(button4);

        buttonPanel.setBackground(Color.GRAY);


        button1.addActionListener(e -> {
            frame.setTitle("Title changed by Button 1");
        });
        button2.addActionListener(e -> {
            frame.setTitle("Title changed by Button 2");
        });
        button3.addActionListener(e -> {
            frame.setTitle("Title changed by Button 3");
        });
        button4.addActionListener(e -> {
            frame.setTitle("Title changed by Button 4");
        });

         */
        JPanel buttonPanel2 = new JPanel(new GridLayout(2, 2));
        for (int i = 1; i < 5; i++) {
            JButton button = new JButton("Button" + i);
            buttonPanel2.add(button);
            int finalI = i;
            button.addActionListener(e -> {
                frame.setTitle("Title changed by Button " + finalI);
            });
        }


        frame.add(buttonPanel2);
        frame.setVisible(true);
    }
}
