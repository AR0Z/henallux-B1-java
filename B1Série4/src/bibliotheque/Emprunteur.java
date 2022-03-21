package bibliotheque;

import java.time.YearMonth;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Emprunteur {
    private String prenom;
    private String nom;
    private GregorianCalendar dateAnniversaire;

    public Emprunteur(String prenom, String nom, GregorianCalendar dateAnniversaire) {
        this.prenom = prenom;
        this.nom = nom;
        this.dateAnniversaire = dateAnniversaire;
    }

    public Emprunteur(String prenom, String nom, int annee, int mois, int jour) {
        this.prenom = prenom;
        this.nom = nom;
        setDateAnniversaire(annee, mois, jour);
    }

    public void setDateAnniversaire(GregorianCalendar dateAnniversaire) {
        this.dateAnniversaire = dateAnniversaire;
    }

    public void setDateAnniversaire(int annee, int mois, int jour) {
        if(mois < 1 || mois > 12){
            mois = 1;
        }

        YearMonth yearMonthObject = YearMonth.of(annee, mois);
        int daysInMonth = yearMonthObject.lengthOfMonth();

        if(jour < 1 || jour > daysInMonth){
            jour = 1;
        }

        GregorianCalendar dateAnniversaire = new GregorianCalendar(annee, mois-1, jour);

        this.dateAnniversaire = dateAnniversaire;
    }

    public String presentationDateNaissance(){
        return dateAnniversaire.get(Calendar.DAY_OF_MONTH) + "/" + (dateAnniversaire.get(Calendar.MONTH) + 1) + "/" + dateAnniversaire.get(Calendar.YEAR);
    }

    public String toString() {
        return prenom + " " + nom;
    }
}
