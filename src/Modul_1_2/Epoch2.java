package Modul_1_2;

/*
8.2 Epoch Diff
Udvid opgaven fra afsnit 8.1 til – hvis det ikke er jul – at udskrive hvor lang tid
man skal vente på at det bliver jul.
8.3 Juleudsalg
Skriv et program, hvori
1. En variabel oprettes (erklæres) og initialiseres til værdien 21816000. Dette
tal repræsenterer et antal sekunder siden nytår (alle måneder antages at
være 30 dage lange).
2. En anden variabel indeholder en pris på 599,95 dkr.
3. Der skal gives et 30% tilskud hvis det er Jul. Find selv på en fornuftig
definition af hvornår det er Jul.
4. Udregn den gældende pris (eventuelt tilskud medregnet) og gem denne i
en variabel.
5. Udskriv denne variabel.
6. Sørg for at teste den logik I har skrevet ved at prøve at tildele den første
variable forskellige andre værdier. Hvilke værdier vil være fornuftige at
teste?
 */


public class Epoch2 {
    public static void main(String[] args) {
        int month = 30 * 24 * 60 * 60;
        int days = month / 30;
        int jul = month * 11 + days * 24;
        int var = 21_816_000;
        double pris = 599.95;
        double julepris = pris - 0.3 * pris;
        int juletid = month * 9 + days * 20; // Juletiden starter d. 20 Okt.



        System.out.println(var + " seconds is the same as " + (int) (var / month) + " month(s) and " +
                (int)(( ((double)var / month) - (int ) (var / month ) )*30) + " day(s) after January 1.");
        System.out.println("There are " + (jul - var) + " seconds until X-mas...that is equivalent to app. "
                + (int)((jul - var) / month) + " months and " + (int)(( ((double)(jul -var) / month) - (int ) ((jul - var) / month ) )*30)
                + " days");
        System.out.println("but....");
        System.out.println("Christmas sale starts in " + (juletid - var) + " seconds...that is equivalent to only "
                + (int)((juletid - var) / month) + " months and " + (int)(( ((double)(juletid -var) / month) - (int ) ((juletid - var) / month ) )*30)
                + " days");
        System.out.println("And then the present you were looking for to buy for yourself is on sale...");
        System.out.print("Instead of " + pris + " kr. it will only cost ...." );
        System.out.printf("%2.2f", julepris);
        System.out.print("kr. !!! Merry X-mas!");

    }
}







