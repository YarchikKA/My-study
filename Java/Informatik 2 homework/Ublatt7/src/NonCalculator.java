import javax.swing.*;
import java.awt.*;

public class NonCalculator extends JFrame {
    public static void main(String[] args) {
        JFrame frame = new JFrame("NonCalculator");
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setLayout(new BorderLayout());


        JPanel inputPanel = new JPanel(new FlowLayout());
        JTextField nameField = new JTextField(20);
        nameField.setEnabled(false);
        inputPanel.add(nameField);
        inputPanel.setBackground(Color.LIGHT_GRAY);

        JPanel buttonPanel = getJPanel();
        buttonPanel.setBackground(Color.GRAY);


        frame.add(inputPanel, BorderLayout.NORTH);
        frame.add(buttonPanel, BorderLayout.SOUTH);
        frame.setVisible(true);
    }

    private static JPanel getJPanel() {
        JPanel buttonPanel = new JPanel(new GridLayout(5, 3));
        JButton button0 = new JButton("0");
        JButton button1 = new JButton("1");
        JButton button2 = new JButton("2");
        JButton button3 = new JButton("3");
        JButton button4 = new JButton("4");
        JButton button5 = new JButton("5");
        JButton button6 = new JButton("6");
        JButton button7 = new JButton("7");
        JButton button8 = new JButton("8");
        JButton button9 = new JButton("9");
        JButton button10 = new JButton("+");
        JButton button11 = new JButton("-");
        JButton button12 = new JButton("=");
        JButton button13 = new JButton(".");
        JButton button14 = new JButton("C");

        buttonPanel.add(button0);
        buttonPanel.add(button1);
        buttonPanel.add(button2);
        buttonPanel.add(button3);
        buttonPanel.add(button4);
        buttonPanel.add(button5);
        buttonPanel.add(button6);
        buttonPanel.add(button7);
        buttonPanel.add(button8);
        buttonPanel.add(button9);
        buttonPanel.add(button10);
        buttonPanel.add(button11);
        buttonPanel.add(button12);
        buttonPanel.add(button13);
        buttonPanel.add(button14);
        return buttonPanel;
    }
}
