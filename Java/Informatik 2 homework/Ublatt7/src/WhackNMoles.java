import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class WhackNMoles extends JFrame implements ActionListener {
    int clickedButtons = 0;
    int totalButtons;

    public WhackNMoles(int x) {
        totalButtons = x;
        setTitle("Whack" + x + "Moles");
        setLayout(new GridLayout(0, 3));
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

        for (int i = 1; i < x + 1; i++) {
            JButton button = new JButton(String.valueOf(i));
            button.addActionListener(this);
            add(button);

        }
        setVisible(true);
    }


    public static void main(String[] args) {
        Random random = new Random();
        int x = random.nextInt(0, 100);
        new WhackNMoles(x);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton clicked = (JButton) e.getSource();

        if (!clicked.isEnabled()) return;

        clicked.setEnabled(false);
        clickedButtons++;

        if (clickedButtons == totalButtons) {
            dispose();
        }
    }
}
