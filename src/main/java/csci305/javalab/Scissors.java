package csci305.javalab;

public class Scissors extends Element {

    public Scissors(String name) {
        super(name);
    }

    @Override
    public Outcome compareTo(Element other) {
        Outcome outcome = null;

        //Rock crushes Scissors - lose
        //Scissors cut Paper - win
        //Scissors equals Scissors - tie
        //Scissors decapitate Lizard - win
        //Spock smashes Scissors - lose
        switch (other.getName()) {
            case "Rock":
                outcome = new Outcome("Rock crushes Scissors", "Lose");
                break;
            case "Paper":
                outcome = new Outcome("Scissors cut Paper", "Win");
                break;
            case "Scissors":
                outcome = new Outcome("Scissors equals Scissors", "Tie");
                break;
            case "Lizard":
                outcome = new Outcome("Scissors decapitate Lizard", "Win");
                break;
            case "Spock":
                outcome = new Outcome("Spock smashes Scissors", "Lose");
                break;
        }

        return outcome;
    }
}
