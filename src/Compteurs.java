// class qui va perttre de compter les scores et partie
public class Compteurs {
    int maxPartie = 6;
    int nbPartie = 0;
    int scorePlayer = 0;
    int scoreAdversaire = 0;

    // méthode de type integer va permettre d'incrémenter le nombre de la partie
    public int incrementPartie() {
        return this.nbPartie += 1; // incremente le nombre de partie
    }

    // méthode de type integer va permettre d'incrémenter le score du joueur
    public int incrementPlayer() {
        return this.scorePlayer += 1; // incremente le score du joueur
    }

    // méthode de type integer va permettre d'incrémenter le score de l'adversaire
    public int incrementAdversaire() {
        return this.scoreAdversaire += 1; // incremente le score de l'adersaire
    }
}
