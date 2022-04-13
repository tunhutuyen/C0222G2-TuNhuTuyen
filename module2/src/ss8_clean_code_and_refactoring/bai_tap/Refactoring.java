package ss8_clean_code_and_refactoring.bai_tap;

public class Refactoring {
    public static String getScore(String playerFirst, String playerSecond, int scoreOfPlayerFirst, int scoreOfPlayerSecond) {
        StringBuilder score = new StringBuilder();
        int tempScore;
        if (scoreOfPlayerFirst == scoreOfPlayerSecond) {
            switch (scoreOfPlayerFirst) {
                case 0:
                    score = new StringBuilder("Love-All");
                    break;
                case 1:
                    score = new StringBuilder("Fifteen-All");
                    break;
                case 2:
                    score = new StringBuilder("Thirty-All");
                    break;
                case 3:
                    score = new StringBuilder("Forty-All");
                    break;
                default:
                    score = new StringBuilder("Deuce");
                    break;

            }
        } else if (scoreOfPlayerFirst >= 4 || scoreOfPlayerSecond >= 4) {
            int minusResult = scoreOfPlayerFirst - scoreOfPlayerSecond;
            if (minusResult == 1) {
                score = new StringBuilder("Advantage player1:" + playerFirst);
            }else if (minusResult == -1) {
                score = new StringBuilder("Advantage player2: " + playerSecond);
            }else if (minusResult >= 2) {
                score = new StringBuilder("Win for " + playerFirst);
            }else {
                score = new StringBuilder("Win for " + playerSecond);}
        } else {
            for (int i = 1; i < 3; i++) {
                if (i == 1) tempScore = scoreOfPlayerFirst;
                else {
                    score.append("-");
                    tempScore = scoreOfPlayerSecond;
                }
                switch (tempScore) {
                    case 0:
                        return  "Love";
                    case 1:
                        return "Fifteen";
                    case 2:
                        return "Thirty";
                    case 3:
                        return "Forty";

                }
            }
        }
        return score.toString();
    }

    public static void main(String[] args) {
        System.out.println(getScore("a1","b1",1,1));
    }
}
