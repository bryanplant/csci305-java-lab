package csci305.javalab;

import java.util.Map;
import java.util.Random;

public class RandomBot extends Player{

    public RandomBot(String name, Map<String, Element> moves) {
        super(name, moves);
    }

    @Override
    public Element play() {
        Random rand = new Random();
        currentPlay = (Element) moves.values().toArray()[rand.nextInt(5)];
        return currentPlay;
    }
}
