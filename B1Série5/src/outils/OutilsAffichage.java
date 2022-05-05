package outils;

import java.util.*;

public class OutilsAffichage {
    public static String titreAuCentre(String string, int longeurLigne){
        String s = "";
        int espace = (longeurLigne - string.length()) / 2;
        for (int i = 0;i<espace;i++)
            s += " ";
        string += s;
        s += string;
        return s;
    }
}