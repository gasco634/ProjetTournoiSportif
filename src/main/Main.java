package main;

import modele.Equipe;
import modele.Joueur;
import modele.Tournoi;
import service.SauvegardeService;
import vue.ConsoleVue;

public class Main {
    public static void main(String[] args) {
        // Création d'un nouveau tournoi
        Tournoi tournoi = new Tournoi("Coupe du Monde");

        // Création des équipes
        Equipe equipeA = new Equipe("Equipe A");
        Equipe equipeB = new Equipe("Equipe B");

        // Ajout des joueurs aux équipes
        equipeA.ajouterJoueur(new Joueur("Joueur 1", 25, equipeA));
        equipeA.ajouterJoueur(new Joueur("Joueur 2", 28, equipeA));

        equipeB.ajouterJoueur(new Joueur("Joueur 3", 24, equipeB));
        equipeB.ajouterJoueur(new Joueur("Joueur 4", 30, equipeB));

        // Ajout des équipes au tournoi
        GestionTournoiService gestionTournoi = new GestionTournoiService();
        gestionTournoi.ajouterEquipe(equipeA);
        gestionTournoi.ajouterEquipe(equipeB);

        // Organisation d'un match
        gestionTournoi.organiserMatch(equipeA, equipeB, "2-1");

        // Affichage des résultats dans la console
        ConsoleVue vue = new ConsoleVue();
        vue.afficherTournoi(tournoi);

        // Sauvegarde des résultats du tournoi dans un fichier
        SauvegardeService sauvegarde = new SauvegardeService();
        sauvegarde.sauvegarderTournoi(tournoi);
    }
}
