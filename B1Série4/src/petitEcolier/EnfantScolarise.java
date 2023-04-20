package petitEcolier;

public class EnfantScolarise extends Enfant {

    private boolean estEnPrimaire;
    private boolean vaEnGarderie;
    private Ecole ecole;
    private boolean mangeALaCantine;

    public EnfantScolarise(String prenom, String nom, int age, Ecole ecole, boolean estEnPrimaire, boolean vaEnGarderie, boolean mangeALaCantine) {
        super(prenom, nom, age);

        this.ecole = ecole;
        this.estEnPrimaire = estEnPrimaire;
        this.vaEnGarderie = vaEnGarderie;
        this.mangeALaCantine = mangeALaCantine;
    }
    public boolean estEnAvance(){
        return getAge() < 6 && estEnPrimaire;
    }

    public String toString() {
        return super.toString() + "\nest scolarisé en " + (estEnPrimaire ? "primaire" : "maternelle") + " à " + ecole + "\n" + getPrenom() + (vaEnGarderie ? "va à la garderie" : "ne va pas à la garderie") + " et " + (mangeALaCantine ? "mange à la cantine" : "ne mange pas à la cantine") + ".";
    }
}
