package csci305.javalab;

//represents the Lizard move
public class Lizard extends Element {

    //create a Lizard Element with a name
    public Lizard(String name) {
        super(name);
    }

    @Override
    public Outcome compareTo(Element other) {
        Outcome outcome = null;

        //Rock crushes Lizard - lose
        //Lizard eats Paper - win
        //Scissors decapitate Lizard - lose
        //Lizard equals Lizard - tie
        //Lizard poisons Spock - win
        switch (other.getName()) {
            case "Rock":
                outcome = new Outcome("Rock crushes Lizard", "Lose");
                break;
            case "Paper":
                outcome = new Outcome("Lizard eats Paper", "Win");
                break;
            case "Scissors":
                outcome = new Outcome("Scissors decapitate Lizard", "Lose");
                break;
            case "Lizard":
                outcome = new Outcome("Lizard equals Lizard", "Tie");
                break;
            case "Spock":
                outcome = new Outcome("Lizard poisons Spock", "Win");
                break;
        }

        return outcome;
    }
}
