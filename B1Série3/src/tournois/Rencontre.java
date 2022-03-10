package tournois;

public class Rencontre {
    private Equipe locaux;
    private Equipe visiteurs;
    private int pointsLocaux;
    private int pointsVisiteurs;
    private int fautesLocaux;
    private int fautesVisiteurs;
    private Arbitre arbitre;

    public Rencontre(Equipe locaux, Equipe visiteurs, int pointsLocaux, int pointsVisiteurs, int fautesLocaux, int fautesVisiteurs, Arbitre arbitre){
        this.locaux = locaux;
        this.visiteurs = visiteurs;
        setPointsLocaux(pointsLocaux);
        setPointsVisiteurs(pointsVisiteurs);
        setFautesLocaux(fautesLocaux);
        setFautesVisiteurs(fautesVisiteurs);
        this.arbitre = arbitre;

    }

    public Rencontre(Equipe locaux, Equipe visiteurs, Arbitre arbitre){
        this(locaux, visiteurs, 0, 0, 0, 0, arbitre);
    }

    private void setPointsLocaux(int pointsLocaux) {
        if (pointsLocaux >= 0){
            this.pointsLocaux = pointsLocaux;
        }
    }

    private void setPointsVisiteurs(int pointsVisiteurs) {
        if (pointsVisiteurs >= 0){
            this.pointsVisiteurs = pointsVisiteurs;
        }
    }

    private void setFautesLocaux(int fautesLocaux) {
        if (fautesLocaux >= 0){
            this.fautesLocaux = fautesLocaux;
        }
    }

    private void setFautesVisiteurs(int fautesVisiteurs) {
        if (fautesVisiteurs >= 0){
            this.fautesVisiteurs = fautesVisiteurs;
        }
    }

    public void setArbitre(Arbitre arbitre) { this.arbitre = arbitre; }

    public Arbitre getArbitre() {
        return arbitre;
    }

    public Equipe getVisiteurs() {
        return visiteurs;
    }

    public Equipe getLocaux() {
        return locaux;
    }



    public void ajouterPointsAuxLocaux(){ ajouterPointsAuxLocaux(1); }

    public void ajouterPointsAuxLocaux(int points){ this.pointsLocaux += points; }

    public void ajouterPointsAuxVisiteurs(){ ajouterPointsAuxVisiteurs(1); }

    public void ajouterPointsAuxVisiteurs(int points){ this.pointsVisiteurs += points; }

    public void ajouterFauteAuxLocaux(){
        this.fautesLocaux += 1;
    }

    public void ajouterFauteAuxVisiteurs(){
        this.fautesVisiteurs += 1;
    }

    public String vainqueur(){
        String vainqueur;
        if(pointsLocaux == pointsVisiteurs){
            vainqueur = "ex æquo";
        }else if(pointsLocaux > pointsVisiteurs){
            vainqueur = locaux.getNom();
        }else{
            vainqueur = visiteurs.getNom();
        }
        return vainqueur;
    }

    public String equipeFairPlay(){
        String equipeFairPlay;
        if(fautesLocaux == fautesVisiteurs){
            equipeFairPlay = "ex æquo";
        }else if(fautesVisiteurs > fautesLocaux){
            equipeFairPlay = locaux.getNom();
        }else{
            equipeFairPlay = visiteurs.getNom();
        }
        return equipeFairPlay;
    }

    public boolean exAequo(){ return pointsLocaux == pointsVisiteurs; }

    public String presentationLocaux(){
        return "équipe locale " + locaux.getNom();
    }

    public String presentationVisiteurs(){ return "équipe des visiteurs " + visiteurs.getNom(); }

    public String presentationAdversaires(){ return "L'" + presentationLocaux() + " reçoit \nl'" + presentationVisiteurs(); }

    public void ajouterPoints(char equipe){
        if(equipe == 'L'){
            ajouterPointsAuxLocaux();
        }else if(equipe == 'V'){
            ajouterPointsAuxVisiteurs();
        }
    }

    public String toString() {
        return "Rencontre arbitrée par :\n" + arbitre + "\nentre\nLocaux :\n" + locaux + "\net\nVisiteurs :\n" + visiteurs + "\nVainqueur : " + vainqueur();
    }
}
