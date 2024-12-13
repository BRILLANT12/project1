import java.util.Vector;

    public class PersonnelCabine extends Employe {
        private String qualification;
        private Vector<PersonnelCabine> lesPersoCab;

        public PersonnelCabine(String addresse, String nom, int contact, String identifiant, int NumeroEmploye, String qualification, int DateEmbauche) {
            super(addresse, nom, contact, identifiant, NumeroEmploye, DateEmbauche);
            this.qualification=qualification;
        }
        public void affecterVol(){
            PersonnelCabine persocab;
            for(int i=0;i<lesPersoCab.size();i++){
                persocab=lesPersoCab.elementAt(i);
                System.out.println(persocab+"est dans dans le vol"+numeroVol);
        }
    }

