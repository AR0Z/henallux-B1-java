package packageLoisir;

public class BilletSpectacle {
    private String intituleSpectacle;
    private String dateSpectacle;
    private char categorie;
    private double coutDeBase;
    private boolean avecCarteEtudiant;

    public BilletSpectacle(String initIntituleSpectacle, String initDateSpectacle, char initCategorie, double initCoutDeBase, boolean initAvecCarteEtudiant){
        intituleSpectacle = initIntituleSpectacle;
        dateSpectacle = initDateSpectacle;
        categorie = initCategorie;
        coutDeBase = initCoutDeBase;
        avecCarteEtudiant = initAvecCarteEtudiant;

    }

    public void setCategorie(char categorie) {
        if(categorie == 'A' || categorie == 'B' || categorie == 'C') {
            this.categorie = categorie;
        }else{
            if(this.categorie == '\u0000'){
                this.categorie = 'C';
            }
        }
    }

    public void setCoutDeBase(double coutDeBase) {
        if (coutDeBase > 0){
            this.coutDeBase = coutDeBase;
        }else{
            if(this.coutDeBase == 0){
                this.coutDeBase = 1;
            }
        }
    }

    public double prixBillet(){
        return prixBillet(0);
    }

    public double prixBillet(int pourc){
        double prix = coutDeBase;

        switch (categorie){
            case 'A':
                prix *= 1.10;
                break;
            case 'B':
                prix *= 0.8;
                break;
        }

        if(avecCarteEtudiant){
            prix *= 0.5;
        }

        return (1 - pourc/100.) * prix;
    }
    String descriptionBillet(){
        return "Billet pour le spectacle intitulé " + intituleSpectacle + " du " + dateSpectacle + " en catégorie " + categorie + (avecCarteEtudiant ? " avec carte étudiant." : ".") + "\npour un total de " + prixBillet() + " euros";
    }
}
