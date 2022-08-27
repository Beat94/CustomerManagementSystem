import java.util.ArrayList;

public class Customer{
    private String name;
    private ArrayList<Log> cLog = new ArrayList<Log>;
    private Adresse address;
    private boolean active;

    public Customer(String name, String strasseNr, String ort, String plz, String land){
        this.name = name;
        this.address = new Adresse(strasseNr, ort, plz, land);
        this.active = true;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean getActive() {
        return this.active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public Adresse getAddress() {
        return this.address;
    }

    public void setAddress(Adresse address) {
        this.address = address;
    }

}
