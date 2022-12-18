package Application;
public class Adresse{
    private String strasseNr;
    private String strasseName;
    private String ort;
    private String plz;
    private String land;

    public Adresse(String strasseName, String strasseNr, String ort, String plz, String land){
        this.strasseName = strasseName;
        this.strasseNr = strasseNr;
        this.ort = ort;
        this.plz = plz;
        this.land = land;
    }

    public void setStrasseName(String newStrasseName){
        this.strasseName = newStrasseName;
    }

    public String getStrasseName(){
        return this.strasseName;
    }

    public void setStrasseNr(String newStrasseNr){
        this.strasseNr = newStrasseNr;
    }

    public String getStrasseNr(){
        return this.strasseNr;
    }
    
    public String getOrt(){
        return this.ort;
    }

    public void setOrt(String newOrt){
        this.ort = newOrt;
    }

    public void setPlz(String newPlz){
        this.plz = newPlz;
    }

    public String getPlz(){
        return this.plz;
    }

    public void setLand(String newLand){
        this.land = newLand;
    }

    public String getLand(){
        return this.land;
    }

}