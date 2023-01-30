public class Challenge48 {
    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;
        int finalScore = score;

        calculateScore(true, 800, levelCompleted, bonus);
        //intellij shows you the value during the call if you pass values
        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        finalScore = score;

        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }

        // Test Cases on 1500,1000,500,100,25
        displayHighScorePosition("1500", calculateHighScorePosition(1500));
        displayHighScorePosition("1000", calculateHighScorePosition(1000));
        displayHighScorePosition("500", calculateHighScorePosition(500));
        displayHighScorePosition("100", calculateHighScorePosition(100));
        displayHighScorePosition("25", calculateHighScorePosition(25));

        // Other boundary case test
        displayHighScorePosition("999", calculateHighScorePosition(999));
        displayHighScorePosition("499", calculateHighScorePosition(499));
        displayHighScorePosition("99", calculateHighScorePosition(99));
        displayHighScorePosition("-1000", calculateHighScorePosition(-1000));
    }

    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        int finalScore = score;

        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your final score was " + finalScore);
        }
    }

    public static void displayHighScorePosition(String playerName, int playerPos) {
        System.out.println(playerName + " managed to get into position " + playerPos + " on the high score list");
    }

    public static int calculateHighScorePosition(int playerScore) {
//        if (playerScore >= 1000){
//            return 1;
//        } else if (playerScore >= 500){ //redundant conditions are not required i.e. <1000
//            return 2;
//        } else if (playerScore >= 100){
//            return 3;
//        } else {
//            return 4;
//        }
        int position = 4;
        if (playerScore >= 1000) {
            position = 1;
        } else if (playerScore >= 500) { //redundant conditions are not required i.e. <1000
            position = 2;
        } else if (playerScore >= 100) {
            position = 3;
        }
            return position;
    }
}
