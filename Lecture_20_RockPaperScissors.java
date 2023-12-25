import java.util.Random;
import java.util.Scanner;

public class Lecture_20_RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] moves = {"rock", "paper", "scissors"};

        while (true) {
            System.out.println("Enter your move (rock, paper, scissors, or quit):");
            String playerMove = scanner.nextLine().toLowerCase();

            if (playerMove.equals("quit")) {
                break;
            }

            int computerMoveIndex = random.nextInt(moves.length);
            String computerMove = moves[computerMoveIndex];

            System.out.println("You chose: " + playerMove);
            System.out.println("Computer chose: " + computerMove);

            if (playerMove.equals(computerMove)) {
                System.out.println("It's a tie!");
            } else if (
                    (playerMove.equals("rock") && computerMove.equals("scissors")) ||
                            (playerMove.equals("paper") && computerMove.equals("rock")) ||
                            (playerMove.equals("scissors") && computerMove.equals("paper"))
            ) {
                System.out.println("You win!");
            } else {
                System.out.println("Computer wins!");
            }
        }

        System.out.println("Thanks for playing!");
    }
}

