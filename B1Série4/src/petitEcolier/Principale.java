package petitEcolier;

public class Principale {
    public static void main(String[] args) {
        Enfant enfant1 = new Enfant("Germain", "Duchêne", 8);
        Enfant enfant2 = new Enfant("Thérence", "Guerenne", 15);
        Enfant enfant3 = new Enfant("Amanda", "trembloy", -2);

        System.out.println(enfant1);
        System.out.println(enfant2);
        System.out.println(enfant3);
        Ecole ecole = new Ecole("Henallux", "IESN");
        EnfantScolarise enfantScolarise = new EnfantScolarise("Calvin", "Nogueira", 5, ecole, true, false, true);

        System.out.println(enfantScolarise.getPrenom() + (enfantScolarise.estEnAvance() ? " est" : " n'est pas") + " en avance");
        System.out.println(enfantScolarise);
    }
}
