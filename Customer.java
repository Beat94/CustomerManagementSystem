import java.util.ArrayList;

public class Customer{
    private String name;
    private ArrayList<Log> cLog = new ArrayList<Log>;
    private Adresse address;

    public Customer(String name, String strasseNr, String ort, String plz, String land){
        this.name = name;
        this.address = new Adresse(strasseNr, ort, plz, land)
    }

    
}
