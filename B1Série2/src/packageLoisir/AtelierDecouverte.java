package packageLoisir;

public class AtelierDecouverte {
    private String prenomEnfant;
    private String domaine;
    private int nbSeances;
    private boolean enJournee;

    public AtelierDecouverte(String prenomEnfant, String domaine, int nbSeances, boolean enJournee) {
        this.prenomEnfant = prenomEnfant;
        this.domaine = domaine;
        this.nbSeances = nbSeances;
        this.enJournee = enJournee;
    }

    public AtelierDecouverte(String prenomEnfant, String domaine, int nbSeances) {
        this(prenomEnfant, domaine, nbSeances, true);
    }

    public String getPrenomEnfant() {
        return prenomEnfant;
    }

    public String getDomaine() {
        return domaine;
    }

    public int getNbSeances() {
        return nbSeances;
    }

    public boolean estEnJournee() {
        return enJournee;
    }

    public void setPrenomEnfant(String prenomEnfant) {
        this.prenomEnfant = prenomEnfant;
    }

    public void setDomaine(String domaine) {
        this.domaine = domaine;
    }

    public void setNbSeances(int nbSeances) {
        this.nbSeances = nbSeances;
    }

    public void setEnJournee(boolean enJournee) {
        this.enJournee = enJournee;
    }

    public int duree(){
        int duree;
        if(enJournee){
            duree = nbSeances * 4;
        }else{
            duree = nbSeances * 2;
        }
        return duree;
    }

    public String typeCertificat(){
        String typeCertificat;
        if(duree() <= 8) {
            typeCertificat = "Benjamin";
        }else if(duree() <= 24) {
            typeCertificat = "Explorateur";
        }else{
            typeCertificat = "Capitaine";
        }
        return typeCertificat;
    }

    public String toString() {
        String message;
        if(enJournee){
            message = "Au terme d'un atelier de " + duree() + " heures organisé en journée \n" + prenomEnfant + " a reçu le titre de " + typeCertificat() + " en " + domaine;
        }else{
            message = "Au terme d'un atelier de " + duree() + " heures organisé en après 16 heures \n" + prenomEnfant + " a reçu le titre de " + typeCertificat() + " en " + domaine;
        }
        return message;
    }
}
