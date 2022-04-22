package sweetHome;

public class Villa {
    private String adresse;
    private int nbChambres;
    private int nbEtages;
    private double surfacecRezChaussee;
    private double surfaceHabitableEtages;
    private double superficieTerrain;

    private Proprietaire proprietaire;

    public Villa(String adresse, int nbChambres, int nbEtages, double surfacecRezChaussee, double surfaceHabitableEtages, double superficieTerrain, Proprietaire proprietaire) {
        this.adresse = adresse;
        setNbChambres(nbChambres);
        setNbEtages(nbEtages);
        setSurfacecRezChaussee(surfacecRezChaussee);
        setSurfaceHabitableEtages(surfaceHabitableEtages);
        setSuperficieTerrain(superficieTerrain);
        this.proprietaire = proprietaire;
        this.proprietaire.ajouterVilla(this);
    }

    public Villa(String adresse, int nbChambres, int nbEtages, double surfacecRezChaussee, double surfaceHabitableEtages, double superficieTerrain) {
        this(adresse, nbChambres, nbEtages, surfacecRezChaussee, surfaceHabitableEtages, superficieTerrain, null);
    }

    public Villa(String adresse, int nbChambres, double surfacecRezChaussee, double superficieTerrain, Proprietaire proprietaire) {
        this(adresse, nbChambres, 0, surfacecRezChaussee, 0, superficieTerrain, proprietaire);
    }

    public Villa(String adresse, int nbChambres, double surfacecRezChaussee, double superficieTerrain) {
        this(adresse, nbChambres, 0, surfacecRezChaussee, 0, superficieTerrain, null);
    }

    public void setNbChambres(int nbChambres) {
        if(nbChambres >=0)
            this.nbChambres = nbChambres;
    }

    public void setNbEtages(int nbEtages) {
        if(nbEtages >=0)
            this.nbEtages = nbEtages;
    }

    public void setSurfacecRezChaussee(double surfacecRezChaussee) {
        if(surfacecRezChaussee >=0)
            this.surfacecRezChaussee = surfacecRezChaussee;
    }

    public void setSurfaceHabitableEtages(double surfaceHabitableEtages) {
        if(surfaceHabitableEtages >=0)
            this.surfaceHabitableEtages = surfaceHabitableEtages;
    }

    public void setSuperficieTerrain(double superficieTerrain) {
        if(superficieTerrain >=0)
            this.superficieTerrain = superficieTerrain;
    }

    public int getNbEtages() {
        return nbEtages;
    }

    public double superficcieJardin(){
        return superficieTerrain - surfacecRezChaussee;
    }

    public double surfaceTotale(){
        return surfacecRezChaussee + (nbEtages * surfaceHabitableEtages);
    }

    public String typeJardin(){
        String typeJardin;
        if(superficcieJardin() == 0){
            typeJardin = "sans jardin";
        }else if (superficcieJardin() > 50){
            typeJardin = "avec parc de " + superficcieJardin() + " ares";
        }else{
            typeJardin = "avec jardin de " + superficcieJardin() + " ares";
        }
        return typeJardin;
    }

    public boolean pourFamilleNombreuse(){
        boolean pourFamilleNombreuse = false;
        if(nbChambres >= 4) {
            pourFamilleNombreuse = true;
        }
        return pourFamilleNombreuse;
    }

    public String toString() {
        return "La villa située au " + adresse + " d'une surface habitable de " + surfaceTotale() + " m2 " + typeJardin() + (pourFamilleNombreuse() ? " convient " : " ne convient pas ") +  "pour une famille nombreuse." ;
    }
}