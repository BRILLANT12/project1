import java.util.ArrayList;
import java.util.Date;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Avion{
    private String immatriculation;//Encapsulation
    private String modele;
    private int capacite;

    private Avion(String immatriculation, String modele, int capacite) {
        this.immatriculation = immatriculation;
        this.modele = modele;
        this.capacite= capacite;
    }

    public void affecterVol(Vol vol) {
        vol.setAvion(this);
    }
    public boolean verifierDisponibilite() {
        // logique pour verifier si l'avionest disponible
        return  true;
    }
    @Override
    public String tostring() {
        return "Avion[Immatriculation="+ immatriculation +",Modele=" + modele +",Capacite="+capacite+"]";
    }
}
//Classe Aeroport
public class Aeroport {
     private String nom;// Encapsulation
     private String ville;
     private String description;

     private Aeroport ( String nom, String ville, String description){
         this.nom = nom;
         this.ville = ville;
         this.description = description;
     }

     public void affecterVol(Vol vol){
         // Logique pour affecter un vol à cet aéroport
     }
     @Override
    public String to String() {
         return "Aeroport [Nom="+ nom + ", ville="+ville+",Desceiption="+ description + "]";
    }

}

//Classe Vol
public class Vol{
    private String numeroVol;
    private Aeroport origine;//Association avecAeroport
    private Aeropport destination;//Association avec Aeropport
    private Date dateHeureDepart;
    private Date dateHeureArrivee;
    private String etat;
    private Avion avion;// Association avec Avion
    private List<String> passagers;// liste des passagers

    public Vol ( String numeroVol, Aeroport origine, Aeroport destination, Date dateHeureDepart, Date dateHeurArrivee, String etat) {
        this.numeroVol = numeroVol;
        this.origine= origine;
        this.destination = destination;
        this.dateHeureDepart = dateHeureDepart;
        this.dateHeureArrivee = dateHeurArrivee;
        this.etat = etat;
        this.passagers = new ArrayList<>();
    }
    public void setAvion(Avion avion){
        this.avion = avion ;
    }
    public void planifierVol() {
        this.etat = "Planifié";
    }
    public void modifierVol(Aeroport origine, Aeroport destination, Date dateHeureDepart,Date dateHeureArrivee){
        if (origine != null) this.origine = origine;
        if (destination!= null) this.destination = destination;
        if (dateHeureDepart != null) this.dateHeureDepart=dateHeureDepart;
    }  if (dateHeureArrivee != null) this.dateHeureArrivee = dateHeureArrivee;

    @Override
    public String toString(){
        return "Vol[Numero="+ numeroVol+", Origine="+ origine +",Destination="+
                ",Départ="+ dateHeureDepart+", Arrivée=" + dateHeureArrivee +" ,Etat="+etat+"]";
    }


}

//Classe Reservation
        public class  {
    private String numeroReservation;
    private Date dateReservation;
    private String statut;

    public Reservation(String numeroReservation,Date dateReservation, String statut){
        this.numeroReservation = numeroReservation;
        this.dateReservation = dateReservation;
        this.statut = statut;
    }
    public void confirmerReservation() {
        this.statut = "confirmée";
    }
    public void annulerReservation(){
        this.statut= statut;
    }
    @Override
    public String toString() {
        return "Reservation [Numero="+numeroReservation+", Date="+dateReservation+",Statut="+statut+"]";
    }
}