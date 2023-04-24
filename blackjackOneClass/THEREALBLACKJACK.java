import java.util.Scanner;

public class THEREALBLACKJACK extends BlackJack 
{
    public static void main (String args[]) {

        Scanner input = new Scanner(System.in);
        String again = "y";
        while (again.equalsIgnoreCase("y")) {
            theScript();
            next();
            BlackJack game = new BlackJack();
            game.theGame();
            System.out.println("");
            System.out.println("Do you want to play again? (y/n): ");
            again = input.nextLine();
            while (true) {
                if (again.equalsIgnoreCase("y") || again.equalsIgnoreCase("n")) {
                    break;
                } else {
                    System.out.print("Invalid input. Please enter y or n: ");
                    again = input.nextLine();
                }
            }
        }

    }
}

