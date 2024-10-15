package service;

import modele.Equipe;
import modele.Match;
import modele.Tournoi;

public class GestionTournoiService {
    private Tournoi tournoi;

    public GestionTournoiService(Tournoi tournoi) {
        this.tournoi = tournoi;
    }

    public void ajouterEquipe(Equipe equipe) {
        tournoi.ajouterEquipe(equipe);
    }

    public void organiserMatch(Equipe equipe1, Equipe equipe2, String resultat) {
        Match match = new Match(equipe1, equipe2, resultat);
        tournoi.ajouterMatch(match);
    }

    public void afficherResultats() {
        for (Match match : tournoi.getMatchs()) {
            System.out.println(match);
        }
    }
}
