public class Passager extends Personne{
    private String passeport;
    public Passager(String addresse, String nom, int contact, String identifiant,String passeport){
        super(addresse,nom,contact,identifiant);
        this.passeport=passeport;

    }
    public void reservervol( Reservation unVol ){
        listVol.addElement(unVol);

    }
    public void AnnulerReservation(){

    }
    public String ObtenirReservation(){
        return listreserv;
    }

}
