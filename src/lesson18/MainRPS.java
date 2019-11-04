package lesson18;

import java.util.Scanner;

public class MainRPS {
    public static void main(String[] args) throws Ex3 {
        Scanner scanner = new Scanner(System.in);
        String paper = "p";
        String scissor = "s";
        String rock = "r";

        System.out.println("Winning Rules of the Rock paper scissor game as follows: \n"
                + "Rock beats Scissor \n"
                + "Scissor beats Paper \n"
                + "Paper beats Rock ");

        Object strG;
        String strUserG;
        String[] game = {"R", "P", "S"};
        strG = Ex3.get(game);

        System.out.println("Enter choice \n R= Rock \n P= paper \n S= scissor \n");

        int point = 0;
        int remaining =5 ;
        try {


            while (remaining>0){

                strUserG = scanner.next();

                if (strUserG.equals("skip")) {
               point--;
               remaining--;
         }
          else if (strUserG.length() > 1) {
                throw new Ex3("Please type one letter!!");

        } else if (strUserG.equalsIgnoreCase((String)strG)) {
              System.out.println("same result");
                remaining--;

        } else if (strUserG.equalsIgnoreCase(rock) && ((String) strG).equalsIgnoreCase(scissor)) { System.out.println("User Choices:" + strUserG);
              System.out.println("Computer Choices:" + strG);
              System.out.println("You win");
                point++;
                remaining--;

        } else if (strUserG.equals(scissor) && ((String) strG).equalsIgnoreCase(rock)) {
              System.out.println("Try Again");
              System.out.println("User Choices:" + strUserG);
              System.out.println("Computer Choices:" + strG);
              System.out.println("You lose");
               point--;
               remaining--;

        } else if (strUserG.equals(paper) && ((String) strG).equalsIgnoreCase(rock)) {
              System.out.println("User Choices:" + strUserG);
              System.out.println("Computer Choices:" + strG);
              System.out.println("You win");
               point++;
               remaining--;

        } else if (strUserG.equals(rock) && ((String) strG).equalsIgnoreCase(paper)) {
              System.out.println("Try Again");
              System.out.println("User Choices:" + strUserG);
              System.out.println("Computer Choices:" + strG);
              System.out.println("You lose");
                point--;
                remaining--;

        } else if (strUserG.equals(scissor) && ((String) strG).equalsIgnoreCase(paper)) {
              System.out.println("User Choices:" + strUserG);
              System.out.println("Computer Choices:" + strG);
              System.out.println("You win");
                point++;
                remaining--;

        } else if (strUserG.equals(paper) && ((String) strG).equalsIgnoreCase(scissor)) {
              System.out.println("User Choices:" + strUserG);
              System.out.println("Computer Choices:" + strG);
              System.out.println("Try Again");
              System.out.println("You lose");
                point--;
                remaining--;

        } else {
              System.out.println(" play again");
              System.out.println("Pick one of three Choice  (Format:  Rock, Paper, Scissor)");
        }

             System.out.println("\tYou got: " +point);
             System.out.println("\tTurns Remaining: " +remaining);

                System.out.println("\tFinal result: ");

             if (remaining==0){
               System.out.println("Game over");
             }
        }

      }catch (Ex3 e){
         System.out.println(e.getMessage());

      }

    }
}
