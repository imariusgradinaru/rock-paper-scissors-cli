import model.exception.RockPaperScissorsException;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

    public static void main(String[] args) {
        System.out.println("Rock, Paper, Scissors!");
        System.out.println();
        System.out.println("What is your choice?");
        System.out.println("1 for ROCK, 2 for PAPER, 3 for SCISSORS;");
        System.out.println("Select your option to play: ");

        Options userChoice = getUserChoice();
        System.out.println(userChoice);
//        Options computerChoice = getComputerChoice();
//
//        calculateWinner(userChoice, computerChoice);

    }

    public static Scanner scanner = new Scanner(System.in);

    public static Options getUserChoice() {
        while (scanner.hasNextInt()) scanner.next();
        try {
            int userChoiceIndex = scanner.nextInt();
            return Options.getOptionByIndex(userChoiceIndex);
        }
        catch (Exception e) {
            System.out.println("You should enter a valid option ( 1 - ROCK, 2 - PAPER, 3 - SCISSORS )");
            return getUserChoice();
        }
    }

    public static Options getComputerChoice() {
        Random random = new Random();
        int computerChoice = random.nextInt((3) + 1);
        return Options.getOptionByIndex(computerChoice);
    }

//    public static void calculateWinner(int userChoice, int computerChoice) {
//        if (getComputerChoice() == getUserChoice()) {
//            System.out.println("It's a tie!");
//        }
//        if (getComputerChoice() == 1 && getUserChoice() == 2 || getComputerChoice() == 2 && getUserChoice() == 3 || getComputerChoice() == 3 && getUserChoice() == 1) {
//            System.out.println("You won!");
//        }
//        if (getComputerChoice() == 1 && getUserChoice() == 3 || getComputerChoice() == 2 && getUserChoice() == 1 || getComputerChoice() == 3 && getUserChoice() == 2) {
//            System.out.println("Computer Won");
//        }
        }
//    }
//}
