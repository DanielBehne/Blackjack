import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.ArrayList;
public class BlackJack {
    static boolean tro = true;
    static int moveOn; 
    static int nextLine;

    static public int valueCpu;

    private static ArrayList<Integer> previousCardsDealer = new ArrayList<Integer>();

    static public int dealerTotal;
    static public boolean dealerfold = false;
    static public boolean playerfold = false; 
    private static String[] suit = {"Spades", "Clubs", "Hearts", "Diamonds"};
    private static String[] tens = {"10", "Jack", "Queen", "King"};
    public static void main (String args[]) {
        theScript();
        next();
        Scanner scanner = new Scanner(System.in);
        boolean allow = false;
        boolean allowforplay = true;
        while (tro) {
            String nextLine = scanner.nextLine();
            if (nextLine.equalsIgnoreCase("Exit")) {
                tro = false;
                System.out.println("See you later!");
            }
            if (nextLine.equalsIgnoreCase("Play") && allowforplay == true) {
                allowforplay = false;
                System.out.print("\u000C");
                System.out.println("The game will commence");  
                System.out.println(" ");
                getCard();
                System.out.println(" ");
                System.out.println("Enter Hit to hit"); 
                System.out.println("Enter Fold to fold");
            } else {
                if (allow == true) {
                    if (nextLine.equalsIgnoreCase("Hit")) {
                        getCardHit();
                    }
                    if (nextLine.equalsIgnoreCase("Fold")) {
                        System.out.println(" ");
                        playerFold();
                        for (int i = 0; i == 15;i++) {
                            getCardDealerHit();
                        }
                        if (playerfold == true && dealerfold == true) {
                            int diffA = Math.abs(21 - playerTotal);
                            int diffB = Math.abs(21 - dealerTotal);
                            if (playerTotal < dealerTotal) {
                                System.out.println("The dealer is  closer to 21 and win!");
                                finishthegame(false);
                            } else 
                            if (dealerTotal < playerTotal) {
                                System.out.println("You are closer to 21 and win!");
                                finishthegame(false);
                            } else {
                                System.out.println("You and the dealer are equally close to 21!");
                                finishthegame(false);
                            }
                        }
                    }
                }
            }
            if (!nextLine.equalsIgnoreCase("Exit") && !nextLine.equalsIgnoreCase("Play") && tro == true) {
                System.out.println("Please enter exit or play; if you already started the game please enter hit or fold");
            } else {
                allow = true;
            }

        }
    }

    static public int value; 
    private static ArrayList<Integer> previousCards = new ArrayList<Integer>();
    static public int playerTotal;
    public static void getCard() {
        //The for loop runs the program twice and the values are added to previousCards each time;
        for(int i=1; i<=2; i++) { 
            int value = (int) (Math.random() * 10) + 1;
            if (value == 1) {
                Random random1 = new Random();
                System.out.println(("Ace") + (" of ") + suit[random1.nextInt(suit.length)]);
                System.out.println("You have been dealt a " + (value));
            } else if (value == 10) {
                Random random2 = new Random();
                System.out.println(tens[random2.nextInt(tens.length)] + (" of ") + suit[random2.nextInt(suit.length)]);
                System.out.println("You have been dealt a " + (value));
            } else {
                Random random3 = new Random();
                System.out.println((value) + (" of ") + suit[random3.nextInt(suit.length)]);
                System.out.println("You have been dealt a " + (value));
            } 
            previousCards.add(value);
        }
        for(int v = 0; v<previousCards.size(); v++) {
            playerTotal += previousCards.get(v);
        }
        if (playerTotal < 21) { 
            System.out.println("The total value of your hand is " + (playerTotal));
            System.out.println(" ");
            getCardDealer();
        } else {
            if (playerTotal == 21) {
                System.out.println(" ");
                System.out.println("You have hit 21 and hit blackjack, you've won");
                System.out.println(" ");
                finishthegame(false);
            } else {
                System.out.println("You have busted, the dealer has won : C");
                System.out.println(" ");
                finishthegame(false);
            }
        }
    }

    public static void getCardHit() {
        previousCards.clear();
        for(int i=1; i<=1; i++) {
            int value = (int) (Math.random() * 10) + 1;
            if (value == 1) {
                Random random7 = new Random();
                System.out.println(("Ace") + (" of ") + suit[random7.nextInt(suit.length)]);
                System.out.println("You have been dealt a " + (value));
            } else if (value == 10) {
                Random random8 = new Random();
                System.out.println(tens[random8.nextInt(tens.length)] + (" of ") + suit[random8.nextInt(suit.length)]);
                System.out.println("You have been dealt a " + (value));
            } else {
                Random random9 = new Random();
                System.out.println((value) + (" of ") + suit[random9.nextInt(suit.length)]);
                System.out.println("You have been dealt a " + (value));
            } 
            previousCards.add(value);
        }
        for(int v = 0; v<previousCards.size(); v++) {
            playerTotal += previousCards.get(v);
        }
        if (playerTotal < 21) { 
            System.out.println("The total value of your hand is " + (playerTotal));
            System.out.println(" ");
            getCardDealerHit();
        } else {
            if (playerTotal == 21) {
                System.out.println(" ");
                System.out.println("You have hit 21 and hit blackjack, you've won");
                System.out.println(" ");
                finishthegame(false);
            } else {
                if (dealerfold == true && playerTotal > dealerTotal && playerTotal <= 21) {
                    System.out.println("You are closer to 21 and won!");
                    System.out.println(" ");
                    finishthegame(false);
                } else {
                    System.out.println("You have busted, the dealer has won : C");
                    System.out.println(" ");
                    finishthegame(false);
                }
            }
        }
    }

