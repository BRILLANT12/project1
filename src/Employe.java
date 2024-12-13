public class Employe extends Personne{
    private int NumeroEmploye;
    private int DateEmbauche;
    public Employe(String addresse, String nom, int contact, String identifiant,int NumeroEmploye,int DateEmbauche) {
        super(addresse, nom, contact, identifiant);
        this.NumeroEmploye= NumeroEmploye;
        this.DateEmbauche=DateEmbauche;
    }
    public String obtenirRole(){
        return "identifiant"+identifiant;
    }

}
