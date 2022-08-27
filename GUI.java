import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JViewport;

public class GUI {
    public void start(){
        JFrame frame = new JFrame("Customer Management System");

        JMenuBar menuBar = new JMenuBar();

        JMenu options = new JMenu("Options");

        JMenuItem save = new JMenuItem("save");
        JMenuItem load = new JMenuItem("load");

        options.add(save);
        options.add(load);

        menuBar.add(options);

        frame.setJMenuBar(menuBar);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,200);

        frame.setLayout(null);
        frame.setVisible(true);
    }
}
