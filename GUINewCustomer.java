import javax.swing.JFrame;

public class GUINewCustomer {
    public void start(){
        JFrame customerFrame = new JFrame("Kunde erfassen");
        

        customerFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        customerFrame.setSize(400,200);
        
        customerFrame.setLayout(null);
        customerFrame.setVisible(true);
    }
}
