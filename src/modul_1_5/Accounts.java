package modul_1_5;
/*
I denne øvelse har følgende delopgaver:
1. Hvad sker der hvis man giver dette programmet 3 som input?
    < Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
	at modul_1_5.Accounts.printAccountState(Accounts.java:18)
	at modul_1_5.Accounts.main(Accounts.java:21) >

2. Lav en udgave af koden der ved hjælp af exception handling i metoden
main gør programmet robust over for dette input.

 */
import java.util.Scanner;
public class Accounts {
    static Scanner scanner = new Scanner(System.in);
    static int[] accounts = {903, 716, 67};
    static int getAccountNumber () {
        System.out.println("Enter an account number: ");
        return scanner.nextInt();
    }
    static void printAccountState (int accountid) {
        System.out.println("Account " + accountid + " contains " + accounts[accountid]+""); }
    public static void main(String[] args) {
        while (true) {
            try {
                int accountid = getAccountNumber();
                printAccountState(accountid);
            }
            catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("The account does not exist");

            }

        }
    }
}

