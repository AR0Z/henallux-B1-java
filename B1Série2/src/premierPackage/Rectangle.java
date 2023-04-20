package premierPackage;

public class Rectangle {
    private int largeur;
    private int hauteur;
    private int coordonneeX;
    private int coordonneeY;

    public Rectangle(int initLargeur, int initHauteur, int initCoordonneeX, int initCoordonneeY) { // Constructeur
        largeur = initLargeur; // Ou this.largeur = initLargeur ;
        hauteur = initHauteur; // Ou this.hauteur = initHauteur;
        coordonneeX = initCoordonneeX;
        coordonneeY = initCoordonneeY;
    }

    public Rectangle(int initLargeur, int initHauteur){
        this(initLargeur, initLargeur, 0, 0);
    }

    int perimetre() {
        return largeur + hauteur;
    }

    int surface() { // Méthodes
        return largeur * hauteur;
    }

    void modifierLargeur(int nouvelleLargeur){
        setLargeur(largeur + nouvelleLargeur);
    }

    void modifierHauteur(int nouvelleHauteur){
        setHauteur(hauteur + nouvelleHauteur);
    }

    void deplacerEn(int nouvelleCoordonneeX, int nouvelleCoordonneeY){
        setCoordonneeX(nouvelleCoordonneeX);
        setCoordonneeY(nouvelleCoordonneeY);
    }

    public int getLargeur() {
        return largeur;
    }

    public int getHauteur() {
        return hauteur;
    }

    public int getCoordonneeX() {
        return coordonneeX;
    }

    public int getCoordonneeY() {
        return coordonneeY;
    }

    public void setLargeur(int largeur) {
        if (largeur >= 0){
            this.largeur = largeur;
        }else{
            this.largeur = 0;
        }
    }

    public void setHauteur(int hauteur) {
        if (hauteur >= 0){
            this.hauteur = hauteur;
        }else{
            this.hauteur = 0;
        }
    }

    public void setCoordonneeX(int coordonneeX) {
        if (coordonneeX >= 0){
            this.coordonneeX = coordonneeX;
        }else{
            this.coordonneeX = 0;
        }
    }

    public void setCoordonneeY(int coordonneeY) {
        if (coordonneeY >= 0){
            this.coordonneeY = coordonneeY;
        }else{
            this.coordonneeY = 0;
        }
    }
}
