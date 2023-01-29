import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.ArrayList;
public class Game {
    static boolean tro = true;
    static int moveOn; 
    static int nextLine;
    static public int value;
    static public int valueCpu;
    private static ArrayList<Integer> previousCards = new ArrayList<Integer>();
    private static ArrayList<Integer> previousCardsCpu = new ArrayList<Integer>();
    static public int playerTotal;
    static public int CPUTotal;
    public static int totalCpu;
    public static int finalTotalCpu;
    public static int total;
    public static int finalTotal;
    
    private static String[] suit = {"Spades", "Clubs", "Hearts", "Diamonds"};
    private static String[] tens = {"10", "Jack", "Queen", "King"};
    public static void main (String args[]) {
        theScript();
        next();
        Scanner scanner = new Scanner(System.in);
        while (tro) {
            try {
                String nextLine = scanner.nextLine();
                if (nextLine.equalsIgnoreCase("Play")) {
                    System.out.print("\u000C");
                    System.out.println("The game will commence");  
                    System.out.println(" ");
                    getCard();
                    cpugetCard();
                    System.out.println(" ");
                    System.out.println("Enter Hit to hit"); 
                    System.out.println("Enter Fold to fold");
                } else {
                    if (nextLine.equalsIgnoreCase("Exit")) {
                        break;
                    }
                    if (nextLine.equalsIgnoreCase("Play")) {
                        System.out.println(" ");
                        getCard();
                    }
                    if (nextLine.equalsIgnoreCase("Hit")) {
                        getCardSingle();
                        getCardCpu();
                    }
                    if (nextLine.equalsIgnoreCase("Fold")) {
                        System.out.println(" ");
                        playerFold();
                    }
                }
            } catch (InputMismatchException error) {
                scanner.nextLine();
                System.out.println("Please enter Play or Exit");
            }
        }
    }

    public static void getCard() {
        for(int i=1; i<=2; i++) {
            int value = (int) (Math.random() * 10) + 1;
            if (value == 1) {
                Random random1 = new Random();
                System.out.println(("Ace") + (" of ") + suit[random1.nextInt(suit.length)]);
                System.out.println("You have been dealt a " + (value));
            } else if (value == 10) {
                Random random3 = new Random();
                System.out.println(tens[random3.nextInt(tens.length)] + (" of ") + suit[random3.nextInt(suit.length)]);
                System.out.println("You have been dealt a " + (value));
            } else {
                Random random2 = new Random();
                System.out.println((value) + (" of ") + suit[random2.nextInt(suit.length)]);
                System.out.println("You have been dealt a " + (value));
            } 
            if (!previousCards.contains(value)) {
                previousCards.add(value);
            }
            
        }
        for(int v = 0; v<previousCards.size(); v++) {
            playerTotal += previousCards.get(v);
        }
        System.out.println("The total value of your hand is " + (playerTotal));
        System.out.println(" ");
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

    public static void cpugetCard() {
        for(int i=1; i<=2; i++) {
            int valueCpu = (int) (Math.random() * 10) + 1;
            if (valueCpu == 1) {
                Random random1CPU = new Random();
                System.out.println(("Ace") + (" of ") + suit[random1CPU.nextInt(suit.length)]);
                System.out.println("The CPU has been dealt a " + (valueCpu));
            } else if (valueCpu == 10) {
                Random random3CPU = new Random();
                System.out.println(tens[random3CPU.nextInt(tens.length)] + (" of ") + suit[random3CPU.nextInt(suit.length)]);
                System.out.println("The CPU has been dealt a " + (valueCpu));
            } else {
                Random random2CPU = new Random();
                System.out.println((valueCpu) + (" of ") + suit[random2CPU.nextInt(suit.length)]);
                System.out.println("The CPU has been dealt a " + (valueCpu));
            } 
            if (!previousCardsCpu.contains(valueCpu)) {
                previousCards.add(valueCpu);
            }
            previousCardsCpu.add(valueCpu);
        }
        for(int v = 0; v<previousCardsCpu.size(); v++) {
            CPUTotal += previousCardsCpu.get(v);
        }
        System.out.println("The total value of the CPU's hand is " + (CPUTotal));
    }

    public static void getCardCpu() {
        for(int i=1; i<=1; i++) {
            int valueCpu = (int) (Math.random() * 10) + 1;
            if (valueCpu == 1) {
                Random random1CPU = new Random();
                System.out.println(("Ace") + (" of ") + suit[random1CPU.nextInt(suit.length)]);
                System.out.println("The CPU has been dealt a " + (valueCpu));
            } else if (valueCpu == 10) {
                Random random3CPU = new Random();
                System.out.println(tens[random3CPU.nextInt(tens.length)] + (" of ") + suit[random3CPU.nextInt(suit.length)]);
                System.out.println("The CPU has been dealt a " + (valueCpu));
            } else {
                Random random2CPU = new Random();
                System.out.println((valueCpu) + (" of ") + suit[random2CPU.nextInt(suit.length)]);
                System.out.println("The CPU has been dealt a " + (valueCpu));
            } 
            if (!previousCards.contains(valueCpu)) {
                previousCards.add(valueCpu);
            }
            previousCards.add(valueCpu);
        }
        for(int v = 0; v<previousCards.size(); v++) {
            totalCpu += previousCards.get(v);
        }
        int cpuTotal = ((totalCpu/2)+CPUTotal/2);
        System.out.println("The total value of the CPU's hand is " + cpuTotal);
        System.out.println(" ");
    }
    
    public static void getCardSingle() {
        for(int i=1; i<=1; i++) {
            int value = (int) (Math.random() * 10) + 1;
            if (value == 1) {
                Random random1 = new Random();
                System.out.println(("Ace") + (" of ") + suit[random1.nextInt(suit.length)]);
                System.out.println("You have been dealt a " + (value));
            } else if (value == 10) {
                Random random3 = new Random();
                System.out.println(tens[random3.nextInt(tens.length)] + (" of ") + suit[random3.nextInt(suit.length)]);
                System.out.println("You have been dealt a " + (value));
            } else {
                Random random2 = new Random();
                System.out.println((value) + (" of ") + suit[random2.nextInt(suit.length)]);
                System.out.println("You have been dealt a " + (value));
            } 
            if (!previousCards.contains(value)) {
                previousCards.add(value);
            }
        }
        for(int v = 0; v<previousCards.size(); v++) {
            total += previousCards.get(v);
        }
        int finalTotal = ((total)+playerTotal/4);
        System.out.println("The total value of your hand is " + finalTotal);
        System.out.println(" ");

    }

    public static void playerFold() {
        System.out.println("You have chosen to fold. The final value of your hand is " + previousCards);
    }
}