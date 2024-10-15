package modele;

import java.util.ArrayList;
import java.util.List;

public class Equipe {
    private String nom;
    private List<Joueur> joueurs;

    public Equipe(String nom) {
        this.nom = nom;
        this.joueurs = new ArrayList<>();
    }

    public String getNom() {
        return nom;
    }

    public void ajouterJoueur(Joueur joueur) {
        joueurs.add(joueur);
    }

    public List<Joueur> getJoueurs() {
        return joueurs;
    }

    @Override
    public String toString() {
        return "Equipe{nom='" + nom + "', joueurs=" + joueurs + "}";
    }
}
