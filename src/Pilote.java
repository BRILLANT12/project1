import java.util.Vector;

public class Pilote extends Employe{
    private char licence;
    private int heuresDeVol;
    private Vector<Pilote> lesPilotes;
    public Pilote(String addresse, String nom, int contact, String identifiant,int NumeroEmploye,int DateEmbauche,char licence, int heuresDeVol){
        super(addresse,nom,contact,identifiant,NumeroEmploye,DateEmbauche);
        this.heuresDeVol=heuresDeVol;
        this.licence=licence;
    }
    public void listPilote(){
        lesPilotes=new Vector<Pilote>();

    }
    public void affecterVol(){
        Pilote unpilote;
      for(int i=0;i<lesPilotes.size();i++){
          unpilote=lesPilotes.elementAt(i);
          System.out.println(unpilote+"est dans dans le vol"+numeroVol);
      }
    }

}
