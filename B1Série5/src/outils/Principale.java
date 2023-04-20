package outils;

import java.lang.*;

public class Principale {
    public static void main(String[] args) {
        System.out.println(Math.sqrt(16));
        System.out.println(Math.sqrt(88));
        System.out.println(Math.sqrt(148));

        System.out.println(Math.pow(8,2));
        System.out.println(Math.pow(3,4));
        System.out.println(Math.pow(2,10));

        for (int i = 0; i < 10 ;i++)
            System.out.println(Math.random()*20);

        for (int i = 0; i < 10 ;i++)
            System.out.println(Math.round(Math.random()*20));

        System.out.println(OutilsAffichage.titreAuCentre("Salami", 100));
    }
}