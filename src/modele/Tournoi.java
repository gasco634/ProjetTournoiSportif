package modele;

import java.util.ArrayList;
import java.util.List;

public class Tournoi {
    private String nom;
    private List<Equipe> equipes;
    private List<Match> matchs;

    public Tournoi(String nom) {
        this.nom = nom;
        this.equipes = new ArrayList<>();
        this.matchs = new ArrayList<>();
    }

    public void ajouterEquipe(Equipe equipe) {
        equipes.add(equipe);
    }

    public void ajouterMatch(Match match) {
        matchs.add(match);
    }

    public List<Equipe> getEquipes() {
        return equipes;
    }

    public List<Match> getMatchs() {
        return matchs;
    }

    @Override
    public String toString() {
        return "Tournoi{nom='" + nom + "', equipes=" + equipes + ", matchs=" + matchs + "}";
    }
}
