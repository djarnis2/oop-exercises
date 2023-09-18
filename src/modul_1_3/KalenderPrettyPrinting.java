package modul_1_3;
/*
10.13 Kalender Prettyprinting
Lav et program, hvori
1. Der oprettes en datastruktur til at holde en kalender der spænder ét år.
Man skal kunne indeksere ind med en dato (måned + dag) og få en dag
(fx Mandag).
• Hvad er typen af denne datastruktur?
• Hvordan initialiseres en variabel af denne type?
• Hvordan kan man sørge for at indholdet er korrekt?
2. Udskriv denne datastruktur på en “pæn” måde.
*/

public class KalenderPrettyPrinting {
    public static void main(String[] args) {
        int[][] calender = {
                {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31},
                {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28},
                {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31},
                {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30},
                {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31},
                {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30},
                {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31},
                {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31},
                {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30},
                {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31},
                {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30},
                {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31}};


        int month = 10;
        int day = 24;
        int weekday = 0;
        outerloop:
        for (int y = 0; y < month; y++) {
            for ( int x = 0; x < calender[month].length; x++) {
                weekday += 1;
                if ((y == month-1) && x == day) {
                    break outerloop;
                }
            }
        }


        String dayOfTheWeek = " ";
        switch (weekday%7) {
            case 0:
                dayOfTheWeek = "Monday";
                break;
            case 1:
                dayOfTheWeek = "Tuesday";
                break;
            case 2:
                dayOfTheWeek = "Wednesday";
                break;
            case 3:
                dayOfTheWeek = "Thursday";
                break;
            case 4:
                dayOfTheWeek = "Friday";
                break;
            case 5:
                dayOfTheWeek = "Saturday";
                break;
            case 6:
                dayOfTheWeek = "Sunday";
                break;
        }



        System.out.println("The weekday of the " + month + "s month and the " + day + " day is: " + dayOfTheWeek );
    }


}



