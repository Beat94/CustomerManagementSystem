package Application;
import java.time.LocalDateTime;

public class Log{
    private String text;
    private LocalDateTime datumZeit;

    public Log(String text){
        this.text = text;
        datumZeit = LocalDateTime.now();
    }

    public String getText(){
        return this.text;
    }

    public LocalDateTime getDatumZeit(){
        return this.datumZeit;
    }
}