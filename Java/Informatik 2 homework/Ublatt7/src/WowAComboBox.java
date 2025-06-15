import javax.swing.*;
import java.awt.*;

public class WowAComboBox extends JFrame {
    public static void main(String[] args) {
        JFrame frame = new JFrame("WowAComboBox");
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setLayout(new FlowLayout());

        JLabel ageLabel = new JLabel("Alter: ");
        String[] ages = new String[112];
        ages[0] = "(select your age)";
        for (int i = 1; i < 112; i++) {
            ages[i] = String.valueOf(i - 1);
        }

        JComboBox<String> comboBox = new JComboBox<>(ages);
        comboBox.setSelectedIndex(0);

        frame.add(ageLabel);
        frame.add(comboBox);
        frame.setVisible(true);
    }

}