    public static void getCardDealer() {
        if (dealerTotal >= 0 && dealerTotal < 17) {
            for(int i=1; i<=2; i++) {
                int value = (int) (Math.random() * 10) + 1;
                if (value == 1) {
                    Random random4 = new Random();
                    System.out.println(("Ace") + (" of ") + suit[random4.nextInt(suit.length)]);
                    System.out.println("The dealer has been dealt a " + (value));
                } else if (value == 10) {
                    Random random5 = new Random();
                    System.out.println(tens[random5.nextInt(tens.length)] + (" of ") + suit[random5.nextInt(suit.length)]);
                    System.out.println("The dealer has been dealt a " + (value));
                } else {
                    Random random6 = new Random();
                    System.out.println((value) + (" of ") + suit[random6.nextInt(suit.length)]);
                    System.out.println("The dealer has been dealt a " + (value));
                } 
                previousCardsDealer.add(value);
            }
            for(int v = 0; v<previousCardsDealer.size(); v++) {
                dealerTotal += previousCardsDealer.get(v);
            }
            if (dealerTotal >= 0 && dealerTotal < 17) {
                System.out.println("The total value of the dealer's hand is " + dealerTotal);
                System.out.println(" ");
            } else {
                if (dealerTotal > 21) {
                    System.out.println("The dealer has busted, You have won : )");
                    System.out.println(" ");
                    finishthegame(true);
                } else {
                    if (dealerTotal > 17 && dealerTotal < 21 && dealerTotal > playerTotal) {
                        System.out.println("The total value of the dealer's hand is " + (dealerTotal));
                        System.out.println("The dealers had folded; its final total is " + dealerTotal);
                        System.out.println(" ");
                        dealerfold = true;
                    } else {
                        if (dealerTotal == 21) {
                            System.out.println("The dealer has hit 21 and hit blackjack, you've lost");
                            System.out.println(" ");
                            finishthegame(false);
                        } else {
                            System.out.println("The dealers had folded; its final total is " + dealerTotal);
                            System.out.println(" ");
                            dealerfold = true;
                        }
                    }
                }
            }
        }  

    }

    public static void getCardDealerHit() {
        previousCardsDealer.clear();
        if (dealerfold == false) {
            if (dealerTotal >= 0 && dealerTotal < 17 || dealerTotal < playerTotal) {
                System.out.println("The dealer has hit");
                System.out.println(" ");
                for(int i=1; i<=1; i++) {
                    int value = (int) (Math.random() * 10) + 1;
                    if (value == 1) {
                        Random random10 = new Random();
                        System.out.println(("Ace") + (" of ") + suit[random10.nextInt(suit.length)]);
                        System.out.println("The dealer has been dealt a " + (value));
                    } else if (value == 10) {
                        Random random11 = new Random();
                        System.out.println(tens[random11.nextInt(tens.length)] + (" of ") + suit[random11.nextInt(suit.length)]);
                        System.out.println("The dealer has been dealt a " + (value));
                    } else {
                        Random random12 = new Random();
                        System.out.println((value) + (" of ") + suit[random12.nextInt(suit.length)]);
                        System.out.println("The dealer has been dealt a " + (value));
                    } 
                    previousCardsDealer.add(value);
                }
                for(int v = 0; v<previousCardsDealer.size(); v++) {
                    dealerTotal += previousCardsDealer.get(v);
                }
                if (dealerTotal >= 0 && dealerTotal < 17) {
                    System.out.println("The total value of the dealer's hand is " + (dealerTotal));
                    System.out.println(" ");
                } else {
                    if (dealerTotal > 21) {
                        System.out.println("The dealer has busted, You have won : )");
                        System.out.println(" ");
                        finishthegame(false);
                    } else {
                        if (dealerTotal >= 17 && dealerTotal < 21 && dealerTotal > playerTotal) {
                            System.out.println("The total value of the dealer's hand is " + (dealerTotal));
                            System.out.println(" ");
                            System.out.println("The dealers had folded; its final total is " + dealerTotal);
                            System.out.println(" ");
                            dealerfold = true;
                        } else {
                            if (dealerTotal == 21) {
                                System.out.println("The dealer has hit 21 and hit blackjack, you've lost");
                                System.out.println(" ");
                                finishthegame(false);
                            } else {
                                if (dealerTotal > playerTotal && playerfold == true) {
                                    System.out.println("The dealers had folded; its final total is " + dealerTotal);
                                    System.out.println(" ");
                                    dealerfold = true;
                                } else {
                                    if (dealerTotal <= 17 && dealerTotal > 0 && dealerTotal < playerTotal) {
                                        System.out.println("The total value of the dealer's hand is " + (dealerTotal));
                                        System.out.println(" ");
                                    } else {
                                        System.out.println("The dealers has folded; its final total is " + dealerTotal);
                                        System.out.println(" ");
                                        dealerfold = true;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } else {
            dealerfold = true;
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
        System.out.println ("good luck!");
    }

    public static void playerFold() {
        System.out.println("You have chosen to fold. The final value of your hand is " + playerTotal);
        getCardDealerHit();
        playerfold = true;
    }

    public static boolean finishthegame(boolean w) {
        if (w == false) {
            System.out.println("Hope you had fun! :D");
        }
        return tro = false;
    }
}


