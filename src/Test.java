import java.util.ArrayList;


    public class Test {

        public static void main(String[] args) {
            ArrayList<Integer> playerScores = new ArrayList<>();
            playerScores.add(1);
            playerScores.add(5);
            playerScores.add(6);
            playerScores.add(7);
            playerScores.add(12);
            System.out.println("the reverse scores are: " + reverseScores(playerScores));
        }
        public static ArrayList<Integer> reverseScores (ArrayList < Integer > scoreBoard) {
            ArrayList<Integer> newArraylist = new ArrayList<>();
            for (int i = scoreBoard.size() - 1; i >= 0; i--) {
                newArraylist.add(scoreBoard.get(i));
            }

            return newArraylist;
        }
    }


