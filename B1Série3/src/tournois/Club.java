package tournois;

public class Club {

    private String nom;
    private String adresse;
    private Secretaire secretaire;

    public Club(String nom, String adresse, Secretaire secretaire){
        this.nom = nom;
        this.adresse = adresse;
        this.secretaire = secretaire;
    }

    public Secretaire getSecretaire() {
        return secretaire;
    }

    public String getAdresse() {
        return adresse;
    }

    public String toString() {
        return "club " + nom + " (secrétaire " + secretaire +")";
    }
}
