package tournois;

public class Secretaire {
    private String prenom;
    private String nom;
    private String telephone;

    public Secretaire(String prenom, String nom, String telephone){
        this.prenom = prenom;
        this.nom = nom;
        this.telephone = telephone;
    }

    public String getTelephone() {
        return telephone;
    }

    public String toString() {
        return prenom + " " + nom;
    }
}
