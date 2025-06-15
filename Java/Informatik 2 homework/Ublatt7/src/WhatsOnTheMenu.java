import javax.swing.*;

public class WhatsOnTheMenu extends JFrame {
    public static void main(String[] args) {
        JFrame frame = new JFrame("WhatsOnTheMenu");
        frame.setSize(200, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        JMenuBar menuBar = new JMenuBar();
        JMenu mainMenu = new JMenu("A Menu");
        JMenu subMenu = new JMenu("A Submenu");

        JMenuItem menuItem = new JMenuItem("A Menuitem");
        JCheckBoxMenuItem checkBoxMenuItem = new JCheckBoxMenuItem("A Checkbox Menuitem");
        subMenu.add(menuItem);
        subMenu.addSeparator();
        subMenu.add(checkBoxMenuItem);

        menuBar.add(mainMenu);
        mainMenu.add(subMenu);

        frame.setJMenuBar(menuBar);

        frame.setVisible(true);
    }
}
