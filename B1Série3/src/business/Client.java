package business;

public class Client {

    private String prenom;
    private String nom;

    public Client(String prenom, String nom){
        this.prenom = prenom;
        this.nom = nom;
    }

    public String toString() {
        return prenom + " " + nom;
    }
}
