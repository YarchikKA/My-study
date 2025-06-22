import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class LabelCreatorListener implements ActionListener {
    private final JPanel panel;
    private final Random random = new Random();

    public LabelCreatorListener(JPanel panel) {
        this.panel = panel;
    }


    public void actionPerformed(ActionEvent e) {
        LocalTime now = LocalTime.now();
        String time = now.format(DateTimeFormatter.ofPattern("HH:mm:ss"));

        JLabel label = new JLabel(time);

        Color color = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));
        label.setForeground(color);

        panel.add(label);
        panel.revalidate();
    }
}
