package business;

public class Principale {
    public static void main(String[] args) {
        Client premierClient = new Client("Germain","Duchêne");
        Client secondClient = new Client("Thérence", "Guerenne-Courtois");
        Article premierArticle = new Article("stylot", 1.99);

        Achat premierAchat = new Achat(secondClient, premierArticle, 10);
        Achat secondAchat = new Achat(premierClient, premierArticle);
        Achat troisiemeAchat  = new Achat(premierClient, premierArticle, 20);

        System.out.println(premierAchat.coutTotal());
        System.out.println(premierAchat.getNbExemplaires());
        System.out.println(premierAchat.getClient());
        System.out.println(premierAchat.getArticle());

        System.out.println(premierAchat);

        System.out.println(secondAchat);

        System.out.println(troisiemeAchat);
    }
}
