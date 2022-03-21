package sweetHome;

public class VillaAvecCave extends Villa{
    private double surfaceCave;
    private boolean aGarageEnSousSol;

    public VillaAvecCave(String adresse, int nbChambres, int nbEtages, double surfacecRezChaussee, double surfaceHabitableEtages, double superficieTerrain, double surfaceCave, boolean aGarageEnSousSol) {
        super(adresse, nbChambres, nbEtages, surfacecRezChaussee, surfaceHabitableEtages, superficieTerrain);

        this.surfaceCave = surfaceCave;
        this.aGarageEnSousSol = aGarageEnSousSol;
    }

    public void setSurfaceCave(double surfaceCave) {
        if(surfaceCave > 0)
            this.surfaceCave = surfaceCave;
    }

    public double surfaceTotale() {
        return super.surfaceTotale() + surfaceCave;
    }

    public int nbNiveaux(){
        return getNbEtages() + 2;
    }

    @Override
    public String toString() {
        return super.toString() + "\nElle compote " + nbNiveaux() + " niveaux et contient des caves de " + surfaceCave + " m2 " + (aGarageEnSousSol ? "avec garage(s)" : "sans garage") + " en sous-sol.";
    }
}
