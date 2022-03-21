package musique;

public class Principale {
    public static void main(String[] args) {
        GroupeMusical premierGroupe = new GroupeMusical("Blue Birds", "Josh Grant", 5 );

        System.out.println(premierGroupe);

        Concert premierConcert = new Concert("Beach Folk", "21 juillet 2020", premierGroupe, "Knokke", 33.5);

        System.out.println(premierConcert);

        Personne premierPersonne = new Personne("Julian", "Liberry", "0499/25.78.42","jul.liberry@gmail.com");

        System.out.println(premierPersonne);

        ReservationPlaces reservation = new ReservationPlaces(premierPersonne, 4, false, premierConcert);

        System.out.println(reservation.prixTotal());
        System.out.println(reservation);
        System.out.println(reservation.getNbPlaces());
        System.out.println(reservation.EstPaye() ? "déjà payé" : "en attente de paiement");
        reservation.setEstPaye(true);
        System.out.println(reservation.EstPaye() ? "déjà payé" : "en attente de paiement");
        reservation.setNbPlaces(6);
        System.out.println(reservation);

        System.out.println(reservation.getPersonne());
        System.out.println(reservation.getPersonne().getNom());
        System.out.println(reservation.getConcert());
        System.out.println(reservation.getConcert().getDate());
        System.out.println(reservation.getConcert().getGroupe());
        System.out.println(reservation.getConcert().getGroupe().getNomChanteur());
    }
}
