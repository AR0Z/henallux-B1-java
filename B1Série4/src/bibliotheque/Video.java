package bibliotheque;

public class Video extends Multimedia{
    private String producteur;

    public Video(int code, String titre, int numeroSalle, int anneeAcquisition, Emprunteur emprunteur, String realisteur, int duree, int numeroCleUSB, String producteur) {
        super(code, titre, numeroSalle, anneeAcquisition, emprunteur, realisteur, duree, numeroCleUSB);
        this.producteur = producteur;
    }

    public Video(int code, String titre, int numeroSalle, int anneeAcquisition, String realisteur, int duree, int numeroCleUSB, String producteur) {
        super(code, titre, numeroSalle, anneeAcquisition, realisteur, duree, numeroCleUSB);
        this.producteur = producteur;
    }

    public String matricule(){
        return "V" + getCode();
    }
    public String denomination(){
        return "Docuement vidéo";
    }
}
