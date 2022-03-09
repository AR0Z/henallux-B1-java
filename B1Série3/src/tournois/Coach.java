package tournois;

import java.util.*;

public class Coach {
    private String prenom;
    private String nom;
    private int anneeDebut;

    public Coach(String prenom, String nom, int anneeDebut){
        this.prenom = prenom;
        this.nom = nom;
        setAnneeDebut(anneeDebut);
    }

    public String getPrenom() {
        return prenom;
    }

    public int nbAnneesExperience(){
        GregorianCalendar dateDuJour = new GregorianCalendar();
        int anneeEnCours = dateDuJour.get(Calendar.YEAR);

        return anneeEnCours - anneeDebut;
    }

    public void setAnneeDebut(int anneeDebut) {
        GregorianCalendar dateDuJour = new GregorianCalendar();
        int anneeEnCours = dateDuJour.get(Calendar.YEAR);
        if(anneeDebut > anneeEnCours){
            this.anneeDebut = anneeEnCours;
        }else {
            this.anneeDebut = anneeDebut;
        }
    }

    public String toString() {
        return "coach " + prenom + " " + nom + " (" + nbAnneesExperience() + " années de'expérience)";
    }
}
