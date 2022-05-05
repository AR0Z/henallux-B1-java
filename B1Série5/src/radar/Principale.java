package radar;

public class Principale {
    public static void main(String[] args) {
        ExcesVitesse excès1 = new ExcesVitesse("Arlon", 30, 80);
        ExcesVitesse excès2 = new ExcesVitesse("Arlon", -50, 150);
        ExcesVitesse excès3 = new ExcesVitesse("Arlon", 120, 410);

        System.out.println(excès1);
        System.out.println(excès2);
        System.out.println(excès3);

        Chauffard descampette = new Chauffard("Thérence", "Descampette", "rue de descampette");

        descampette.ajouterExcesVitesse(excès1);
        descampette.ajouterExcesVitesse(excès2);
        descampette.ajouterExcesVitesse(excès3);

        System.out.println(descampette.totalAmendes());

        System.out.println(descampette.depassementMaximal());

        System.out.println(descampette.dossierExcesVitesse());

        System.out.println(ExcesVitesse.getMaxVitesseAuFlash() + " " + ExcesVitesse.getLocaliteMaxVitesseAuFlash());
    }
}
