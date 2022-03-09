package tournois;

public class Equipe {
    private String nom;
    private String categorie;
    private Club club;
    private Coach coach;

    public Equipe(String nom, String categorie, Club club, Coach coach){
        this.nom = nom;
        this.categorie = categorie;
        this.club = club;
        this.coach = coach;
    }

    public Coach getCoach() {
        return coach;
    }

    public Club getClub() {
        return club;
    }

    public String getNom() {
        return nom;
    }

    @Override
    public String toString() {
        return "l'équipe " + nom + " de la catégorie " + categorie + "\ndu " + club + "\ncoach par le " + coach;
    }
}
