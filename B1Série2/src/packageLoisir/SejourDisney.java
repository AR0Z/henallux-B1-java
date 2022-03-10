package packageLoisir;

public class SejourDisney {
    private int nbEnfants; //
    private int nbAdultes; //
    private int nbJours; //
    private int nbVehiculesParking; //
    private boolean avecPMR;

    public SejourDisney(int nbEnfants, int nbAdultes, int nbJours, int nbVehiculesParking, boolean initAvecPMR){
        setNbEnfants(nbEnfants);
        setNbAdultes(nbAdultes);
        setNbJours(nbJours);
        setNbVehiculesParking(nbVehiculesParking);
        avecPMR = initAvecPMR;
    }

    public void setNbEnfants(int nbEnfants) {
        if(nbEnfants >= 0){
            this.nbEnfants = nbEnfants;
        }else{
            if(this.nbEnfants == Integer.MIN_VALUE){
                this.nbEnfants = 0;
            }
        }
    }

    public void setNbAdultes(int nbAdultes) {
        if(nbAdultes >= 0){
            this.nbAdultes = nbAdultes;
        }else{
            if(this.nbAdultes == Integer.MIN_VALUE){
                this.nbAdultes = 0;
            }
        }
    }

    public void setNbJours(int nbJours) {
        if(nbJours > 0){
            this.nbJours = nbJours;
        }else{
            if(this.nbJours == Integer.MIN_VALUE){
                this.nbJours = 1;
            }
        }
    }

    public void setNbVehiculesParking(int nbVehiculesParking) {
        if(nbVehiculesParking > 0){
            this.nbVehiculesParking = nbVehiculesParking;
        }else{
            if(this.nbVehiculesParking == Integer.MIN_VALUE){
                this.nbVehiculesParking = 1;
            }
        }
    }

    public boolean estLongSejour(){
        return nbJours >= 3;
    }

    public double coutEntreeParc(){
        double prix = 0;
        int nbJoursPrix = nbJours;

        if(estLongSejour()){
            nbJoursPrix -= 1;
        }

        prix += (nbEnfants * 19.9) * nbJoursPrix;
        prix += (nbAdultes * 45) * nbJoursPrix;

        return prix;
    }

    public int nbNuiteesEnfantsGratuites(){
        return (nbJours-1)/3;
    }

    public double coutHotel(){
        double prix = 0;
        int nbNuit = nbJours -1;
        if(nbNuit > 0){
            prix += (nbAdultes * nbNuit) * 65.5;

            nbNuit -= nbNuiteesEnfantsGratuites();

            prix += (nbEnfants * nbNuit) * 49.9;
        }
        return prix;
    }

    public double coutParking(){
        double prix = 0;
        if(!avecPMR){
            prix += 8 * nbJours;
        }
        return prix;
    }

    public double coutTotal(){
        return coutEntreeParc() + coutHotel() + coutParking();
    }
    public boolean aAccesPrioritaire(){
        return avecPMR;
    }
    public String resumeSejour(){
        return "Le séjour chez Disney de " + nbJours + " jour(s) et " + (nbJours-1) + " nuit(s) pour " + nbEnfants + " enfant(s) et " + nbAdultes + " adulte(s) avec " + nbVehiculesParking + " véhicule(s) pour un montant total de " + coutTotal() + " euros" + (aAccesPrioritaire() ? " avec accès prioritaire." : "");
    }
}
