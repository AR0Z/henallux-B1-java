package sweetHome;

public class Principale {
    public static void main(String[] args) {
        Villa bungalow = new Villa("rue bungalow", 3, 30,0);
        Villa maisonCampagne = new Villa("rue de la campagne", 5, 2, 90, 70, 30);

        System.out.println(bungalow);
        System.out.println(maisonCampagne);

        VillaAvecCave manoir = new VillaAvecCave("rue du manoir", 10, 4, 110, 110, 80, 110, false);

        System.out.println(manoir);
    }
}