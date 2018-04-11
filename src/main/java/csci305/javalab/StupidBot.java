package csci305.javalab;

import java.util.Map;

// A bot that plays Lizard for every move
public class StupidBot extends Player{

    // create a Stupid Bot with a name and map of valid moves
    StupidBot(String name, Map<String, Element> moves) {
        super(name, moves);
    }

    @Override
    public Element play() {
        currentPlay = moves.get("Lizard");
        return currentPlay;
    }
}
