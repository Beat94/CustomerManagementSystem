import javax.swing.*;

public class Startup {
    public void start(){
        JFrame frame = new JFrame("Start-");

        JButton gui = new JButton("GUI");
        JButton cli = new JButton("CLI");

        JLabel quest = new JLabel("Wie soll die App geöffnet werden?");

        gui.setBounds(70, 90, 100, 40); //x axis, y axis, width, height
        cli.setBounds(180, 90, 100, 40); //x axis, y axis, width, height
        quest.setBounds(70, 20,500,40);

        frame.add(gui);
        frame.add(cli);
        frame.add(quest);

        frame.setSize(400,200);

        frame.setLayout(null);
        frame.setVisible(true);
    }

    private static void startUi(String UI){
        if(UI.toLowerCase().equals("cli")){
            System.out.println("CLI");
        }else if(UI.toLowerCase().equals("gui")){
            System.out.println("GUI");
        }
    }
}
