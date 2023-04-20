package bibliotheque;

public class Multimedia extends Oeuvre{
    private String realisteur;
    private int duree;
    private int numeroCleUSB;

    public Multimedia(int code, String titre, int numeroSalle, int anneeAcquisition, Emprunteur emprunteur, String realisteur, int duree, int numeroCleUSB) {
        super(code, titre, numeroSalle, anneeAcquisition, emprunteur);
        this.realisteur = realisteur;
        this.duree = duree;
        this.numeroCleUSB = numeroCleUSB;
    }

    public Multimedia(int code, String titre, int numeroSalle, int anneeAcquisition, String realisteur, int duree, int numeroCleUSB) {
        super(code, titre, numeroSalle, anneeAcquisition);
        this.realisteur = realisteur;
        this.duree = duree;
        this.numeroCleUSB = numeroCleUSB;
    }

    public String emplacement(){
        return super.emplacement() + ", clef USB " +numeroCleUSB;
    }

    public String matricule(){
        return "M" + getCode();
    }

    public String denomination(){
        return "Document multimedia";
    }
}
