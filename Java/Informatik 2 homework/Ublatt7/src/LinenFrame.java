import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class LinenFrame extends JFrame {

    int x1;
    int x2;
    int y1;
    int y2;
    boolean drawingCheck = false;
    boolean drawingLine = false;

    public LinenFrame() {
        setSize(300, 100);
        setTitle("Linen Frame");
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        JCheckBox checkBox = new JCheckBox("Line");
        checkBox.addItemListener(e -> {
            drawingCheck = checkBox.isSelected();
        });

        JPanel panel = new JPanel() {
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                if (drawingCheck && drawingLine) {
                    g.drawLine(x1, y1, x2, y2);
                }
            }
        };


        panel.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                x1 = e.getX();
                y1 = e.getY();
                drawingLine = true;
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                if (drawingCheck && drawingLine) {
                    x2 = e.getX();
                    y2 = e.getY();
                    repaint();
                }
            }
        });

        panel.addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseDragged(MouseEvent e) {
                if (drawingCheck && drawingLine) {
                    x2 = e.getX();
                    y2 = e.getY();
                    repaint();
                }
            }
        });
        add(checkBox, BorderLayout.NORTH);
        add(panel, BorderLayout.CENTER);


        setVisible(true);
    }

    public static void main(String[] args) {
        new LinenFrame();
    }
}
