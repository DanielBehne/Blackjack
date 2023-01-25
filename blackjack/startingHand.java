import java.util.Random;
import java.util.ArrayList;
import java.util.Scanner;
public class startingHand {
    public int playerValue;
    public int dealerValue;
    private ArrayList<Integer> playerPreviousCards = new ArrayList<Integer>();
    private ArrayList<Integer> dealerPreviousCards = new ArrayList<Integer>();
    public static int playerTotal;
    public static int dealerTotal;

    private String[] suit = {"Spades", "Clubs", "Hearts", "Diamonds"};
    private String[] tens = {"10", "Jack", "Queen", "King"};
    public void getCard() {
        for(int i=1; i<=2; i++) {
            int playerValue = (int) (Math.random() * 10) + 1;
            if (playerValue == 1) {
                Random random1 = new Random();
                System.out.println(("Ace") + (" of ") + suit[random1.nextInt(suit.length)]);
                System.out.println("You have been dealt a " + (playerValue));
            } else if (playerValue == 10) {
                Random random3 = new Random();
                System.out.println(tens[random3.nextInt(tens.length)] + (" of ") + suit[random3.nextInt(suit.length)]);
                System.out.println("You have been dealt a " + (playerValue));
            } else {
                Random random2 = new Random();
                System.out.println((playerValue) + (" of ") + suit[random2.nextInt(suit.length)]);
                System.out.println("You have been dealt a " + (playerValue));
            } 
            if (!playerPreviousCards.contains(playerValue)) {
                playerPreviousCards.add(playerValue);
            }
            playerPreviousCards.add(playerValue);
        }

        for (int v : playerPreviousCards) {
            playerTotal += v;
        }
        System.out.println("The total value of your hand is " + (playerTotal)/2);
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");

        
        for(int i=1; i<=2; i++) {
            int dealerValue = (int) (Math.random() * 10) + 1;
            if (dealerValue == 1) {
                Random random1 = new Random();
                System.out.println(("Ace") + (" of ") + suit[random1.nextInt(suit.length)]);
                System.out.println("The dealer have been dealt a " + (dealerValue));
            } else if (dealerValue == 10) {
                Random random3 = new Random();
                System.out.println(tens[random3.nextInt(tens.length)] + (" of ") + suit[random3.nextInt(suit.length)]);
                System.out.println("The dealer been dealt a " + (dealerValue));
            } else {
                Random random2 = new Random();
                System.out.println((dealerValue) + (" of ") + suit[random2.nextInt(suit.length)]);
                System.out.println("The dealer been dealt a " + (dealerValue));
            } 
            if (!dealerPreviousCards.contains(dealerValue)) {
                dealerPreviousCards.add(dealerValue);
            }
            dealerPreviousCards.add(dealerValue);
        }

        for (int v : dealerPreviousCards) {
            dealerTotal += v;
        }
        System.out.println("The total value the dealer's hand is " + (dealerTotal)/2);

        System.out.println(" ");
        System.out.println(" ");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter hit to draw another card");
        String word = scanner.nextLine();
        if (word.equalsIgnoreCase("hit")) {
            System.out.println("Your next card is lmao");
        }
    }
}