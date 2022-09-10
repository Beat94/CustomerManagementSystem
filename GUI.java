import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class GUI {
    private CustomerManager CustomerManager = new CustomerManager();
    // Menu Items of first frame
    private JFrame frame = new JFrame("Customer Management System");
    private JComboBox customerChooser = new JComboBox();

    public void start(){
        //JFrame frame = new JFrame("Customer Management System");
        JMenuBar menuBar = new JMenuBar();
        JMenu options = new JMenu("Options");
        JMenuItem save = new JMenuItem("save");
        JMenuItem load = new JMenuItem("load");
        JMenuItem newCustomer = new JMenuItem("neuer Kunde");
        // JComboBox: https://docs.oracle.com/javase/tutorial/uiswing/components/combobox.html
        JButton changeCustomerNameButton = new JButton("Name ändern");
        JCheckBox activeCheckBox = new JCheckBox("Aktiv:");
        JLabel adressLabel = new JLabel("Adresse:");
        JLabel adressCustomerLabel = new JLabel("Strasse\nOrt");

        newCustomer.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                startGUINewCustomer();
            }
        });

        options.add(save);
        options.add(load);
        options.add(newCustomer);

        menuBar.add(options);

        frame.add(customerChooser);
        frame.add(changeCustomerNameButton);
        frame.add(activeCheckBox);
        frame.add(adressLabel);
        frame.setJMenuBar(menuBar);
        
        customerChooser.setBounds(10, 20, 150, 25);
        changeCustomerNameButton.setBounds(170, 20, 150, 25);
        activeCheckBox.setBounds(170, 55, 70, 25);
        adressLabel.setBounds(75, 75, 70, 25);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,200);
        
        frame.setLayout(null);
        frame.setVisible(true);
    }

    public void startGUINewCustomer(){
        JFrame customerFrame = new JFrame("Kunde erfassen");
        // Firmenname
        JLabel FirmLabel = new JLabel("Firmenname:");
        JTextField FirmTextField = new JTextField();
        
        // Strasse
        JLabel StreetLabel = new JLabel("Strassenname:");
        JTextField StreetTextField = new JTextField();
        
        // Strassennr.
        JLabel StreetNrLabel = new JLabel("Strassennummer:");
        JTextField StreetNrTextField = new JTextField();

        // Ort
        JLabel LocationLabel = new JLabel("Ort:");
        JTextField LocationTextField = new JTextField();

        // PLZ
        JLabel ZipCodeLabel = new JLabel("PLZ:");
        JTextField ZipCodeTextField = new JTextField();

        // Land
        JLabel CountryLabel = new JLabel("Land:");
        JTextField CountryTextField = new JTextField();

        // Save-function / Button
        JButton SaveButton = new JButton("Save");

        // Cancel-Button
        JButton CancelButton = new JButton("Cancel");

        FirmLabel.setBounds(10,10,100,25);
        FirmTextField.setBounds(120,10,100,25);
        StreetLabel.setBounds(10,40,100,25);
        StreetTextField.setBounds(120,40,100,25);
        StreetNrLabel.setBounds(10,70,100,25);
        StreetNrTextField.setBounds(120,70,100,25);
        LocationLabel.setBounds(10,100,100,25);
        LocationTextField.setBounds(120,100,100,25);
        ZipCodeLabel.setBounds(10,130,100,25);
        ZipCodeTextField.setBounds(120,130,100,25);
        CountryLabel.setBounds(10,160,100,25);
        CountryTextField.setBounds(120, 160, 100, 25);
        SaveButton.setBounds(10,190,100,25);
        CancelButton.setBounds(120, 190, 100, 25);

        customerFrame.add(FirmLabel);
        customerFrame.add(FirmTextField);
        customerFrame.add(StreetLabel);
        customerFrame.add(StreetTextField);
        customerFrame.add(StreetNrLabel);
        customerFrame.add(StreetNrTextField);
        customerFrame.add(LocationLabel);
        customerFrame.add(LocationTextField);
        customerFrame.add(ZipCodeLabel);
        customerFrame.add(ZipCodeTextField);
        customerFrame.add(CountryLabel);
        customerFrame.add(CountryTextField);
        customerFrame.add(SaveButton);
        customerFrame.add(CancelButton);

        SaveButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                // get Values from FirmTextField
                String Firmname = FirmTextField.getText();

                // get Values from StreetTextField
                String Streetname = StreetTextField.getText();

                // get Values from StreetNrLabel
                String StreetNr = StreetNrTextField.getText();

                // get Values from LocationTextField
                String Location = LocationTextField.getText();

                // get Values from ZipCodeField
                String Zip = ZipCodeTextField.getText();

                String Country = CountryTextField.getText();

                // Write it in CustomerManager
                Adresse Adresse = new Adresse(Streetname, StreetNr, Location, Zip, Country);
                Customer Customer = new Customer(Firmname, Adresse);

                CustomerManager.addCustomer(Customer);
                // Relaod Parent GUI
                //SwingUtilities.updateComponentTreeUI(frame);
                frame.invalidate();
                frame.validate();

                // close this gui
                customerFrame.dispose();
            }
        });

        CancelButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                customerFrame.dispose();
            }
        });

        customerFrame.setDefaultCloseOperation(customerFrame.DISPOSE_ON_CLOSE);
        customerFrame.setSize(400,270);
        
        customerFrame.setLayout(null);
        customerFrame.setVisible(true);
    }

    private void reloadCustomerChooser(){
        ArrayList<Customer> cm = CustomerManager.getCustomerList();

        
    }
}
