package business;

public class Article {

    private String libelle;
    private double prix;

    public Article(String libelle, double prix){
        this.libelle = libelle;
        setPrix(prix);
    }

    public void setPrix(double prix) {
        if(prix >= 0){
            this.prix = prix;
        }
    }

    public double getPrix() {
        return prix;
    }

    public String toString() {
        return libelle + " (" + prix + " " + (prix >= 2 ? "euros" : "euro") + ")";
    }
}
