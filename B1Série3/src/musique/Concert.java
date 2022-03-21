package musique;

public class Concert {
    private String libelle;
    private String date;
    private GroupeMusical groupe;
    private String lieu;
    private double prix;

    public Concert(String libelle, String date,GroupeMusical groupe, String lieu, Double prix) {
        this.libelle = libelle;
        this.date = date;
        this.groupe = groupe;
        this.lieu = lieu;
        setPrix(prix);
    }

    public void setPrix(Double prix) {
        if (prix >= 0){
            this.prix = prix;
        }
    }

    public String getLibelle() {
        return libelle;
    }

    public String getDate() {
        return date;
    }

    public GroupeMusical getGroupe() {
        return groupe;
    }

    public String getLieu() {
        return lieu;
    }

    public Double getPrix() {
        return prix;
    }

    public String toString() {
        return "le concert intitulé " + libelle + " du groupe dénommé \n" + groupe + "\nprévu le " + date + " à " + lieu;
    }
}
