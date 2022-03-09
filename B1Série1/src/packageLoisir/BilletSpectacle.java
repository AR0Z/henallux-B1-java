package packageLoisir;

public class BilletSpectacle {
    String intituleSpectacle;
    String dateSpectacle;
    char categorie;
    double coutDeBase;
    boolean avecCarteEtudiant;

    BilletSpectacle(String initIntituleSpectacle, String initDateSpectacle, char initCategorie, double initCoutDeBase, boolean initAvecCarteEtudiant){
        intituleSpectacle = initIntituleSpectacle;
        dateSpectacle = initDateSpectacle;
        categorie = initCategorie;
        coutDeBase = initCoutDeBase;
        avecCarteEtudiant = initAvecCarteEtudiant;

    }
    double prixBillet(){
        double prix = coutDeBase;

        switch (categorie){
            case 'A':
                prix *= 0.9;
                break;
            case 'B':
                prix *= 0.8;
                break;
        }

        if(avecCarteEtudiant){
            prix *= 0.5;
        }

        return prix;
    }
    String descriptionBillet(){
        return "Billet pour le spectacle intitulé " + intituleSpectacle + " du " + dateSpectacle + " en catégorie " + categorie + (avecCarteEtudiant ? " avec carte étudiant." : ".") + "\npour un total de " + prixBillet() + " euros";
    }
}
