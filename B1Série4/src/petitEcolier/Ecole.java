package petitEcolier;

public class Ecole {
    private String nom;
    private String localite;

    public Ecole(String nom, String localite) {
        this.nom = nom;
        this.localite = localite;
    }

    public String toString() {
        return "L'école " + nom + " (localité : " + localite + ")";
    }
}
