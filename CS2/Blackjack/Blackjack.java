import java.util.*;
public class Blackjack {
    private static boolean playing;
    public static void main(String[] args) throws InputMismatchException {
        playing = true;
        int dealerScore = 0;
        int playerScore = 0;

        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Blackjack!");
        System.out.println("What's your name?");
        String name = scan.nextLine();

        out:
        while(playing) {
            Deck deck = new Deck();
            deck.shuffle();
            Player player = new Player(name);
            Player cpu = new Player("Dealer");
            for(int k = 1; k <= 2; k++) {
                cpu.getHand().add(deck.getDeck().pop());
                player.getHand().add(deck.getDeck().pop());
            }
            if(player.getBlackjackHandValue() == 21) {
                System.out.println(player.getName() + " wins this round!");
                playerScore++;
                System.out.println(player);
                System.out.println(cpu);
                System.out.print("Score - ");
                System.out.print(player.getName() + ": " + playerScore);
                System.out.println(" " + cpu.getName() + ": " + dealerScore);
                if(playAgain()) {
                    continue;
                }
                else {
                    System.out.println("Game Over!");
                    System.out.print("Final Score - ");
                    System.out.print(player.getName() + ": " + playerScore);
                    System.out.println(" " + cpu.getName() + ": " + dealerScore);
                    if(playerScore > dealerScore) {
                        System.out.print(player.getName() + " wins the game!");
                    }
                    else {
                        System.out.print(cpu.getName() + " wins the game!");
                    }
                    break out;
                }
            }
            boolean playerTurn = true;
            while(player.getBlackjackHandValue() < 21 && playerTurn) {
                System.out.println(player);
                System.out.println("Hit or Stay?");
                String reply = scan.nextLine();
                if(reply.equalsIgnoreCase("hit")) {
                    player.getHand().add(deck.getDeck().pop());
                    if(player.getBlackjackHandValue() > 21) {
                        System.out.println(player);
                        System.out.println(cpu);
                        System.out.println(player.getName() + " busted!");
                        System.out.println(cpu.getName() + " wins this round!");
                        dealerScore++;
                        System.out.print("Score - ");
                        System.out.print(player.getName() + ": " + playerScore);
                        System.out.println(" " + cpu.getName() + ": " + dealerScore);
                        if(playAgain()) {
                            continue out;
                        }
                        else {
                            playing = false;
                            System.out.println("Game Over!");
                            System.out.print("Final Score - ");
                            System.out.print(player.getName() + ": " + playerScore);
                            System.out.println(" " + cpu.getName() + ": " + dealerScore);
                            if(playerScore > dealerScore) {
                                System.out.print(player.getName() + " wins the game!");
                            }
                            else {
                                System.out.print(cpu.getName() + " wins the game!");
                            }
                            break out;
                        }
                    }
                }
                else {
                    System.out.println(player.getName() + " stayed with a " + player.getBlackjackHandValue());

                    boolean cpuTurn = true;
                    while(cpu.getBlackjackHandValue() < 21 && cpuTurn) {
                        System.out.println(cpu);
                        if(cpu.getBlackjackHandValue() < 16) {
                            System.out.println("Dealer hits!");
                            cpu.getHand().add(deck.getDeck().pop());
                            if(cpu.getBlackjackHandValue() > 21) {
                                System.out.println(cpu);
                                System.out.println(cpu.getName() + " busted!");
                                System.out.println(player);
                                System.out.println(cpu);
                                System.out.println(player.getName() + " wins the round!");
                                playerScore++;
                                System.out.print("Score - ");
                                System.out.print(player.getName() + ": " + playerScore);
                                System.out.println(" " + cpu.getName() + ": " + dealerScore);
                                if(playAgain()) {
                                    continue out;
                                }
                                else {
                                    System.out.println("Game Over!");
                                    System.out.print("Final Score - ");
                                    System.out.print(player.getName() + ": " + playerScore);
                                    System.out.println(" " + cpu.getName() + ": " + dealerScore);
                                    if(playerScore > dealerScore) {
                                        System.out.print(player.getName() + " wins the game!");
                                    }
                                    else {
                                        System.out.print(cpu.getName() + " wins the game!");
                                    }
                                    break out;
                                }
                            }
                        }
                        else {
                            System.out.println(cpu.getName() + " stayed with a " + cpu.getBlackjackHandValue());
                            System.out.println(player);
                            System.out.println(cpu);
                            if(player.getBlackjackHandValue() > cpu.getBlackjackHandValue()) {
                                System.out.println(player.getName() + " wins the round");
                                playerScore++;
                            } else {
                                System.out.println(cpu.getName() + " wins the round");
                                dealerScore++;
                            }
                            System.out.print("Score - ");
                            System.out.print(player.getName() + ": " + playerScore);
                            System.out.println(" " + cpu.getName() + ": " + dealerScore);
                            if(playAgain()) {
                                continue out;
                            }
                            else {
                                System.out.println("Game Over!");
                                System.out.print("Final Score - ");
                                System.out.print(player.getName() + ": " + playerScore);
                                System.out.println(" " + cpu.getName() + ": " + dealerScore);
                                if(playerScore > dealerScore) {
                                    System.out.print(player.getName() + " wins the game!");
                                }
                                else {
                                    System.out.print(cpu.getName() + " wins the game!");
                                }
                                break out;
                            }
                        }
                    }
                }
            }
        }
    }
    static boolean playAgain() {
        System.out.println("Play again?");
        Scanner in = new Scanner(System.in);
        String reply = in.nextLine();
        if(reply.equalsIgnoreCase("yes")) {
            return true;
        }
        else {
            playing = false;
            return false;
        }
    }
}