package csci305.javalab;

//represents outcome of Element compareTo method
public class Outcome {
    private String info; //describes outcome e.g. "Scissors cuts paper"
    private String outcome; //win, tie or loss

    // create an Outcome with info and an outcome
    Outcome(String info, String outcome) {
        this.info = info;
        this.outcome = outcome;
    }

    public String getInfo() {
        return info;
    }

    public String getOutcome() {
        return outcome;
    }

    @Override
    public String toString() {
        return info + " -- " + outcome;
    }
}
