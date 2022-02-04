public class Compteurs {
    int max_partie = 5;
    int nb_partie = 0;
    int score_player = 0;
    int score_adversaire = 0;

    public int incrementPartie() {
        return this.nb_partie += 1;
    }

    public int incrementPlayer() {
        return this.score_player += 1;
    }

    public int incrementAdversaire() {
        return this.score_adversaire += 1;
    }
}
