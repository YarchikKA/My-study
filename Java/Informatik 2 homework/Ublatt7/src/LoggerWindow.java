import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;


public class LoggerWindow extends JFrame {

    ArrayList<String> log = new ArrayList<>();

    public LoggerWindow() {
        setTitle("LoggerWindow");
        setLayout(new FlowLayout());
        setSize(200, 200);
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                outPut("window closing");
            }

            @Override
            public void windowClosed(WindowEvent e) {
                outPut("window closed");
            }

            @Override
            public void windowActivated(WindowEvent e) {
                outPut("window activated");
            }

            @Override
            public void windowDeactivated(WindowEvent e) {
                outPut("window deactivated");
            }

            @Override
            public void windowDeiconified(WindowEvent e) {
                outPut("window deiconified");
            }


            @Override
            public void windowIconified(WindowEvent e) {
                outPut("window iconified");
            }


            @Override
            public void windowOpened(WindowEvent e) {
                outPut("window opened");
            }

        });


        JButton button1 = new JButton("Close Application");
        JButton button2 = new JButton("Show Log");

        button1.addActionListener(e -> System.exit(0));
        button2.addActionListener(e -> new ShowLog(this, log));

        add(button1);
        add(button2);
        setVisible(true);
    }

    public static void main(String[] args) {
        new LoggerWindow();
    }

    public void outPut(String message) {
        String time = new java.text.SimpleDateFormat("HH:mm:ss").format(new java.util.Date());
        log.add(time + " " + message);
    }
}



