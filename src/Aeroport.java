

public class Aeroport {
    private final String nom;// Encapsulation
    private final String ville;
    private final String description;

    private Aeroport ( String nom, String ville, String description){
        this.nom = nom;
        this.ville = ville;
        this.description = description;
    }

    public void affecterVol(Vol vol){
        // Logique pour affecter un vol à cet aéroport
    }
    public String to ;Object String() {
        return "Aeroport [Nom="+ nom + ", ville="+ville+",Desceiption="+ description + "]";
    }

}
