package main.java.csci305.javalab;

import java.util.Random;

public class RandomBot extends Player{

    public RandomBot(String name) {
        super(name);
    }

    @Override
    public Element play() {
        Random rand = new Random();
        switch(rand.nextInt(5)) {
            case 0:
                return new Rock("Rock");
            case 1:
                return new Paper("Paper");
            case 2:
                return new Scissors("Scissors");
            case 3:
                return new Lizard("Lizard");
            case 4:
                return new Spock("Spock");
        }
        return null;
    }
}
