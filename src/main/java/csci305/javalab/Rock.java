package main.java.csci305.javalab;

public class Rock extends Element {

    public Rock(String name) {
        super(name);
    }

    @Override
    public Outcome compareTo(Element other) {
        Outcome outcome = null;

        //Rock equals Rock - tie
        //Paper covers Rock - lose
        //Rock crushes Scissors - win
        //Rock crushes Lizard - win
        //Spock vaporizes Rock - lose
        switch (other.getName()) {
            case "Rock":
                outcome = new Outcome("Rock equals Rock", "Tie");
                break;
            case "Paper":
                outcome = new Outcome("Paper covers Rock", "Lose");
                break;
            case "Scissors":
                outcome = new Outcome("Rock crushes Scissors", "Win");
                break;
            case "Lizard":
                outcome = new Outcome("Rock crushes Lizard", "Win");
                break;
            case "Spock":
                outcome = new Outcome("Spock vaporizes Rock", "Lose");
                break;
        }

        return outcome;
    }
}