package modele;

public class Match {
    private Equipe equipe1;
    private Equipe equipe2;
    private String resultat;

    public Match(Equipe equipe1, Equipe equipe2, String resultat) {
        this.equipe1 = equipe1;
        this.equipe2 = equipe2;
        this.resultat = resultat;
    }

    public Equipe getEquipe1() {
        return equipe1;
    }

    public Equipe getEquipe2() {
        return equipe2;
    }

    public String getResultat() {
        return resultat;
    }

    @Override
    public String toString() {
        return "Match{equipe1=" + equipe1.getNom() + ", equipe2=" + equipe2.getNom() + ", resultat='" + resultat + "'}";
    }
}
