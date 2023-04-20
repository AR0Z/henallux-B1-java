package tournois;

import java.util.*;

public class Arbitre {
    private String prenom;
    private String nom;
    private String code;
    private int anneeNaissance;

    public Arbitre(String prenom, String nom, String code, int anneeNaissance){
        this.prenom = prenom;
        this.nom = nom;
        this.code = code;
        setAnneeNaissance(anneeNaissance);
    }

    public String matricule(){
        return anneeNaissance + code;
    }

    private void setAnneeNaissance(int anneeNaissance) {
        GregorianCalendar dateDuJour = new GregorianCalendar();
        int anneeEnCours = dateDuJour.get(Calendar.YEAR);
        if(anneeEnCours - anneeNaissance < 18){
            this.anneeNaissance = anneeEnCours - 18;
        }else{
            this.anneeNaissance = anneeNaissance;
        }
    }

    public String toString() {
        return prenom + " " + nom + " (matricule : " + matricule() + ")";
    }
}
