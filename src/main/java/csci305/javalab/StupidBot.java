package csci305.javalab;

import java.util.Map;

public class StupidBot extends Player{

    StupidBot(String name, Map<String, Element> moves) {
        super(name, moves);
    }

    @Override
    public Element play() {
        currentPlay = moves.get("Lizard");
        return currentPlay;
    }
}
