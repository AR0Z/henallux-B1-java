package bibliotheque;

public class Principale {
    public static void main(String[] args) {
        Emprunteur emprunteur1 = new Emprunteur("Louis", "Lejeune", 1980, 2,30 );
        System.out.println(emprunteur1.presentationDateNaissance());
        Oeuvre oeuvre1 = new Oeuvre(3011, "Jumanji", 17, 2020, emprunteur1);

        System.out.println(oeuvre1);

        Livre livre1 = new Livre(1077, "Alice au pays des merveilles", 15, 2020, "Alice", 200, 3);
        System.out.println(livre1);

        Multimedia multimedia1 = new Multimedia(5025, "Big Ben", 5, 2020, "Stich", 120, 5);
        System.out.println(multimedia1);

        Audio audio1 = new Audio(8532, "Le Big Data et nous", 4, 2021, "Germain", 120, 3, "Michel");
        System.out.println(audio1);

        Video video1 = new Video(8533, "Les cinglés de l'IOT", 5, 2021, "Germain", 120, 2, "Michel");
        System.out.println(video1);

    }
}
