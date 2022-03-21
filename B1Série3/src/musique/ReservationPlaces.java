package musique;

public class ReservationPlaces {
    private Personne personne;
    private int nbPlaces;
    private boolean estPaye;
    private Concert concert;

    public ReservationPlaces(Personne personne, int nbPlaces, boolean estPaye, Concert concert) {
        this.personne = personne;
        setNbPlaces(nbPlaces);
        this.estPaye = estPaye;
        this.concert = concert;
    }

    public ReservationPlaces(Personne personne, boolean estPaye, Concert concert){
        this(personne, 1, estPaye, concert);
    }

    public ReservationPlaces(Personne personne, int nbPlaces, Concert concert){
        this(personne, nbPlaces, true, concert);
    }

    public ReservationPlaces(Personne personne, Concert concert){
        this(personne, 1, true, concert);
    }

    public void setNbPlaces(int nbPlaces) {
        if(nbPlaces > 0){
            this.nbPlaces = nbPlaces;
        }else{
            if (this.nbPlaces == Integer.MIN_VALUE){
                this.nbPlaces = 1;
            }
        }
    }

    public int getNbPlaces() {
        return nbPlaces;
    }

    public boolean EstPaye() {
        return estPaye;
    }

    public void setEstPaye(boolean estPaye) {
        this.estPaye = estPaye;
    }

    public Personne getPersonne() {
        return personne;
    }

    public Concert getConcert() {
        return concert;
    }

    public double prixTotal(){
        return concert.getPrix() * nbPlaces;
    }

    public String toString() {
        return personne + "\na réservé " + nbPlaces + " places pour " + concert + "pour un coût total de " + prixTotal() + " euros. \n" + (estPaye ? "Cette réservation est déjà payé." : "Cette réservation est en attente de paiement.");
    }
}
