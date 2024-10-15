package service;

import modele.Tournoi;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class SauvegardeService {

    public void sauvegarderTournoi(Tournoi tournoi) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("tournoi.txt"))) {
            writer.write(tournoi.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

