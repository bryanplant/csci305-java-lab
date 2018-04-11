package csci305.javalab;

//represents the Paper move
public class Paper extends Element {

    //create a Paper Element with a name
    Paper(String name) {
        super(name);
    }

    @Override
    public Outcome compareTo(Element other) {
        Outcome outcome = null;

        //Paper covers Rock - win
        //Paper equals Paper - tie
        //Scissors cuts Paper - lose
        //Lizard eats Paper - lose
        //Paper disproves Spock - win
        switch (other.getName()) {
            case "Rock":
                outcome = new Outcome("Paper covers Rock", "Win");
                break;
            case "Paper":
                outcome = new Outcome("Paper equals Paper", "Tie");
                break;
            case "Scissors":
                outcome = new Outcome("Scissors cuts Paper", "Lose");
                break;
            case "Lizard":
                outcome = new Outcome("Lizard eats Paper", "Lose");
                break;
            case "Spock":
                outcome = new Outcome("Paper disproves Spock", "Win");
                break;
        }

        return outcome;
    }
}
