package csci305.javalab;

import java.util.Map;

public class LastPlayBot extends Player {

    public LastPlayBot(String name, Map<String, Element> moves) {
        super(name, moves);
    }

    public void setOpponent(Player opponent) {
        this.opponent = opponent;
    }

    @Override
    public Element play() {
        if(opponent.lastPlay == null)
            currentPlay = new RandomBot("Random Bot", moves).play();
        else
            currentPlay = opponent.lastPlay;

        return currentPlay;
    }
}
