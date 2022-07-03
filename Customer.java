import java.util.ArrayList;

public class Customer{
    private String name;
    private ArrayList<Log> cLog = new ArrayList<Log>();
    private Adresse address;
    private boolean active;

    public Customer(String name, String strasseNr, String ort, String plz, String land){
        this.name = name;
        this.address = new Adresse(strasseNr, ort, plz, land);
        addLog("Die Firma " + name + " ist angelegt.");
        this.active = true;
    }

    public void addLog(String note){
        this.cLog.add(new Log(note));
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public boolean getActive(){
        return this.active;
    }

    public void setActive(boolean active){
        this.active = active;
    }

}
