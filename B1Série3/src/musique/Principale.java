package musique;

public class Principale {
    public static void main(String[] args) {
        GroupeMusical premierGroupe = new GroupeMusical("Blue Birds", "Josh Grant", 5 );

        System.out.println(premierGroupe);

        Concert premierConcert = new Concert("Beach Folk", "21 juillet 2020", premierGroupe, "Knokke", 33.5);

        System.out.println(premierConcert);

        Personne premierPersonne = new Personne("Julian", "Liberry", "0499/25.78.42","jul.liberry@gmail.com");

        System.out.println(premierPersonne);

        ReservationPlaces premierReservationPlaces = new ReservationPlaces(premierPersonne, 4, false, premierConcert);

        System.out.println(premierReservationPlaces.prixTotal());
        System.out.println(premierReservationPlaces);
        System.out.println(premierReservationPlaces.getNbPlaces());
        System.out.println(premierReservationPlaces.EstPaye() ? "déjà payé" : "en attente de paiement");
        premierReservationPlaces.setEstPaye(true);
        System.out.println(premierReservationPlaces.EstPaye() ? "déjà payé" : "en attente de paiement");
        premierReservationPlaces.setNbPlaces(6);
        System.out.println(premierReservationPlaces);

        System.out.println(premierReservationPlaces.getPersonne());
        System.out.println(premierReservationPlaces.getPersonne().getNom());
        System.out.println(premierReservationPlaces.getConcert());
        System.out.println(premierReservationPlaces.getConcert().getDate());
        System.out.println(premierReservationPlaces.getConcert().getGroupe());
        System.out.println(premierReservationPlaces.getConcert().getGroupe().getNomChanteur());
    }
}
