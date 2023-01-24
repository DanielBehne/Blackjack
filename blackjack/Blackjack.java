import java.util.ArrayList;

public class Blackjack {
    private static final int MAX_SCORE = 21;
    private static final int DEALER_STAY = 17;

    private ArrayList<Integer> playerCards;
    private ArrayList<Integer> dealerCards;

    public Blackjack() {
        playerCards = new ArrayList<Integer>();
        dealerCards = new ArrayList<Integer>();
    }

    public void start() {
        // Deal initial cards
        playerCards.add(getNextCard());
        dealerCards.add(getNextCard());
        playerCards.add(getNextCard());
        dealerCards.add(getNextCard());

        // Player turn
        while (getScore(playerCards) < MAX_SCORE) {
            // Ask player if they want to hit or stay
            // If hit, add next card to playerCards
        }

        // Dealer turn
        while (getScore(dealerCards) < DEALER_STAY) {
            // Add next card to dealerCards
        }

        // Determine winner
        int playerScore = getScore(playerCards);
        int dealerScore = getScore(dealerCards);
        if (playerScore > MAX_SCORE) {
            // Player bust
        } else if (dealerScore > MAX_SCORE) {
            // Dealer bust
        } else if (playerScore > dealerScore) {
            // Player wins
        } else if (playerScore < dealerScore) {
            // Dealer wins
        } else {
            // Tie
        }
    }

    private int getNextCard() {
        // Generate and return a random card
    }

    private int getScore(ArrayList<Integer> cards) {
        // Calculate and return the score of the given cards
    }
    
}


