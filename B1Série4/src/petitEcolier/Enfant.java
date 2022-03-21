package petitEcolier;

public class Enfant {
    private String prenom;
    private String nom;
    private int age;

    public Enfant(String prenom, String nom, int age) {
        this.prenom = prenom;
        this.nom = nom;
        setAge(age);
    }

    public void setAge(int age) {
        if(age > 12){
            this.age = 12;
        }else if(age < 1){
            this.age = 1;
        }else{
            this.age = age;
        }
    }

    public String getPrenom() {
        return prenom;
    }

    public int getAge() {
        return age;
    }

    public String toString() {
        return "L'enfant " + prenom + " " + nom + (age == 1 ? " d'un an" : " de " + age + " ans");
    }
}
