package csci305.javalab;

import java.util.Map;
import java.util.Random;

// A bot that is designed to beat players who play
// the same move multiple times in a row
public class MyBot extends Player {

    // create a MyBot with a name and map of moves
    MyBot(String name, Map<String, Element> moves) {
        super(name, moves);
    }

    // plays a move to beat its opponents last move
    @Override
    public Element play() {
        //if lastPlay is null then play a random move
        if (opponent.lastPlay == null)
            currentPlay = new RandomBot("Random Bot", moves).play();
        else {
            Random random = new Random();
            //generate a number to decide which one of two moves to play
            int num = random.nextInt(2);

            // first set of moves to beat the opponents move
            if (num == 0) {
                switch (opponent.lastPlay.getName()) {
                    case "Rock":
                        currentPlay = moves.get("Paper");
                        break;
                    case "Paper":
                        currentPlay = moves.get("Scissors");
                        break;
                    case "Scissors":
                        currentPlay = moves.get("Spock");
                        break;
                    case "Lizard":
                        currentPlay = moves.get("Rock");
                        break;
                    case "Spock":
                        currentPlay = moves.get("Lizard");
                        break;
                }
                //second set of moves to beat opponents moves
            } else {
                switch (opponent.lastPlay.getName()) {
                    case "Rock":
                        currentPlay = moves.get("Spock");
                        break;
                    case "Paper":
                        currentPlay = moves.get("Lizard");
                        break;
                    case "Scissors":
                        currentPlay = moves.get("Rock");
                        break;
                    case "Lizard":
                        currentPlay = moves.get("Scissors");
                        break;
                    case "Spock":
                        currentPlay = moves.get("Paper");
                        break;
                }
            }
        }

        return currentPlay;
    }
}
