package csci305.javalab;

import java.util.Map;
import java.util.Random;

public class MyBot extends Player {

    MyBot(String name, Map<String, Element> moves) {
        super(name, moves);
    }

    @Override
    public Element play() {
        if (opponent.lastPlay == null)
            currentPlay = new RandomBot("Random Bot", moves).play();
        else {
            Random random = new Random();
            int num = random.nextInt(2);

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
