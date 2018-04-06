package csci305.javalab;

import java.util.Map;
import java.util.Random;

public class MyBot extends Player{


    public MyBot(String name, Map<String, Element> moves) {
        super(name, moves);
    }

    @Override
    public Element play() {
        if(opponent.lastPlay == null)
            currentPlay = new RandomBot("Random Bot", moves).play();
        else {
            currentPlay = opponent.lastPlay;
        }

        return currentPlay;
    }
}
