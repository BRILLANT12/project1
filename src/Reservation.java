import java.util.Date;
import java.util.Vector;
public class Reservation {
    private final String numeroReservation;
    private final Date dateReservation;
    private String statut;
    private Vector<Reservation> listVol;
    public Vector<Reservation>listreserv;
    public Reservation(String numeroReservation,Date dateReservation, String statut){
        this.numeroReservation = numeroReservation;
        this.dateReservation = dateReservation;
        this.statut = statut;
    }
    public void confirmerReservation() {
        this.statut = "confirmée";
    }
    public void annulerReservation(){
        this.statut= "Annuler";
    }
    @Override
    public String toString() {
        return "Reservation [Numero="+numeroReservation+", Date="+dateReservation+",Statut="+statut+"]";
    }
}
