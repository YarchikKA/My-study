import javax.swing.*;
import java.awt.*;


public class LabelCreator extends JFrame {
    public LabelCreator() {
        setTitle("LabelCreator");
        setLayout(new BorderLayout());
        setSize(200, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel centralPanel = new JPanel();
        add(centralPanel, BorderLayout.CENTER);


        JButton newLabelButton = new JButton("Add new label");
        newLabelButton.addActionListener(new LabelCreatorListener(centralPanel));
        add(newLabelButton, BorderLayout.SOUTH);

        setVisible(true);
    }


    public static void main(String[] args) {
        new LabelCreator();
    }
}