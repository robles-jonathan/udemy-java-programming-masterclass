package section2;

public class codeBlocks {
    public static void main(String[] args) {


        // Hard coded variables
        calculateScore(true, 800, 5, 100);
        calculateScore(true, 10000, 8, 200);

        // Variables
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("your final score is " + highScore);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("your final score is " + highScore);

        displayHighScorePosition("Arron Johnson", calculateHighScorePosition(1000));
        displayHighScorePosition("Adam Sandler", calculateHighScorePosition(500));
        displayHighScorePosition("Garth Brooks", calculateHighScorePosition(100));
        displayHighScorePosition("Eli Manning", calculateHighScorePosition(50));

    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        }
        return -1;
    }

    public static void displayHighScorePosition(String name, int postition){
        System.out.println(name + " managed to get into position " + postition + " on the high score table.");
    }

    public static int calculateHighScorePosition(int score){
        if(score >= 1000){
            return 1;
        } else if(score >= 500){
            return 2;
        } else if(score >= 100){
            return 3;
        } else{
            return 4;
        }
    }

}
