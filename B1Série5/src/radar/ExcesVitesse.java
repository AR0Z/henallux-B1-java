package radar;

public class ExcesVitesse {
    private String localite;
    private int limitationVitesse;
    private int vitesseAuFlash;

    public ExcesVitesse(String localite, int limitationVitesse, int vitesseAuFlash) {
        this.localite = localite;
        setLimitationVitesse(limitationVitesse);
        setVitesseAuFlash(vitesseAuFlash);
    }

    public void setLimitationVitesse(int limitationVitesse) {
        if (10 <= limitationVitesse && limitationVitesse <= 130){
            this.limitationVitesse = limitationVitesse;
        }else{
            if (this.limitationVitesse == 0){
                this.limitationVitesse = 90;
            }
        }

        // this.limitationVitesse = (limitationVitesse < 10 || limitationVitesse > 130) ? 90 : limitationVitesse;
    }

    public void setVitesseAuFlash(int vitesseAuFlash) {
        if (0 <= vitesseAuFlash && vitesseAuFlash <= 400) {
            this.vitesseAuFlash = vitesseAuFlash;
        }else{
            if (vitesseAuFlash < 0) {
                this.vitesseAuFlash = 0;
            } else if (vitesseAuFlash > 400) {
                this.vitesseAuFlash = 400;
            }
        }

    }

    public int getLimitationVitesse() {
        return limitationVitesse;
    }

    public int getVitesseAuFlash() {
        return vitesseAuFlash;
    }

    public int montantAmende(){
        int montantAmende = 0;

        if(limitationVitesse < vitesseAuFlash){
            montantAmende = 53;
            if(limitationVitesse < vitesseAuFlash - 10){
                int kmSupplémentaire = vitesseAuFlash - 10 - limitationVitesse;
                if(limitationVitesse <= 50){
                    montantAmende += (kmSupplémentaire * 11);
                }else{
                    montantAmende += (kmSupplémentaire * 6);
                }
            }
        }
        return montantAmende;
    }

    @Override
    public String toString() {
        return montantAmende() + " euros d'amende pour avoir été flashé à " + vitesseAuFlash + " km/h à " + localite + " sur une route limitée à " + limitationVitesse + " km/h";
    }
}

