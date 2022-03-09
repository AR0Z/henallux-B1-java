package business;

public class Achat {

    private Client client;
    private Article article;
    private int nbExemplaires;

    public Achat(Client client, Article article, int nbExemplaires){
        this.client = client;
        this.article = article;
        setNbExemplaires(nbExemplaires);
    }

    public Achat(Client client, Article article){
        this(client, article, 1);
    }

    public void setNbExemplaires(int nbExemplaires) {
        if(nbExemplaires >= 0){
            this.nbExemplaires = nbExemplaires;
        }else{
            this.nbExemplaires = 1;
        }
    }

    public double coutTotal(){
        return nbExemplaires * article.getPrix();
    }

    public int getNbExemplaires() {
        return nbExemplaires;
    }

    public Client getClient() {
        return client;
    }

    public Article getArticle() {
        return article;
    }

    public String toString() {
        String text;
        if(nbExemplaires == 1){
            text = "Le client " + client.toString() + " a acheté l’article " + article.toString()  + " en un seul exemplaire pour un montant total de " + this.coutTotal() + (this.coutTotal() >= 2 ? " euros" : " euro");
        }else{
            text = "Le client " + client.toString() + " a acheté l’article " + article.toString()  + " en " + this.nbExemplaires + " exemplaires pour un montant total de " + this.coutTotal() + (this.coutTotal() >= 2 ? " euros" : " euro");
        }
        return text;
    }
}
