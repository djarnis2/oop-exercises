package Modul_1_2;

/*
8 Branches
8.1 Epoch
Skriv et program, hvori
1. I tager udgangspunkt i opgaven fra afsnit 6.4.
2. I erklærer en variabel hvis værdi repræsenterer et antal sekunder siden
nytår.
3. På baggrund af værdien af denne variabel udregner I hvilken måned og
hvilken dag der er tale om (I kan gå ud fra at alle måneder er 30 dage
lange).
4. Udskriv “Det er jul!” hvis det er tilfældet (det er jul den 24. December).
 */
public class Epoch1 {
    public static void main(String[] args) {
        int secs = 30585600;
        double days = secs/(24*60*60);
        double month = days/30;
        double leftoverdays = days%30;
        boolean _IsXmas =  (int)month == 11 && (int)leftoverdays == 24;

        System.out.println(secs + " seconds is equal to " + (int)month + " months and " + (int)leftoverdays + " days...");
        if (_IsXmas) {
            System.out.println("...and it is X-Mas!!!");
        }


    }
}




