import java.util.Scanner;
import java.util.InputMismatchException;
public class Game {
    static boolean tro = true;
    static int moveOn; 
    public static void main (String args[]) {
        theScript();
        next();
        startTheGame();
    }

    public static void startTheGame() { 
        Scanner scanner = new Scanner(System.in);
        String nextLine = scanner.nextLine();
        while (tro) {
            try {
                if (nextLine == "Play") {
                    System.out.print("\033[H\033[2J");
                } else {
                    if (nextLine == "Exit") {
                        break;
                    }
                }
            } catch (InputMismatchException error) {
                System.out.println("Please enter Play or Exit");
            }
        }
    }

    public static void next() {
        System.out.println("Please enter Play to start playing the game");
        System.out.println("You can leave the game by typing Exit");
        System.out.println("Have Fun!"); 
    }

    public static void theScript() {
        System.out.println ("Welcome to Cpu BlackJack");
        System.out.println ("Here are the rules"); 
        System.out.println ("You and the cpu will be dealt 2 cards from the follow list");
        System.out.println ("Ace = 1");
        System.out.println ("Two = 2");
        System.out.println ("Three = 3");
        System.out.println ("Four = 4");
        System.out.println ("Five = 5");     
        System.out.println ("Six = 6");
        System.out.println ("Seven = 7");
        System.out.println ("Eight = 8");
        System.out.println ("Nine = 9");
        System.out.println ("Ten = 10");
        System.out.println ("Jack = 10");     
        System.out.println ("Queen = 10");
        System.out.println ("King = 10");
        System.out.println ("Each card correlates with a certain value as shown above");
        System.out.println ("The goal of this game is to reach 21 with the values of the cards");
        System.out.println ("When it is your turn, you will be able to hit or fold");
        System.out.println ("When you hit, the dealer will give you another random card");
        System.out.println ("If you hit and get over the value of 21, you bust, meaning that you are out");
        System.out.println ("When you fold, you do not get a card, and you stay with that value until everyone has finished their turns");
        System.out.println ("The goal of the game is to hit 21, or be the the closest to 21");
        System.out.println ("There will be five rounds, good luck!");
    }
}


