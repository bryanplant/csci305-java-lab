package csci305.javalab;

import java.util.Map;
import java.util.Scanner;

public class HumanPlayer extends Player{

    HumanPlayer(String name, Map<String, Element> moves) {
        super(name, moves);
    }

    @Override
    public Element play() {
        Scanner in = new Scanner(System.in);
        int selection = -1;

        System.out.println("(1) : Rock");
        System.out.println("(2) : Paper");
        System.out.println("(3) : Scissors");
        System.out.println("(4) : Lizard");
        System.out.println("(5) : Spock");
        while (selection == -1) {
            System.out.print("Enter your move: ");

            selection = in.nextInt();

            if (selection < 1 || selection > 5) {
                System.out.println("Invalid move. Please try again");
                selection = -1;
            }
        }

        switch(selection) {
            case 1:
                currentPlay = moves.get("Rock");
                break;
            case 2:
                currentPlay = moves.get("Paper");
                break;
            case 3:
                currentPlay = moves.get("Scissors");
                break;
            case 4:
                currentPlay = moves.get("Lizard");
                break;
            case 5:
                currentPlay = moves.get("Spock");
                break;
        }
        System.out.println();
        return currentPlay;
    }
}
