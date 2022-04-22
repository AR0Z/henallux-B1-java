package radar;

public class Chauffard {
    private String prenom;
    private String nom;
    private String adresse;
    private ExcesVitesse[] delitsVitesse ;
    private int nbExcesVitesse;

    public Chauffard(String prenom, String nom, String adresse) {
        this.prenom = prenom;
        this.nom = nom;
        this.adresse = adresse;
        delitsVitesse = new ExcesVitesse[24];
        nbExcesVitesse = 0;
    }

    public void ajouterExcesVitesse(ExcesVitesse excesVitesse){
        if(nbExcesVitesse < 24){
            delitsVitesse[nbExcesVitesse] = excesVitesse;
            nbExcesVitesse++;
        }
    }

    public int totalAmendes(){
        int totalAmendes = 0;

        for (int i = 0; i < nbExcesVitesse ; i++) {
            totalAmendes += delitsVitesse[i].montantAmende();
        }
        
        return totalAmendes;
    }

    public int depassementMaximal(){
        int depassementMaximal = 0;

        for (int i = 0; i < nbExcesVitesse ; i++) {
            int depassement = delitsVitesse[i].getVitesseAuFlash() - delitsVitesse[i].getLimitationVitesse();
            if (depassementMaximal < depassement) depassementMaximal = depassement;
        }

        return depassementMaximal;
    }

    public String dossierExcesVitesse(){
        String dossierExcesVitesse = "Dossier pour excès de vitesse de " + prenom + " " + nom + " pour l'année en cours : \n";

        for (int i = 0; i < nbExcesVitesse ; i++) {
            dossierExcesVitesse += " " + delitsVitesse[i] + "\n";
        }

        dossierExcesVitesse += "pour un montant total de " + totalAmendes() + " euros d'amande";

        return dossierExcesVitesse;
    }
}
