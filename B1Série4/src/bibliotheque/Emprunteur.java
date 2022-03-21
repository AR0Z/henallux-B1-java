package bibliotheque;

public class Emprunteur {
    private String prenom;
    private String nom;
    private int age;

    public Emprunteur(String prenom, String nom, int age) {
        this.prenom = prenom;
        this.nom = nom;
        this.age = age;
    }

    public String toString() {
        return prenom + " " + nom;
    }
}
