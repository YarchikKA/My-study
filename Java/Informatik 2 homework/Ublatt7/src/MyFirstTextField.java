import javax.swing.*;
import java.awt.*;

public class MyFirstTextField extends JFrame {
    public static void main(String[] args) {
        JFrame frame = new JFrame("MyFirstTextField");
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setLayout(new BorderLayout());

        JPanel inputPanel = new JPanel(new FlowLayout());
        JLabel labelIn = new JLabel("Name: ");
        JTextField nameField = new JTextField(20);
        inputPanel.add(labelIn);
        inputPanel.add(nameField);
        inputPanel.setBackground(Color.LIGHT_GRAY);

        JPanel buttonPanel = new JPanel(new FlowLayout());
        JButton button1 = new JButton("OK");
        JButton button2 = new JButton("Canel");
        buttonPanel.add(button1);
        buttonPanel.add(button2);
        buttonPanel.setBackground(Color.GRAY);


        frame.add(inputPanel, BorderLayout.NORTH);
        frame.add(buttonPanel, BorderLayout.SOUTH);
        frame.setVisible(true);
    }
}
