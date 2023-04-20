package musique;

public class Personne {
    private String prenom;
    private String nom;
    private String telephone;
    private String adresseMail;

    public Personne(String prenom, String nom, String telephone, String adresseMail) {
        this.prenom = prenom;
        this.nom = nom;
        this.telephone = telephone;
        this.adresseMail = adresseMail;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getTelephone() {
        return telephone;
    }

    public String getAdresseMail() {
        return adresseMail;
    }

    public String toString() {
        return prenom + " " + nom + " (" + telephone + " - " +adresseMail + ")";
    }
}
