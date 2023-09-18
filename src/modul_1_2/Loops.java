package modul_1_2;
/*
9 Loops
9.1 Celcius til Fahrenheit
Skriv et program, hvori
• Der udskrives en tabel af matchende Celcius og Fahrenheit værdier.
– Formel: TF = 32 + 9/5 TC
• Der skal være ét sæt matchende værdier per linje.
• Listen skal starte med -5◦C og slutte ved 40◦C.
• Listen skal have én linje for hver 0,5◦C.
9.2 Celcius til Fahrenheit i Omvendt Rækkefølge
Omskriv programmet fra opgave 9.1 til at vende rækkefølgen om sådan at første
linje udskriver 40◦C og sidste -5◦C.
9.3 Celcius til Fahrenheit Alternativer
Lav to andre udgaver af programmet fra opgave 9.1, hvori loopet omskrives til
hver af de to resterende typer af loops.
 */

public class Loops {
    public static void main(String[] args) {

        // 9.1

        System.out.println(" ");
        System.out.println(" ");
        System.out.println("--------9.1---------");
        System.out.println(" ");
        System.out.println("Celsius   Fahrenheit");
        System.out.println("--------------------");
        for (double cel = -5.0; cel <= 40; cel += 0.5) {
            System.out.printf("%6.2f %10.2f", cel, cel * (9 / 5) + 32);
            System.out.println();
        }

        // 9.2

        System.out.println(" ");
        System.out.println(" ");
        System.out.println("--------9.2---------");
        System.out.println(" ");
        System.out.println("Celsius   Fahrenheit");
        System.out.println("--------------------");
        for (double cel = 40.0; cel >= -5; cel -= 0.5) {
            System.out.printf("%6.2f %10.2f", cel, cel * (9 / 5) + 32);
            System.out.println();
        }

        // 9.3 Do - While

        System.out.println(" ");
        System.out.println(" ");
        System.out.println("--------9.3---------");
        System.out.println(" ");
        System.out.println("Celsius   Fahrenheit");
        System.out.println("--------------------");


        double cel = -5.0;

        do {
            System.out.printf("%6.2f %10.2f", cel, cel * (9 / 5) + 32);
            System.out.println();
            cel += 0.5;
        }
        while (cel <= 40);


        // 9.4 While

        cel = -5.0;
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("--------9.4---------");
        System.out.println(" ");
        System.out.println("Celsius   Fahrenheit");
        System.out.println("--------------------");
        while (cel <= 40.0)
        {
            System.out.printf("%6.2f %10.2f", cel, cel * (9 / 5) + 32);
            System.out.println();
            cel += 0.5;
        }

    }
}











