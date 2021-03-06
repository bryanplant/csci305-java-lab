package csci305.javalab;

import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

//Player that is controlled by a human
public class HumanPlayer extends Player{

    //create a Human Player with its name and map of valid moves
    HumanPlayer(String name, Map<String, Element> moves) {
        super(name, moves);
    }

    //prompt the user to select a valid move to play
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

            try {
                selection = in.nextInt();

                switch (selection) {
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
                    default:
                        throw new InputMismatchException();
                }
            }
            //catch an exception if wrong input type or int is not between 1 and 5
            catch(InputMismatchException e) {
                System.out.println("Invalid input. Try Again.");
                in.nextLine();
                selection = -1;
            }
        }
        System.out.println();
        return currentPlay;
    }
}
