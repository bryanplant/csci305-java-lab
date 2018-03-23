package main.java.csci305.javalab;

public class IterativeBot extends Player{
    private int moveNum;

    public IterativeBot(String name) {
        super(name);
        moveNum = 0;
    }

    @Override
    public Element play() {
        Element move = null;
        switch(moveNum) {
            case 0:
                move = new Rock("Rock");
                break;
            case 1:
                move = new Paper("Paper");
                break;
            case 2:
                move = new Scissors("Scissors");
                break;
            case 3:
                move = new Lizard("Lizard");
                break;
            case 4:
                move = new Spock("Spock");
                break;
        }

        moveNum ++;
        if(moveNum > 4)
            moveNum = 0;

        return move;
    }
}
