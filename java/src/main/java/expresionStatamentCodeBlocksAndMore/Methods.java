package expresionStatamentCodeBlocksAndMore;

public class Methods {

    public static void main(String[] args) {

        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        calculateScore(true, score, levelCompleted, bonus);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        calculateScore(true, score, levelCompleted, bonus);

        displayHighScorePosition("1", 1500);
        displayHighScorePosition("2", 900);
        displayHighScorePosition("3", 400);
        displayHighScorePosition("4", 50);
    }

    private static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score is " + finalScore);
        }
    }

    private static void displayHighScorePosition(String playerName, int score) {
        int position = calculateHighScorePosition(score);
        System.out.println(playerName + " managed to get into position " + position);
    }

    private static int calculateHighScorePosition(int score) {
        if (score >= 1000) {
            return 1;
        } else if (score >= 500) {
            return 2;
        } else if (score >= 100) {
            return 3;
        }
        return 4;
    }
}
