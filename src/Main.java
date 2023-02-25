import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        boolean finishPlay = false;
        Scanner in = new Scanner(System.in);

        do
        {
            String playerA = "";
            String playerB = "";
            String playAgain = "";
            String YNResp = "";

            boolean validA = false;
            boolean validB = false;
            boolean validYN = false;

            do // do while loop to block invalid input
            {
                System.out.print("Player A, please enter your move [R,P, or S]: "); // prompt to tell the user to enter the move for player A
                playerA = in.nextLine(); // stores input into variable playerA
                if (playerA.equalsIgnoreCase("R") || playerA.equalsIgnoreCase("P") || playerA.equalsIgnoreCase("S")) // checks to see if input is a valid move. If input is R, P, or S, the if block will run
                {
                    validA = true; // if a valid move is entered, done is true, and we do not need to loop back to the start of this block. We can move on to the next step
                } else // if anything other than a valid input is entered, the else block will run
                {
                    System.out.println("You must enter a valid move [R, P, or S]: " + playerA); // output message to tell the user to input a valid move and then echo their invalid move back to them. Program loops back to allow the user to re-input their move
                }
            } while (!validA); // if done is not true, then we need to loop back up to the top of the do block to ask the user to re-input their move

            do // do while loop to block invalid input
            {
                System.out.print("Player B, please enter your move [R,P, or S]: "); // prompt to tell the user to enter the move for player B
                playerB = in.nextLine(); // stores input into variable playerB
                if (playerB.equalsIgnoreCase("R") || playerB.equalsIgnoreCase("P") || playerB.equalsIgnoreCase("S")) // checks to see if input is a valid move. If input is R, P, or S, the if block will run
                {
                    validB = true; // if a valid move is entered, done is true, and we do not need to loop back to the start of this block. We can move on to the next step
                } else // if anything other than a valid input is entered, the else block will run
                {
                    System.out.println("You must enter a valid move [R, P, or S]: " + playerB); // output message to tell the user to input a valid move and then echo their invalid move back to them. Program loops back to allow the user to re-input their move
                }
            } while (!validB); // if done is not true, then we need to loop back up to the top of the do block to ask the user to re-input their move

            if(playerA.equalsIgnoreCase("R")) // if player A enters R...
            {
                if (playerB.equalsIgnoreCase("R")) // if A enters R and B enters R
                 {
                    System.out.println("Rock vs Rock, it's a Tie!"); // output
                }
                else if (playerB.equalsIgnoreCase("P")) // if A enters R and B enters P
                {
                    System.out.println("Paper covers Rock, Player B wins!"); // output
                }
                else // A enters R and B enters S
                {
                    System.out.println("Rock breaks Scissors, Player A wins!"); // output
                }
            }
            else if (playerA.equalsIgnoreCase("P")) // if player A enters P...
            {
                if (playerB.equalsIgnoreCase("P")) // A enters P and B enters P
                {
                    System.out.println("Paper vs Paper, it's a Tie!"); // output
                }
                else if (playerB.equalsIgnoreCase("R")) // A enters P and B enters R
                {
                    System.out.println("Paper covers Rock, Player A wins!"); // output
                }
                else // A enters P and B enters S
                {
                    System.out.println("Scissors cuts Paper, Player B wins!"); // output
                }
            }
            else // if player A enters S ...
            {
                if (playerB.equalsIgnoreCase("P")) // if A enters S and B enters P
                {
                    System.out.println("Scissors cuts Paper, Player A wins!"); // output
                }
                else if (playerB.equalsIgnoreCase("R")) // if A enters S and B enters R
                {
                    System.out.println("Rock breaks Scissors, Player B wins!"); // output
                }
                else // A enters S and B enters S
                {
                    System.out.println("Scissors vs Scissors, it's a Tie!"); // output
                }
            }

            do {
                System.out.print("Do you want to play again? [Y/N]: "); // prompt asking if user wants to play again
                playAgain = in.nextLine(); // user input is stored in playAgain
                if (playAgain.equalsIgnoreCase("Y") || playAgain.equals("N")) // if a valid response of Y or N is entered, the if block will run
                {
                    validYN = true; // a valid input was entered, so we can move to the next step and do not need to loop back and repeat the prompt/input
                    YNResp = playAgain; // since we have a valid input, we can store the input in YNResp
                }
                else // if the user enters anything other than "y" or "n" when asked if they want to play again
                {
                    System.out.println("Must enter a valid response [Y/N]: " + playAgain); // output to tell the user that their input was invalid and echo their response back
                }
            }while(!validYN); // we do not have a valid response to "do you want to play again?" so we loop back to ask the user again

                if (YNResp.equalsIgnoreCase("N")) // if the user inputs N, finishPlay will be true and the program will not loop (it will end)
                    finishPlay = true; // finishPlay is true if user enters N

        }while (!finishPlay); // if user enters "Y" when asked if they want to play again, the program will loop and the game will be replayed.


    }
}
