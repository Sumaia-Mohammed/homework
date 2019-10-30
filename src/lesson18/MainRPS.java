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
        strUserG = scanner.next();

try {

    if (strUserG.equalsIgnoreCase((String) strG)) {
        throw new Ex3("same result");

    } else if (strUserG.equalsIgnoreCase(rock) && ((String) strG).equalsIgnoreCase(scissor)) {
        System.out.println("User Choices:" + strUserG);
        System.out.println("Computer Choices:" + strG);
        throw new Ex3("You win");

    } else if (strUserG.equals(scissor) && ((String) strG).equalsIgnoreCase(rock)) {
        System.out.println("You lose");
        System.out.println("User Choices:" + strUserG);
        System.out.println("Computer Choices:" + strG);
        throw new Ex3("Try Again");

    } else if (strUserG.equals(paper) && ((String) strG).equalsIgnoreCase(rock)) {
        System.out.println("User Choices:" + strUserG);
        System.out.println("Computer Choices:" + strG);
        throw new Ex3("You win");

    } else if (strUserG.equals(rock) && ((String) strG).equalsIgnoreCase(paper)) {
        System.out.println("You lose");
        System.out.println("User Choices:" + strUserG);
        System.out.println("Computer Choices:" + strG);
        throw new Ex3("Try Again");

    } else if (strUserG.equals(scissor) && ((String) strG).equalsIgnoreCase(paper)) {
        System.out.println("User Choices:" + strUserG);
        System.out.println("Computer Choices:" + strG);
        throw new Ex3("You win");

    } else if (strUserG.equals(paper) && ((String) strG).equalsIgnoreCase(scissor)) {
        System.out.println("You lose");
        System.out.println("User Choices:" + strUserG);
        System.out.println("Computer Choices:" + strG);
        throw new Ex3("Try Again");

    } else {
        System.out.println(" play again");
        System.out.println("Pick one of three Choice  (Format:  Rock, Paper, Scissor)");

    }
}catch (Ex3 e){
    System.out.println(e.getMessage());

}

    }
}
