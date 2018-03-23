package main.java.csci305.javalab;

//represents outcome of Element compareTo method
public class Outcome {
    private String info; //describes outcome e.g. "Scissors cuts paper"
    private String outcome; //win, tie or loss

    public Outcome(String info, String outcome) {
        this.info = info;
        this.outcome = outcome;
    }

    @Override
    public String toString() {
        return info + " -- " + outcome;
    }
}
