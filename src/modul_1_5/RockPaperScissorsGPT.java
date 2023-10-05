package modul_1_5;

import java.util.Scanner;
import java.util.InputMismatchException;

class RockPaperScissorsGPT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] choices = {"rock", "paper", "scissors"};
        int player_number, computer_number;

        while (true) {
            // human play
            System.out.println("Please enter your choice of rock (0), paper (1), or scissors (2):");

            try {
                player_number = scanner.nextInt();
                System.out.println("Player plays " + choices[player_number]);
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid integer between 0 and 2.");
                scanner.next(); // Fjern ugyldigt input fra scannerens buffer
                continue; // Start loop igen for ugyldigt input
            }

            // Resten af spillet (computerens træk og resultater)

            System.out.println("Let's play again ...");
        }
    }
}

