package modul_1_3;

/*
Skriv et program, hvori
1. En variabel initialiseres til at være et array der indeholder antallet af dage
i hver af de 12 måneder i et normalt år. Det første element vil da indeholde
antallet af dage i Januar.
2. En anden variabel initialiseres til at være et array der indeholder antallet
af dage i hver af de 12 måneder i et skudår.
3. Gennemløb årene 2000 til 2020:
(a) Brug en ny variabel af samme type som de to forregående til at holde
styr på hvilket array der er korrekt for det aktuelle år.
• Hvor meget data bliver der kopieret her?
• Hint: Vi kan i denne opgave tillade os at forsimple skudårsreglerne til at det er skudår hvis 4 går op i årstallet.
(b) For hvert år udskrives indholdet af det array som den sidste variabel
peger på.
*/
public class Kalender {
    public static void main(String[] args) {
        int[] normalYear = {31,28,31,30,31,30,31,31,30,31,30,31};
        int[] leapYear = {31,29,31,30,31,30,31,31,30,31,30,31};
        boolean[] is_leap_year = new boolean[2021-2000];

        for (int i = 2000; i < 2021; i++) {
            if (i % 4 == 0) {
                is_leap_year[i-2000] = true;
            }
        }
        int testyear = 2016;
        if (!is_leap_year[testyear-2000]) {
            System.out.println("The year " + testyear + " is not a leapyear!");
            System.out.println("The month of february is " + normalYear[1] + " days long!");

        }
        else {
            System.out.println("The year " + testyear + " is a leapyear!!!");
            System.out.println("The month of february is " + leapYear[1] + " days long!");
        }

        // year = 2011 is year[11]

    }
}