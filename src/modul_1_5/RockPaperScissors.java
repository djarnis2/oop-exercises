package modul_1_5;

/*
I denne øvelse skal vi arbejde med en Scanner. Dette er noget der på baggrund af en sekvens af input tegn
(fx fra ens keyboard) kan fortolke delelementer – fra starten af denne sekvens som forskellige datatyper.
Ved succesfuld fortolkning fjernes de behandlede elementer fra denne sekvens, sådan at man kan gå i gang med
at behandle resten. Specifikt, erklæres der en Scanner variabel af navn scanner hvorigennem man eksempelvis kan:
• Læse et heltal med scanner.nextInt().
• Læse en linje med scanner.nextLine().

I denne øvelse har følgende delopgaver:
1. Hvordan virker den?
<indsamler et tal, 0,1 eller 2 kan bruges, hvis andet crasher programmet>

2. Hvilke to ting kan der gå galt?
<InputMismatchException if input is not a number. ArrayIndexOutOfBoundsException if input is not 0, 1 or 2>

I de resterende delopgaver kan du fokusere
på én af dem.
3. Verificer at du har ret ved at give programmet de rette inddata.
4. Hvad er den rigtige måde at håndtere denne situation på?
5. Lav en udgave af koden der implementerer dette fix.

 */

import java.util.InputMismatchException;
import java.util.Scanner; import java.util.Random;
class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] choices = {"rock", "paper", "scissors"};
        int player_number=40, computer_number;
        while (true) {



            try {
                System.out.println("Please enter your choice of rock (0), paper (1) or scissors (2):");
                player_number = scanner.nextInt();

                System.out.println("Player plays "+choices[player_number]);




            }
            catch (InputMismatchException | ArrayIndexOutOfBoundsException | NullPointerException e) {
                System.out.println("Wrong input");
                player_number = 40;
                scanner.next();
            }


// computer play
            computer_number = (int)(Math.random()*3);
            System.out.println("Computer plays "+choices[computer_number]);

// outcome
            if (player_number != 40)
                switch (10 * player_number + computer_number) {
                    case 00, 11, 22 -> System.out.println("That's a draw!");
                    case 02, 10, 21 -> System.out.println("You win!");
                    case 20, 01, 12 -> System.out.println("You loose!");
                    default -> {
                        System.out.println("Internal error :-(");
                        System.out.println("- Player chose:" + player_number);
                        System.out.println("- Computer chose:" + computer_number);
                    }
                }






            System.out.println("Let's play again ...");
        }
    }
}
