package musique;

public class GroupeMusical {
    String nom;
    String nomChanteur;
    int nbMusiciens;

    public GroupeMusical(String nom, String nomChanteur, int nbMusiciens) {
        this.nom = nom;
        this.nomChanteur = nomChanteur;
        setNbMusiciens(nbMusiciens);
    }

    public void setNbMusiciens(int nbMusiciens) {
        if(nbMusiciens >= 0){
            this.nbMusiciens = nbMusiciens;
        }
    }

    public String toString() {
        return nom + " (" + nomChanteur + " - acccompagnement : " + nbMusiciens + " musiciens)";
    }

    public String getNom() {
        return nom;
    }

    public String getNomChanteur() {
        return nomChanteur;
    }

    public int getNbMusiciens() {
        return nbMusiciens;
    }
}
