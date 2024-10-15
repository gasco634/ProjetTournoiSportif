package modele;

public class Joueur {
    private String nom;
    private int age;
    private Equipe equipe;

    public Joueur(String nom, int age, Equipe equipe) {
        this.nom = nom;
        this.age = age;
        this.equipe = equipe;
    }

    public String getNom() {
        return nom;
    }

    public int getAge() {
        return age;
    }

    public Equipe getEquipe() {
        return equipe;
    }

    @Override
    public String toString() {
        return "Joueur{nom='" + nom + "', age=" + age + ", equipe=" + equipe.getNom() + "}";
    }
}
