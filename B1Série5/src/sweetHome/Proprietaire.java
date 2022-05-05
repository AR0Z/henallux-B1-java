package sweetHome;

import java.util.stream.IntStream;

public class Proprietaire {
    public final int NB_MAX_PROPRIETES = 5;

    private String prenomNom;
    private String adresse;
    private String telephone;

    private Villa[] proprietes;
    private int nbProprietes;

    public Proprietaire(String prenomNom, String adresse, String telephone) {
        this.prenomNom = prenomNom;
        this.adresse = adresse;
        this.telephone = telephone;

        proprietes = new Villa[NB_MAX_PROPRIETES];
        nbProprietes = 0;
    }

    public int getNbProprietes() {
        return nbProprietes;
    }

    public void ajouterVilla(Villa villa){
        if(villa.getProprietaire() == this){
            if(nbProprietes < NB_MAX_PROPRIETES){
                proprietes[nbProprietes] = villa;
                nbProprietes++;
            }
        }
    }

    public void retirerVilla(Villa villa){
       int i = 0;
       while(i < nbProprietes && proprietes[i] != villa){
           i++;
       }
       if(proprietes[i] == villa){
           proprietes[i] = null;
           i++;
           while(i < NB_MAX_PROPRIETES){
               proprietes[i-1] = proprietes[i];
               i++;
           }
           proprietes[NB_MAX_PROPRIETES-1] = null;
       }
    }

    public double surfaceTotale(){
        double surfaceTotale = 0;

        for (int i = 0; i < nbProprietes ; i++) {
            if(proprietes[i] != null)
                surfaceTotale += proprietes[i].surfaceTotale();
        }

        return surfaceTotale;
    }

    public String listingProprietes(){
        String listingProprietes = "Listing des propriétés de " + prenomNom + "\n";

        for (int i = 0; i < nbProprietes ; i++) {
            if(proprietes[i] != null)
                listingProprietes += proprietes[i] + "\n";
        }

        listingProprietes += "Surface totale de l'ensemble des propriétés : " + surfaceTotale() + "m2";

        return listingProprietes;
    }
}
