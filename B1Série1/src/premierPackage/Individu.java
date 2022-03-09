package premierPackage;

import static java.lang.Math.abs;

public class Individu {
    String prenom;
    int age;
    char genre;
    String localite;

    Individu(String initPrenom, int initAge, char initGenre, String initLocalite){
        prenom = initPrenom;
        age = initAge;
        genre = initGenre;
        localite = initLocalite;
    }
    String prensation(){

        return "Je m’appelle " + prenom + " et je suis " + ((genre == 'W') ? "âgée" : "âgé") + " de " + age + ( (abs(age) < 2) ? "an" : "ans") + ". Je réside à " + localite;
    }
}
