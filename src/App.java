
// import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.Math;

public class App {
    static Compteurs compteur = new Compteurs();

    public static void main(String[] args) throws Exception {
        // int adversaire = 2;
        while (compteur.nb_partie < compteur.max_partie) {
            game();
        }
        int winner = Math.max(compteur.score_player, compteur.score_adversaire);
        if (compteur.score_player == winner) {
            System.out.println("Vous avez gagner félicitation");
        }
        if (compteur.score_adversaire == winner) {
            System.out.println("Vous avez perdue la prochaine fois sera la bonne");
        }
    }

    public static void rules(int player, int adversaire, int pierre, int feuille, int ciseau, int lezard, int spock)
            throws IOException {
        if (player == pierre) {
            if (adversaire == pierre) {
                System.out.println("Player : pierre");
                System.out.println("Adversaire : pierre");
                System.out.println("Egalité avec la pierre veuillez recommencer");
                System.out
                        .println("Player " + compteur.score_player + " - " + compteur.score_adversaire + " Adversaire");
                game();
            }
            if (adversaire == feuille) {
                System.out.println("Player : pierre");
                System.out.println("Adversaire : feuille");
                System.out.println("Le papier recouvre la pierre et le neutralise");
                compteur.incrementAdversaire();
                compteur.incrementPartie();
                System.out.println("*** SCORE ***");
                System.out
                        .println("Player " + compteur.score_player + " - " + compteur.score_adversaire + " Adversaire");
            }
            if (adversaire == ciseau) {
                System.out.println("Player : pierre");
                System.out.println("Adversaire : ciseau");
                System.out.println("La pierre écrase les ciseaux");
                compteur.incrementPlayer();
                compteur.incrementPartie();
                System.out
                        .println("Player " + compteur.score_player + " - " + compteur.score_adversaire + " Adversaire");
            }
            if (adversaire == lezard) {
                System.out.println("Player : pierre");
                System.out.println("Adversaire : lézard");
                System.out.println("La pierre écrase le lézard");
                compteur.incrementPlayer();
                compteur.incrementPartie();
                System.out
                        .println("Player " + compteur.score_player + " - " + compteur.score_adversaire + " Adversaire");
            }
            if (adversaire == spock) {
                System.out.println("Player : pierre");
                System.out.println("Adversaire : Spock");
                System.out.println("Spock vaporise la pierre");
                compteur.incrementAdversaire();
                compteur.incrementPartie();
                System.out
                        .println("Player " + compteur.score_player + " - " + compteur.score_adversaire + " Adversaire");
            }
        }
        if (player == feuille) {
            if (adversaire == pierre) {
                System.out.println("Player : feuille");
                System.out.println("Adversaire : pierre");
                System.out.println("Le papier recouvre la pierre et le neutralise");
                compteur.incrementPlayer();
                compteur.incrementPartie();
                System.out
                        .println("Player " + compteur.score_player + " - " + compteur.score_adversaire + " Adversaire");
            }
            if (adversaire == feuille) {
                System.out.println("Player : feuille");
                System.out.println("Adversaire : feuille");
                System.out.println("Egalité avec la feuille veuillez recommencer");
                System.out
                        .println("Player " + compteur.score_player + " - " + compteur.score_adversaire + " Adversaire");
                game();
            }
            if (adversaire == ciseau) {
                System.out.println("Player : feuille");
                System.out.println("Adversaire : ciseau");
                System.out.println("Les ciseaux coupent le papier");
                compteur.incrementAdversaire();
                compteur.incrementPartie();
                System.out
                        .println("Player " + compteur.score_player + " - " + compteur.score_adversaire + " Adversaire");
            }
            if (adversaire == lezard) {
                System.out.println("Player : feuille");
                System.out.println("Adversaire : lézard");
                System.out.println("Le lézard mange le papier");
                compteur.incrementAdversaire();
                compteur.incrementPartie();
                System.out
                        .println("Player " + compteur.score_player + " - " + compteur.score_adversaire + " Adversaire");
            }
            if (adversaire == spock) {
                System.out.println("Player : feuille");
                System.out.println("Adversaire : Spock");
                System.out.println("Le papier réfute Spock");
                compteur.incrementPlayer();
                compteur.incrementPartie();
                System.out
                        .println("Player " + compteur.score_player + " - " + compteur.score_adversaire + " Adversaire");
            }
        }
        if (player == ciseau) {
            if (adversaire == pierre) {
                System.out.println("Player : ciseau");
                System.out.println("Adversaire : pierre");
                System.out.println("La pierre écrase les ciseaux");
                compteur.incrementAdversaire();
                compteur.incrementPartie();
                System.out
                        .println("Player " + compteur.score_player + " - " + compteur.score_adversaire + " Adversaire");
            }
            if (adversaire == feuille) {
                System.out.println("Player : ciseau");
                System.out.println("Adversaire : feuille");
                System.out.println("Les ciseaux coupent le papier");
                compteur.incrementPlayer();
                compteur.incrementPartie();
                System.out
                        .println("Player " + compteur.score_player + " - " + compteur.score_adversaire + " Adversaire");
            }
            if (adversaire == ciseau) {
                System.out.println("Player : ciseau");
                System.out.println("Adversaire : ciseau");
                System.out.println("Egalité avec le ciseau veuillez recommencer");
                System.out
                        .println("Player " + compteur.score_player + " - " + compteur.score_adversaire + " Adversaire");
                game();
            }
            if (adversaire == lezard) {
                System.out.println("Player : ciseau");
                System.out.println("Adversaire : lézard");
                System.out.println("Les ciseaux décapitent le lézard");
                compteur.incrementPlayer();
                compteur.incrementPartie();
                System.out
                        .println("Player " + compteur.score_player + " - " + compteur.score_adversaire + " Adversaire");
            }
            if (adversaire == spock) {
                System.out.println("Player : ciseau");
                System.out.println("Adversaire : Spock");
                System.out.println("Spock casse les ciseaux");
                compteur.incrementAdversaire();
                compteur.incrementPartie();
                System.out
                        .println("Player " + compteur.score_player + " - " + compteur.score_adversaire + " Adversaire");
            }
        }
        if (player == lezard) {
            if (adversaire == pierre) {
                System.out.println("Player : lézard");
                System.out.println("Adversaire : pierre");
                System.out.println("La pierre écrase le lézard");
                compteur.incrementAdversaire();
                compteur.incrementPartie();
                System.out
                        .println("Player " + compteur.score_player + " - " + compteur.score_adversaire + " Adversaire");
            }
            if (adversaire == feuille) {
                System.out.println("Player : lézard");
                System.out.println("Adversaire : feuille");
                System.out.println("Le lézard mange le papier");
                compteur.incrementPlayer();
                compteur.incrementPartie();
                System.out
                        .println("Player " + compteur.score_player + " - " + compteur.score_adversaire + " Adversaire");
            }
            if (adversaire == ciseau) {
                System.out.println("Player : lézard");
                System.out.println("Adversaire : ciseau");
                System.out.println("Les ciseaux décapitent le lézard");
                compteur.incrementAdversaire();
                compteur.incrementPartie();
                System.out
                        .println("Player " + compteur.score_player + " - " + compteur.score_adversaire + " Adversaire");
            }
            if (adversaire == lezard) {
                System.out.println("Player : lézard");
                System.out.println("Adversaire : lézard");
                System.out.println("Egalité avec le lézard veuillez recommencer");
                System.out
                        .println("Player " + compteur.score_player + " - " + compteur.score_adversaire + " Adversaire");
                game();
            }
            if (adversaire == spock) {
                System.out.println("Player : lézard");
                System.out.println("Adversaire : Spock");
                System.out.println("Le lézard empoisonne Spock");
                compteur.incrementPlayer();
                compteur.incrementPartie();
                System.out
                        .println("Player " + compteur.score_player + " - " + compteur.score_adversaire + " Adversaire");
            }
        }
        if (player == spock) {
            if (adversaire == pierre) {
                System.out.println("Player : Spock");
                System.out.println("Adversaire : pierre");
                System.out.println("Spock vaporise la pierre");
                compteur.incrementPlayer();
                compteur.incrementPartie();
                System.out
                        .println("Player " + compteur.score_player + " - " + compteur.score_adversaire + " Adversaire");
            }
            if (adversaire == feuille) {
                System.out.println("Player : Spock");
                System.out.println("Adversaire : feuille");
                System.out.println("Le papier réfute Spock");
                compteur.incrementAdversaire();
                compteur.incrementPartie();
                System.out
                        .println("Player " + compteur.score_player + " - " + compteur.score_adversaire + " Adversaire");
            }
            if (adversaire == ciseau) {
                System.out.println("Player : Spock");
                System.out.println("Adversaire : ciseau");
                System.out.println("Spock casse les ciseaux");
                compteur.incrementPlayer();
                compteur.incrementPartie();
                System.out
                        .println("Player " + compteur.score_player + " - " + compteur.score_adversaire + " Adversaire");
            }
            if (adversaire == lezard) {
                System.out.println("Player : Spock");
                System.out.println("Adversaire : lézard");
                System.out.println("Le lézard empoisonne Spock");
                compteur.incrementAdversaire();
                compteur.incrementPartie();
                System.out
                        .println("Player " + compteur.score_player + " - " + compteur.score_adversaire + " Adversaire");
            }
            if (adversaire == spock) {
                System.out.println("Player : Spock");
                System.out.println("Adversaire : Spock");
                System.out.println("Egalité avec Spock veuillez recommencer");
                System.out
                        .println("Player " + compteur.score_player + " - " + compteur.score_adversaire + " Adversaire");
                game();
            }
        }
    }

    public static void game() throws IOException {
        int pierre = 0;
        int feuille = 1;
        int ciseau = 2;
        int lezard = 3;
        int spock = 4;
        int adversaire = (int) (Math.random() * 5);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Légende :");
        System.out.println(pierre + " pour la pierre (par défaut)");
        System.out.println(feuille + " pour la feuille");
        System.out.println(ciseau + " pour le ciseau");
        System.out.println(lezard + " pour la lézard");
        System.out.println(spock + " pour le Spock");
        System.out.println(" ");
        System.out.print("Choissiser votre main : ");

        int player = Integer.parseInt(reader.readLine());
        rules(player, adversaire, pierre, feuille, ciseau, lezard, spock);
    }
}