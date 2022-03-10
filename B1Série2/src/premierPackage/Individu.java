package premierPackage;

public class Individu {

    private String prenom;
    private int age;
    private char genre;
    private String localite;

    public Individu(String prenom, int age, char genre, String localite){
        setPrenom(prenom);
        setAge(age);
        setGenre(genre);
        setLocalite(localite);
    }


    public String presentation(){
        return presentation(1);
    }

    public String presentation(int choix){
        String presentation;
        switch (choix){
            case 2 : presentation = "My firstname is " + prenom + " and I am " + age + " years old. \nI live in " + localite + ".";
                break;
            case 3 : presentation = "Ik heet " + prenom + " en ik ben " + age + ". \nIk woon in " + localite + ".";
                break;
            default: presentation = "Je m’appelle " + prenom + " et je suis âgé(e) de " + age + " an(s). \nJe réside à " + localite + ".";
                break;
        }
        return presentation;
    }

    //getMethode
    public String getPrenom(){
        return prenom;
    }
    public char getGenre(){
        return genre;
    }
    public int getAge(){
        return age;
    }
    //setMethode
    public void setPrenom(String prenom){
        this.prenom = prenom;
    }
    public void setAge(int age){
        if (0 < age && age <= 120){
            this.age = age;
        }else{
            if(this.age == Integer.MIN_VALUE){
                this.age = 1;
            }
        }
    }
    public void setGenre(char genre){
        if (genre == 'M' || genre == 'F' || genre == 'X'){
            this.genre = genre;
        }else{
            if(this.genre == Character.MIN_VALUE){
                this.genre = 'X';
            }
        }
    }
    public void setLocalite(String localite){
        this.localite = localite;
    }
}