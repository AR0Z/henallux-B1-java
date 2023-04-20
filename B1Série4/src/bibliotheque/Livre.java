package bibliotheque;

public class Livre extends Oeuvre{
    private String auteur;
    private int nbPages;
    private int numeroEtagere;

    public Livre(int code, String titre, int numeroSalle, int anneeAcquisition, Emprunteur emprunteur, String auteur, int nbPages, int numeroEtagere) {
        super(code, titre, numeroSalle, anneeAcquisition, emprunteur);

        this.auteur = auteur;
        this.nbPages = nbPages;
        this.numeroEtagere = numeroEtagere;

    }

    public Livre(int code, String titre, int numeroSalle, int anneeAcquisition, String auteur, int nbPages, int numeroEtagere) {
        super(code, titre, numeroSalle, anneeAcquisition);

        this.auteur = auteur;
        this.nbPages = nbPages;
        this.numeroEtagere = numeroEtagere;
    }

    public String emplacement(){
        return super.emplacement() + ", étagère " + numeroEtagere;
    }
    public String matricule(){
        return "L" + getCode() + "/" + getNumeroSalle();
    }
    public String denomination(){
        return "Livre";
    }
}
