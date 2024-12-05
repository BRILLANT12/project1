import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Vol{
    private final String numeroVol;
    private Aeroport origine;//Association avecAeroport
    private Aeroport destination;//Association avec Aeropport
    private Date dateHeureDepart;
    private Date dateHeureArrivee;
    private String etat;
    // liste des passagers

    public Vol ( String numeroVol, Aeroport origine, Aeroport destination, Date dateHeureDepart, Date dateHeurArrivee, String etat) {
        this.numeroVol = numeroVol;
        this.origine= origine;
        this.destination = destination;
        this.dateHeureDepart = dateHeureDepart;
        this.dateHeureArrivee = dateHeurArrivee;
        this.etat = etat;
    }
    public void setAvion(Avion avion){
        // Association avec Avion
    }
    public void planifierVol() {
        this.etat = "Planifié";
    }
    public void modifierVol(Aeroport origine, Aeroport destination, Date dateHeureDepart,Date dateHeureArrivee) {
        if (origine != null) this.origine = origine;
        if (destination != null) this.destination = destination;
        if (dateHeureDepart != null) this.dateHeureDepart = dateHeureDepart;
        if (dateHeureArrivee != null) this.dateHeureArrivee = dateHeureArrivee;
    }

    @Override
    public String toString(){
        return "Vol[Numero="+ numeroVol+", Origine="+ origine +",Destination="+
                ",Départ="+ dateHeureDepart+", Arrivée=" + dateHeureArrivee +" ,Etat="+etat+"]";
    }


}

