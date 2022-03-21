package bibliotheque;

public class Oeuvre {
    private int code;
    private String titre;
    private int numeroSalle;
    private int anneeAcquisition;
    private Emprunteur emprunteur;

    public Oeuvre(int code, String titre, int numeroSalle, int anneeAcquisition, Emprunteur emprunteur) {
        this.code = code;
        this.titre = titre;
        this.numeroSalle = numeroSalle;
        this.anneeAcquisition = anneeAcquisition;
        this.emprunteur = emprunteur;
    }

    public Oeuvre(int code, String titre, int numeroSalle, int anneeAcquisition){
        this(code, titre, numeroSalle, anneeAcquisition, null);
    }

    public int getCode() {
        return code;
    }

    public int getAnneeAcquisition() {
        return anneeAcquisition;
    }

    public int getNumeroSalle() {
        return numeroSalle;
    }

    public String matricule(){
        return "O" + code;
    }

    public String emplacement(){
        return "salle numéro " + numeroSalle;
    }

    public String denomination(){
        return "Oeuvre";
    }

    public void donnerEnPret(Emprunteur emprunteur){
        this.emprunteur = emprunteur;
    }

    public String toString() {
        return denomination() + " - " + matricule() + " (" + emplacement() + ") : " + titre + "\n" + (emprunteur != null ? "Emprunteur : " + emprunteur : "Aucun emprunteur");
    }
}
