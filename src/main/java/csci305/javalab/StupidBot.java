package main.java.csci305.javalab;

public class StupidBot extends Player{

    public StupidBot(String name) {
        super(name);
    }

    @Override
    public Element play() {
        return new Lizard("Lizard");
    }
}
