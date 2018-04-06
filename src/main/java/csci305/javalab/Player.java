package csci305.javalab;

import java.util.Map;

public abstract class Player {
    private String name;
    protected Map<String, Element> moves;
    protected Element currentPlay;
    protected Element lastPlay;
    protected String lastOutcome;
    protected Player opponent;

    Player(String name, Map<String, Element> moves) {
        this.name = name;
        this.moves = moves;
        this.currentPlay = null;
        this.lastPlay = null;
    }

    public void setOpponent(Player opponent) {
        this.opponent = opponent;
    }

    public String getName() {
        return name;
    }

    public void updateLastPlay() {
        lastPlay = currentPlay;
    }

    public abstract Element play();
}
