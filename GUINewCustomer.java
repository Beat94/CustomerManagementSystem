import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class GUINewCustomer {
    public void start(){
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
        JTextField ZipCodeField = new JTextField();

        // Save-function / Button
        

        // Cancel-Button

        FirmLabel.setBounds(10,10,100,25);
        FirmTextField.setBounds(120,10,100,25);
        StreetLabel.setBounds(10,40,100,25);
        StreetTextField.setBounds(120,40,100,25);
        StreetNrLabel.setBounds(10,70,100,25);
        StreetNrTextField.setBounds(120,70,100,25);
        LocationLabel.setBounds(10,100,100,25);
        LocationTextField.setBounds(120,100,100,25);
        ZipCodeLabel.setBounds(10,130,100,25);
        ZipCodeField.setBounds(120,130,100,25);

        customerFrame.add(FirmLabel);
        customerFrame.add(FirmTextField);
        customerFrame.add(StreetLabel);
        customerFrame.add(StreetTextField);
        customerFrame.add(StreetNrLabel);
        customerFrame.add(StreetNrTextField);
        customerFrame.add(LocationLabel);
        customerFrame.add(LocationTextField);
        customerFrame.add(ZipCodeLabel);
        customerFrame.add(ZipCodeField);

        customerFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        customerFrame.setSize(400,200);
        
        customerFrame.setLayout(null);
        customerFrame.setVisible(true);
    }
}
