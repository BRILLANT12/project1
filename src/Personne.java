public class Personne {
    public  String identifiant;
    private String nom;
    private String addresse;
    private int contact;

    public Personne(String addresse,String nom,int contact,String identifiant) {
        this.addresse = addresse;
        this.nom=nom;
        this.contact=contact;
        this.identifiant=identifiant;
    }

    public String getAddresse() {
        return addresse;
    }

    public int getContact() {
        return contact;
    }

    public String getIdentifiant() {
        return identifiant;
    }

    public String getNom() {
        return nom;
    }
    public String ObtenirInfos(){
        return "nom"+nom+"identifiant"+identifiant+"addresse"+addresse+"contact"+contact;
    }

}
