import javax.swing.JButton;
import javax.swing.JComboBox;
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
        // JComboBox: https://docs.oracle.com/javase/tutorial/uiswing/components/combobox.html
        JComboBox customerChooser = new JComboBox();
        JButton changeCustomerNameButton = new JButton("Name ändern");
        

        options.add(save);
        options.add(load);

        menuBar.add(options);

        frame.add(customerChooser);
        frame.add(changeCustomerNameButton);
        frame.setJMenuBar(menuBar);
        
        customerChooser.setBounds(10, 20, 150, 25);
        changeCustomerNameButton.setBounds(170, 20, 150, 25);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,200);
        
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
