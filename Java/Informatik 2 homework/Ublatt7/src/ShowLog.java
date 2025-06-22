import javax.swing.*;
import java.awt.*;

public class ShowLog extends JDialog {

    public ShowLog(JFrame frame, Iterable<String> log) {

        super(frame, "Show Log", true);
        setSize(300, 300);
        setLocationRelativeTo(frame);

        JTextArea textArea = new JTextArea(5, 50);
        textArea.setEditable(false);

        for (String line : log) {
            textArea.append(line + "\n");
        }

        JScrollPane scrollPane = new JScrollPane(textArea);

        add(scrollPane, BorderLayout.CENTER);

        setVisible(true);
    }


}
