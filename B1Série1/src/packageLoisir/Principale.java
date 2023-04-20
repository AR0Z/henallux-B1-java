package packageLoisir;

public class Principale {
    public static void main(String[] args) {
        BilletSpectacle spectale1 = new BilletSpectacle("Test1", "07-02-22", 'A', 5, true);
        System.out.println(spectale1.prixBillet());
        System.out.println(spectale1.descriptionBillet());

        BilletSpectacle spectale2 = new BilletSpectacle("Test2", "07-02-22", 'A', 5, false);
        System.out.println(spectale2.prixBillet());
        System.out.println(spectale2.descriptionBillet());

        BilletSpectacle spectale3 = new BilletSpectacle("Test3", "07-02-22", 'C', 5, true);
        System.out.println(spectale3.prixBillet());
        System.out.println(spectale3.descriptionBillet());

        BilletSpectacle spectale4 = new BilletSpectacle("Test4", "07-02-22", 'C', 5, false);
        System.out.println(spectale4.prixBillet());
        System.out.println(spectale4.descriptionBillet());

        SejourDisney disney1 = new SejourDisney(2, 1, 5, 1, true);
        System.out.println(disney1.resumeSejour());
        if(disney1.estLongSejour()){
            System.out.println("Vous avez droit à un bon de réduction de 20% sur votre prochain séjour !");
        }else{
            System.out.println("Merci d’avoir choisi un séjour chez Disney!");
        }
    }
}
