package csci305.javalab;

// represents a Spock move
public class Spock extends Element {

    // create a Spock with a name
    Spock(String name) {
        super(name);
    }

    @Override
    public Outcome compareTo(Element other) {
        Outcome outcome = null;

        //Spock vaporizes Rock - win
        //Paper disproves Spock - lose
        //Spock smashes Scissors - win
        //Lizard poisons Spock - lose
        //Spock equals Spock - tie
        switch (other.getName()) {
            case "Rock":
                outcome = new Outcome("Spock vaporizes Rock", "Win");
                break;
            case "Paper":
                outcome = new Outcome("Paper disproves Spock", "Lose");
                break;
            case "Scissors":
                outcome = new Outcome("Spock smashes Scissors", "Win");
                break;
            case "Lizard":
                outcome = new Outcome("Lizard poisons Spock", "Lose");
                break;
            case "Spock":
                outcome = new Outcome("Spock equals Spock", "Tie");
                break;
        }

        return outcome;
    }
}
