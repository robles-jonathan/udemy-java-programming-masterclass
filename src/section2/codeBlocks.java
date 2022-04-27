package section2;

public class codeBlocks {
    public static void main(String[] args) {
        //Hard coded variables
        calculateScore(true, 800, 5, 100);
        calculateScore(true, 10000, 8, 200); 

        // Variables
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        calculateScore(gameOver, score, levelCompleted, bonus);

        gameOver = true;
        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        calculateScore(gameOver, score, levelCompleted, bonus);
    }

    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if(gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            System.out.println("your final score is " + finalScore);
        }
    }
    
}

