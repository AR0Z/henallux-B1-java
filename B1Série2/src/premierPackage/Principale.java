package premierPackage;

import java.util.Scanner;

public class Principale {
    public static void main(String[] args) {
        // Exercice 1
        Rectangle premierRectangle = new Rectangle(10,4,1,2);

        System.out.println("Coordonnées x : " + premierRectangle.getCoordonneeX() + " Coordonnées y :" + premierRectangle.getCoordonneeY() + " Largeur : " + premierRectangle.getLargeur() + " Hauteur : " + premierRectangle.getHauteur());

        premierRectangle.setCoordonneeX(0);
        premierRectangle.setCoordonneeY(2);
        premierRectangle.setLargeur(10);
        premierRectangle.setHauteur(4);

        System.out.println("Coordonnées x : " + premierRectangle.getCoordonneeX() + " Coordonnées y :" + premierRectangle.getCoordonneeY() + " Largeur : " + premierRectangle.getLargeur() + " Hauteur : " + premierRectangle.getHauteur());

        System.out.println("Perimetre : " + premierRectangle.perimetre() + " Surface : " + premierRectangle.surface());

        premierRectangle.modifierHauteur(1);
        premierRectangle.modifierLargeur(1);

        premierRectangle.deplacerEn(0,0);

        Rectangle secondRectangle = new Rectangle(1,2);

        System.out.println("Coordonnées x : " + secondRectangle.getCoordonneeX() + " Coordonnées y :" + secondRectangle.getCoordonneeY() + " Largeur : " + secondRectangle.getLargeur() + " Hauteur : " + secondRectangle.getHauteur());

        // Exercice 2
        Individu moi = new Individu("Germain", 20, 'M', "Belgique");

        System.out.println(moi.getPrenom() + " " + moi.getGenre() + " " + moi.getGenre());

        moi.setGenre('W');
        moi.setAge(-124);

        System.out.println(moi.getPrenom() + " " + moi.getGenre() + " " + moi.getGenre());

        System.out.println(moi.presentation(1));
        System.out.println(moi.presentation(2));
        System.out.println(moi.presentation(3));
        System.out.println(moi.presentation(4));




    }
}
