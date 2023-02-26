package methodOverloading;

public class MethodOverloading {

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed player scored " + score + " points");
        return score * 10;
    }

    public static int calculateScore() {
        System.out.println("No player named, No points scored");
        return 0;
    }

    public static void main(String[] args) {

        int newScore  = calculateScore("Tim",500);
        System.out.println("New score is " + newScore);

        int unnamedScore = calculateScore(75);
        System.out.println("New score of unnamed player is " + unnamedScore);

        calculateScore();

    }
}
