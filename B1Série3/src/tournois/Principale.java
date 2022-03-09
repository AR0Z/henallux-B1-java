package tournois;

public class Principale {
    public static void main(String[] args) {
        Secretaire premierSecretaire = new Secretaire("Thérence","Guerenne-Courtois","+32");
        Secretaire secondeSecretaire = new Secretaire("Amanda", "Trembloy", "+32");

        Club premierClub = new Club("NwarSquaD","Funcraft", premierSecretaire);
        Club secondClub = new Club("Kattegath", "Funcraft", secondeSecretaire);

        System.out.println(premierClub);
        System.out.println(secondClub);

        Coach premierCoach = new Coach("Germain", "Duchêne", 2020);
        Coach secondCoach = new Coach("Calvin", "Nogueira", 2100);

        System.out.println(premierCoach);
        System.out.println(secondCoach);

        Equipe premierEquipe = new Equipe("Première équipe", "jeux de rôles", premierClub, premierCoach);
        Equipe secondEquipe = new Equipe("Seconde équipe", "jeux de rôles", secondClub, secondCoach);

        System.out.println(premierEquipe);
        System.out.println(secondEquipe);

        Arbitre premierArbitre = new Arbitre("Quentin", "Markus", "abc", 2001);

        System.out.println(premierArbitre.matricule());
        System.out.println(premierArbitre);

        Rencontre challenge = new Rencontre(premierEquipe, secondEquipe, 5, 2, 2, 3, premierArbitre);
        challenge.ajouterPointsAuxLocaux();
        challenge.ajouterFauteAuxLocaux();

        System.out.println(challenge.presentationLocaux() + " vs " + challenge.presentationVisiteurs());
        System.out.println(challenge.vainqueur());
        System.out.println(challenge.equipeFairPlay());

        if(challenge.exAequo()){
            System.out.println("ils sont exAequo");
        }else{
            System.out.println("ils ne sont pas exAequo");
        }

        Arbitre deuxiemeArbitre = new Arbitre("Alex", "Goudi", "abc", 2001);
        challenge.setArbitre(deuxiemeArbitre);

        System.out.println(challenge.presentationAdversaires());

        challenge.ajouterPoints('V');

        System.out.println(challenge);

        System.out.println(challenge.getArbitre());
        System.out.println(challenge.getVisiteurs().getClub());
        System.out.println(challenge.getArbitre().matricule());
        System.out.println(challenge.getLocaux().getCoach());
        System.out.println(challenge.getVisiteurs().getCoach().getPrenom());
        System.out.println(challenge.getVisiteurs());
        System.out.println(challenge.getLocaux().getClub().getAdresse());
        System.out.println(challenge.getVisiteurs().getClub().getSecretaire().getTelephone());
        System.out.println(challenge.getLocaux().getCoach().nbAnneesExperience());
    }
}
