package csci305.javalab;

import java.util.Map;
import java.util.Random;

// bot which randomly plays
public class RandomBot extends Player{

    //create a RandomBot with a name and map of valid moves
    RandomBot(String name, Map<String, Element> moves) {
        super(name, moves);
    }

    //convert the map of moves to an array and select a random move
    @Override
    public Element play() {
        Random rand = new Random();
        currentPlay = (Element) moves.values().toArray()[rand.nextInt(5)];
        return currentPlay;
    }
}
