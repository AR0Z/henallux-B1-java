package sweetHome;

public class Principale {
    public static void main(String[] args) {

        Proprietaire proprietaire1 = new Proprietaire("Thérence Guerenne-Courtois", "rue du thérence", "0");
        Proprietaire proprietaire2 = new Proprietaire("Germain Duchêne", "rue du thérence", "0");
        Villa bungalow = new Villa("rue bungalow", 3, 30,40, proprietaire1);
        Villa maisonCampagne = new Villa("rue de la campagne", 5, 2, 30, 70, 90, proprietaire1);

        VillaAvecCave manoir = new VillaAvecCave("rue du manoir", 10, 4, 80, 80, 110, proprietaire1, 110, false);

        System.out.println(proprietaire1.listingProprietes());
        System.out.println(proprietaire2.listingProprietes());
        maisonCampagne.changerProprietaire(proprietaire2);
        bungalow.changerProprietaire(proprietaire2);
        manoir.changerProprietaire(proprietaire2);
        System.out.println(proprietaire1.listingProprietes());
        System.out.println(proprietaire2.listingProprietes());
    }
}