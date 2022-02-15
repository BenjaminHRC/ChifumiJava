// class qui va perttre de compter les scores et partie
public class Compteurs {
    int max_partie = 5;
    int nb_partie = 0;
    int score_player = 0;
    int score_adversaire = 0;

    // méthode de type integer va permettre d'incrémenter le nombre de la partie
    public int incrementPartie() {
        return this.nb_partie += 1; // incremente le nombre de partie
    }

    // méthode de type integer va permettre d'incrémenter le score du joueur
    public int incrementPlayer() {
        return this.score_player += 1; // incremente le score du joueur
    }

    // méthode de type integer va permettre d'incrémenter le score de l'adversaire
    public int incrementAdversaire() {
        return this.score_adversaire += 1; // incremente le score de l'adersaire
    }
}
