package premierPackage;

public class Rectangle {
    int largeur;
    int hauteur;
    int coordonneeX;
    int coordonneeY;

    Rectangle(int initLargeur, int initHauteur, int initCoordonneeX, int initCoordonneeY) { // Constructeur
        largeur = initLargeur; // Ou this.largeur = initLargeur ;
        hauteur = initHauteur; // Ou this.hauteur = initHauteur;
        coordonneeX = initCoordonneeX;
        coordonneeY = initCoordonneeY;
    }

    int perimetre() {
        return largeur + hauteur;
    }

    int surface() { // Méthodes
        return largeur * hauteur;
    }

    void modifierLargeur(int nouvelleLargeur){
        largeur += nouvelleLargeur;
    }

    void modifierHauteur(int nouvelleHauteur){
        hauteur += nouvelleHauteur;
    }

    void deplacerEn(int nouvelleCoordonneeX, int nouvelleCoordonneeY){
        coordonneeX = nouvelleCoordonneeX;
        coordonneeY = nouvelleCoordonneeY;
    }

}
