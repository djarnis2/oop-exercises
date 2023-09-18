package modul_1_1;

/*
Skriv et program hvori
1. Et antal sekunder siden et bestemt tidspunkt (fx 1. Januar 1970) gemmes
i en variabel.
2. Konvertér dette tal til et helt antal år (lad os antage at der er 365 dage
på et år) og et antal hele dage indenfor det sidste år. Lægges disse to tal
sammen skal resultatet altså være indenfor 24 timer af udgangspunktet.
3. Udskriv disse to tal.
Verificér at programmet virker.
 */

public class Seconds {
    public static void main(String[] args) {
        int manySecsSinceJan_1_1970 = 1_000_000_000;
        int secsInADay = 24*60*60;
        int days = manySecsSinceJan_1_1970 / secsInADay;
        int years = days / 365;
        int remainingDays = ( days % 365 );
        System.out.println("If you were ever thinking, how much time, in years and days, is " + manySecsSinceJan_1_1970 + " seconds???...");
        System.out.println("I just coincidentally calculated it to be: " + years + " years and " + remainingDays + " days!!!");
    }
}
