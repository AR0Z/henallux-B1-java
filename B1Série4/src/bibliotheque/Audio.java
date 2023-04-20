package bibliotheque;

public class Audio extends Multimedia {
    private String preneurDeSon;

    public Audio(int code, String titre, int numeroSalle, int anneeAcquisition, Emprunteur emprunteur, String realisteur, int duree, int numeroCleUSB, String preneurDeSon) {
        super(code, titre, numeroSalle, anneeAcquisition, emprunteur, realisteur, duree, numeroCleUSB);
        this.preneurDeSon = preneurDeSon;
    }

    public Audio(int code, String titre, int numeroSalle, int anneeAcquisition, String realisteur, int duree, int numeroCleUSB, String preneurDeSon) {
        super(code, titre, numeroSalle, anneeAcquisition, realisteur, duree, numeroCleUSB);
        this.preneurDeSon = preneurDeSon;
    }

    public String matricule(){
        return (getAnneeAcquisition() < 2000 ? "D" : "N") + getCode();
    }
    public String denomination(){
        return "Document audio";
    }
}
