package csci305.javalab;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

// select to players and play 5 rounds
public class Main {
    // the map of valid moves
    private static final Map<String, Element> moves = new HashMap<>();

    public static void main(String[] args) {
        // populate the moves map
        moves.put("Rock", new Rock("Rock"));
        moves.put("Paper", new Paper("Paper"));
        moves.put("Scissors", new Scissors("Scissors"));
        moves.put("Lizard", new Lizard("Lizard"));
        moves.put("Spock", new Spock("Spock"));

        // create a new scanner to get input from stdin
        Scanner in = new Scanner(System.in);

        // print a prompt for the user to choose two players
        System.out.println("Welcome to Rock, Paper, Scissors, Lizard, Spock, implemented by Bryan Plant.\n");
        System.out.println("Please choose two players:\n" +
                "\t(1) Human\n" +
                "\t(2) StupidBot\n" +
                "\t(3) RandomBot\n" +
                "\t(4) IterativeBot\n" +
                "\t(5) LastPlayBot\n" +
                "\t(6) MyBot\n");

        // initialize an array of 2 null players
        Player[] players = {null, null};

        // get input from user to select 2 valid players
        for (int i = 0; i < players.length; i++) {
            while (players[i] == null) {
                System.out.print("Select player " + (i + 1) + ":");
                try {
                    int input = in.nextInt();
                    switch (input) {
                        case 1:
                            players[i] = new HumanPlayer("HumanPlayer", moves);
                            break;
                        case 2:
                            players[i] = new StupidBot("StupidBot", moves);
                            break;
                        case 3:
                            players[i] = new RandomBot("RandomBot", moves);
                            break;
                        case 4:
                            players[i] = new IterativeBot("IterativeBot", moves);
                            break;
                        case 5:
                            players[i] = new LastPlayBot("LastPlayBot", moves);
                            break;
                        case 6:
                            players[i] = new MyBot("MyBot", moves);
                            break;
                        default:
                            throw new InputMismatchException();
                    }
                    // prompt user to try again for invalid input
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input. Try Again.");
                    in.nextLine();
                }
            }
        }

        // set the opponent for both players
        players[0].setOpponent(players[1]);
        players[1].setOpponent(players[0]);

        // print out the names of each player
        System.out.println("\n" + players[0].getName() + " vs " + players[1].getName() + ". Go!\n");

        //initialize player scores to 0
        int p1score = 0;
        int p2score = 0;

        // play 5 rounds
        for (int i = 1; i <= 5; i++) {
            // play moves
            Element p1move = players[0].play();
            Element p2move = players[1].play();
            // get outcome of moves
            Outcome outcome = p1move.compareTo(p2move);
            //update the players' last plays
            players[0].updateLastPlay();
            players[1].updateLastPlay();

            //print out results
            System.out.println("Round " + i);
            System.out.println("\tPlayer 1 chose " + p1move.getName());
            System.out.println("\tPlayer 2 chose " + p2move.getName());
            System.out.println("\t" + outcome.getInfo());

            // print outcome and increment winner's score
            switch (outcome.getOutcome()) {
                case "Win":
                    System.out.println("\tPlayer 1 won the round");
                    p1score++;
                    break;
                case "Lose":
                    System.out.println("\tPlayer 2 won the round");
                    p2score++;
                    break;
                default:
                    System.out.println("\tRound was a tie");
                    break;
            }
            System.out.println();
        }

        //print out the final scores and which player won
        System.out.println("The score is " + p1score + " to " + p2score + ".");
        if (p1score > p2score) {
            System.out.println("Player 1 is the winner!");
        } else if (p2score > p1score) {
            System.out.println("Player 2 is the winner!");
        } else {
            System.out.println("The game was a draw!");
        }

    }
}