import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class GUI {
    public void start(){
        JFrame frame = new JFrame("Customer Management System");
        JMenuBar menuBar = new JMenuBar();
        JMenu options = new JMenu("Options");
        JMenuItem save = new JMenuItem("save");
        JMenuItem load = new JMenuItem("load");
        JMenuItem newCustomer = new JMenuItem("neuer Kunde");
        // JComboBox: https://docs.oracle.com/javase/tutorial/uiswing/components/combobox.html
        JComboBox customerChooser = new JComboBox();
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
        SaveButton.setBounds(10,160,100,25);
        CancelButton.setBounds(120, 160, 100, 25);

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
        customerFrame.add(SaveButton);
        customerFrame.add(CancelButton);

        SaveButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                // get Values from FirmTextField
                FirmTextField.getText();

                // get Values from StreetTextField
                // get Values from StreetNrLabel
                // get Values from LocationTextField
                // get Values from ZipCodeField
                // get Values from ZipCodeTextField

                // Write it in CustomerManager
                // Relaod Parent GUI

                // close this gui
            }
        });


        customerFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        customerFrame.setSize(400,250);
        
        customerFrame.setLayout(null);
        customerFrame.setVisible(true);
    }
}
