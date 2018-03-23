package main.java.csci305.javalab;

import java.util.HashMap;
import java.util.Map;

public class Main {
    private static final Map<String, Element> moves = new HashMap<>();

    public static void main(String[] args) {
        moves.put("Rock", new Rock("Rock"));
        moves.put("Paper", new Rock("Paper"));
        moves.put("Scissors", new Rock("Scissors"));
        moves.put("Lizard", new Rock("Lizard"));
        moves.put("Spock", new Rock("Spock"));

        Player p1 = new HumanPlayer("Human");
        Player p2 = new StupidBot("StupidBot");


        Element p1move = p1.play();
        Element p2move = p2.play();
        System.out.println(p1move.compareTo(p2move));
    }
}
