package Application;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Startup {
    public void start(){
        JFrame frame = new JFrame("Startup-Method");

        JButton gui = new JButton("GUI");
        JButton cli = new JButton("CLI");

        JLabel quest = new JLabel("Wie soll die App geöffnet werden?");

        gui.setBounds(70, 90, 100, 40); //x axis, y axis, width, height
        cli.setBounds(180, 90, 100, 40); //x axis, y axis, width, height
        quest.setBounds(70, 20,500,40);

        gui.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                GUI gui = new GUI();
                gui.start();
                frame.dispose();
            }
        });

        frame.add(gui);
        frame.add(cli);
        frame.add(quest);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,200);

        frame.setLayout(null);
        frame.setVisible(true);
    }
}
