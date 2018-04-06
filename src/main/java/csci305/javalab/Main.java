package csci305.javalab;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static final Map<String, Element> moves = new HashMap<>();

    public static void main(String[] args) {
        moves.put("Rock", new Rock("Rock"));
        moves.put("Paper", new Paper("Paper"));
        moves.put("Scissors", new Scissors("Scissors"));
        moves.put("Lizard", new Lizard("Lizard"));
        moves.put("Spock", new Spock("Spock"));

        Scanner in = new Scanner(System.in);

        System.out.println("Welcome to Rock, Paper, Scissors, Lizard, Spock, implemented by Bryan Plant.\n");
        System.out.println("Please choose two players:\n" +
                "\t(1) Human\n" +
                "\t(2) StupidBot\n" +
                "\t(3) RandomBot\n" +
                "\t(4) IterativeBot\n" +
                "\t(5) LastPlayBot\n" +
                "\t(6) MyBot\n");

        Player[] players = {null, null};

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
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input. Try Again.");
                    in.nextLine();
                }
            }
        }

        players[0].setOpponent(players[1]);
        players[1].setOpponent(players[0]);

        System.out.println("\n" + players[0].getName() + " vs " + players[1].getName() + ". Go!\n");

        int p1score = 0;
        int p2score = 0;
        for (int i = 1; i <= 5; i++) {
            Element p1move = players[0].play();
            Element p2move = players[1].play();
            Outcome outcome = p1move.compareTo(p2move);
            players[0].updateLastPlay();
            players[1].updateLastPlay();

            System.out.println("Round " + i);
            System.out.println("\tPlayer 1 chose " + p1move.getName());
            System.out.println("\tPlayer 2 chose " + p2move.getName());
            System.out.println("\t" + outcome.getInfo());
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

        System.out.println("The score is " + p1score + " to " + p2score + ".");
        if(p1score > p2score) {
            System.out.println("Player 1 is the winner!");
        }
        else if(p2score > p1score) {
            System.out.println("Player 2 is the winner!");
        }
        else {
            System.out.println("The game was a draw!");
        }

    }
}