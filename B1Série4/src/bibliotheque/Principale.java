package bibliotheque;

public class Principale {
    public static void main(String[] args) {
        Emprunteur emprunteur1 = new Emprunteur("Louis", "Lejeune", 18);
        Oeuvre oeuvre1 = new Oeuvre(3011, "Jumanji", 17, 2020, emprunteur1);

        System.out.println(oeuvre1);
    }
}
