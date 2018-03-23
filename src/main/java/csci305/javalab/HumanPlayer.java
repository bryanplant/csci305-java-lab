package main.java.csci305.javalab;

import java.util.Scanner;

public class HumanPlayer extends Player{

    public HumanPlayer(String name) {
        super(name);
    }

    @Override
    public Element play() {
        Scanner in = new Scanner(System.in);
        int selection = -1;
        Element move = null;

        System.out.println("(1) : Rock");
        System.out.println("(2) : Paper");
        System.out.println("(3) : Scissors");
        System.out.println("(4) : Lizard");
        System.out.println("(5) : Spock");
        while (selection == -1) {
            System.out.println("Enter your move: ");

            selection = Integer.parseInt(in.nextLine());

            if (selection < 1 || selection > 5) {
                System.out.println("Invalid move. Please try again");
                selection = -1;
            }
        }

        switch(selection) {
            case 1:
                return new Rock("Rock");
            case 2:
                return new Paper("Paper");
            case 3:
                return new Scissors("Scissors");
            case 4:
                return new Lizard("Lizard");
            case 5:
                return new Spock("Spock");
        }

        return move;
    }
}
