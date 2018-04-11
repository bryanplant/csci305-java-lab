package csci305.javalab;

import java.util.Map;

// base class for Players
public abstract class Player {
    private String name;    // name of player
    protected Element lastPlay; //the last move the player played
    Map<String, Element> moves; //the valid map of moves
    Element currentPlay;        //the move that the player is currently playing
    Player opponent;            //the player that this player is playing against

    //create a Player with a name and list of moves
    Player(String name, Map<String, Element> moves) {
        this.name = name;
        this.moves = moves;
        this.currentPlay = null;
        this.lastPlay = null;
    }

    //sets the opponent of this player
    public void setOpponent(Player opponent) {
        this.opponent = opponent;
    }

    public String getName() {
        return name;
    }

    //update the lastPlay to be the current play
    public void updateLastPlay() {
        lastPlay = currentPlay;
    }

    //play method for all subclasses to implement
    public abstract Element play();
}
