package radar;

public class Chauffard {
    public final int NB_MAX_EXCES = 24;
    private String prenom;
    private String nom;
    private String adresse;
    private ExcesVitesse[] delitsVitesse ;

    public Chauffard(String prenom, String nom, String adresse) {
        this.prenom = prenom;
        this.nom = nom;
        this.adresse = adresse;
        delitsVitesse = new ExcesVitesse[NB_MAX_EXCES];
    }

    public void ajouterExcesVitesse(ExcesVitesse excesVitesse){
        if(nbExcesVitsse() < NB_MAX_EXCES){
            delitsVitesse[nbExcesVitsse()] = excesVitesse;
        }
    }

    private int nbExcesVitsse(){
        int nbExcesVitesse = 0;

        for (int i = 0; i < NB_MAX_EXCES ; i++) {
            if(delitsVitesse[i] != null){
                nbExcesVitesse++;
            }
        }

        return nbExcesVitesse;
    }

    public int totalAmendes(){
        int totalAmendes = 0;
        int nbExcesVitesse = nbExcesVitsse();
        for (int i = 0; i < nbExcesVitesse ; i++) {
            totalAmendes += delitsVitesse[i].montantAmende();
        }
        
        return totalAmendes;
    }

    public int depassementMaximal(){
        int depassementMaximal = 0;
        int nbExcesVitesse = nbExcesVitsse();
        for (int i = 0; i < nbExcesVitesse ; i++) {
            int depassement = delitsVitesse[i].getVitesseAuFlash() - delitsVitesse[i].getLimitationVitesse();
            if (depassementMaximal < depassement) depassementMaximal = depassement;
        }

        return depassementMaximal;
    }

    public String dossierExcesVitesse(){
        String dossierExcesVitesse = "Dossier pour excès de vitesse de " + prenom + " " + nom + " pour l'année en cours : \n";
        int nbExcesVitesse = nbExcesVitsse();
        for (int i = 0; i < nbExcesVitesse ; i++) {
            dossierExcesVitesse += " " + delitsVitesse[i] + "\n";
        }

        dossierExcesVitesse += "pour un montant total de " + totalAmendes() + " euros d'amande";

        return dossierExcesVitesse;
    }
}
