package csci305.javalab;

import java.util.Map;

public class IterativeBot extends Player{
    private int moveNum;

    public IterativeBot(String name, Map<String, Element> moves) {
        super(name, moves);
        moveNum = 0;
    }

    @Override
    public Element play() {
        switch(moveNum) {
            case 0:
                currentPlay = moves.get("Rock");
                break;
            case 1:
                currentPlay = moves.get("Paper");
                break;
            case 2:
                currentPlay = moves.get("Scissors");
                break;
            case 3:
                currentPlay = moves.get("Lizard");
                break;
            case 4:
                currentPlay = moves.get("Spock");
                break;
        }

        moveNum ++;
        if(moveNum > 4)
            moveNum = 0;

        return currentPlay;
    }
}
