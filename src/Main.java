import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	String playerA = "";
	String playerB = "";
	String playAgain = "Y";

	Scanner in = new Scanner(System.in);

        System.out.print("Player A, please enter your move (R,P, or S): ");
        playerA = in.nextLine();

        System.out.print("Player B, please enter your move (R,P, or S): ");
        playerB = in.nextLine();

        if(playerA.equalsIgnoreCase("R"))
        {
            if (playerB.equalsIgnoreCase("R"))
            {
                System.out.println("Rock vs Rock, it's a Tie!");
            }
            else if (playerB.equalsIgnoreCase("P"))
            {
                System.out.println("Paper covers Rock, Player B wins!");
            }
            else // playerB equals S
            {
                System.out.println("Rock breaks Scissors, Player A wins!");
            }
        }
        else if (playerA.equalsIgnoreCase("P"))
        {
            if (playerB.equalsIgnoreCase("P"))
            {
                System.out.println("Paper vs Paper, it's a Tie!");
            }
            else if (playerB.equalsIgnoreCase("R"))
            {
                System.out.println("Paper covers Rock, Player A wins!");
            }
            else // playerB equals S
            {
                System.out.println("Scissors cuts Paper, Player B wins!");
            }
        }
        else // player A equals S
        {
            if (playerB.equalsIgnoreCase("P"))
            {
                System.out.println("Scissors cuts Paper, Player A wins!");
            }
            else if (playerB.equalsIgnoreCase("R"))
            {
                System.out.println("Rock breaks Scissors, Player B wins!");
            }
            else // player B equals S
            {
                System.out.println("Scissors vs Scissors, it's a Tie!");
            }
        }
    }
}
