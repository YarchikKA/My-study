import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class KreisFrame extends JFrame {
    boolean nowDrawing = false;
    boolean clicked = false;
    int x;
    int y;

    public KreisFrame() {
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        setTitle("KreisFrame");
        JCheckBox checkBox = new JCheckBox("Kreis");

        checkBox.addItemListener(e -> {
            nowDrawing = checkBox.isSelected();

        });

        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                if (nowDrawing && clicked) {
                    g.setColor(Color.BLACK);
                    g.fillOval(x - 10, y - 10, 20, 20);
                }
            }
        };

        panel.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                clicked = true;
                x = e.getX();
                y = e.getY();
                if (nowDrawing) {
                    repaint();
                }
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                clicked = false;
                repaint();
            }
        });


        add(panel, BorderLayout.CENTER);
        add(checkBox, BorderLayout.NORTH);
        setVisible(true);
    }

    public static void main(String[] args) {
        new KreisFrame();
    }
}
