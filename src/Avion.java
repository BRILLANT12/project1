
public class Avion{
    private final String immatriculation;//Encapsulation
    private final String modele;
    private final int capacite;

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
    public String tostring() {
        return "Avion[Immatriculation="+ immatriculation +",Modele=" + modele +",Capacite="+capacite+"]";
    }
}