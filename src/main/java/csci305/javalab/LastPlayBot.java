package csci305.javalab;

import java.util.Map;

//Bot that plays the move that its opponent played last turn
public class LastPlayBot extends Player {

    //create a Last Play Bot with a name and map of valid moves
    LastPlayBot(String name, Map<String, Element> moves) {
        super(name, moves);
    }

    // uses opponent variable in order to play the opponent's last play
    // plays a random move if there is no lastPlay yet
    @Override
    public Element play() {
        if(opponent.lastPlay == null)
            currentPlay = new RandomBot("Random Bot", moves).play();
        else
            currentPlay = opponent.lastPlay;

        return currentPlay;
    }
}
