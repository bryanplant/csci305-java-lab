package csci305.javalab;

import java.util.Map;

//Bot that iterates through all valid moves in order
public class IterativeBot extends Player{
    private int moveNum;    //keeps track of which element to play next

    //create an Iterative Bot with a name and map of valid moves
    IterativeBot(String name, Map<String, Element> moves) {
        super(name, moves);
        moveNum = 0;
    }

    //plays moves in order each turn starting with Rock
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
        //set moveNum back to Rock after Spock
        if(moveNum > 4)
            moveNum = 0;

        return currentPlay;
    }
}
