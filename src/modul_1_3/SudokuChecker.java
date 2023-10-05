package modul_1_3;
/*
10.14 Sudoku Checker
Skriv et program, hvori
• En variabel initialiseres til at indeholde en udfyldt sudokuplade.
– Hvordan skal vi repræsentere et felt der ikke er udfyldt?
<med et nul?>

– Hvad skal typen af denne variabel være?
– Hvordan erklæres den?
<Et nul er default værdien>

– Hvordan kan vi initialisere den?
>altså by default>

– Hint: Find selv en udfyldt (aka: løst) sudoku plade online.
• Skriv kode der vurderer om pladen representerer en korrekt løsning.
– Hint 1: Dette er tilfældet når alle følgende ting er sande:
∗ Samtlige felter er udfyldte.
∗ Der er ingen række med to ens felter. Alternativt: Alle tallene
1-9 eksisterer i samtlige rækker.
∗ Der er ingen søjle med to ens felter. Alternativt: Alle tallene 1-9
eksisterer i samtlige søjler.
∗ Der er ingen 3x3 gruppe med to ens felter. Alternativt: Alle
tallene 1-9 eksisterer i samtlige 3x3 grupper.
Hint 2: Hvis man skal undersøge om tallene 1-9 eksisterer kunne
man jo oprette et boolean[9] array der repræsenterer om tallene er
fundet, initialisere dette til kun at indeholde false værdier, gennemløbe alle tal som er i et felt og sætte indekset med dette nummer
(minus 1) til true. Er der nogen false værdier tilbage er der et
manglende tal og sudokuen er ikke korrekt løst.
• Udskriv resultatet af denne vurdering.
– Giver programmet også det korrekte resultat hvis man giver det en
forkert udfyldt sudoku plade?
 */

public class SudokuChecker {
    public static void main(String[] args) {

        int[][] sudoku = {
                {0, 2, 3, 4, 5, 9, 6, 7, 8},
                {4, 5, 6, 8, 1, 7, 9, 3, 2},
                {8, 9, 7, 2, 3, 6, 4, 1, 5},
                {2, 1, 5, 3, 6, 8, 7, 9, 4},
                {7, 4, 8, 5, 9, 1, 3, 2, 6},
                {6, 3, 9, 7, 4, 2, 5, 8, 1},
                {9, 8, 4, 6, 2, 3, 1, 5, 7},
                {3, 6, 2, 1, 7, 5, 8, 4, 9},
                {5, 7, 1, 9, 8, 4, 2, 6, 3}};



        System.out.println(Rows(sudoku));
        System.out.println(Columns(sudoku));

    }


    public static boolean Rows(int[][] sRows) {
        int num = 0;
        for (int y = 0; y < 9; y++) {

            for (int x = 0; x < 9; x++) {
                num = sRows[y][x];
                //System.out.println("y is " +y+ " and x is: " + x + " ...when sRows[y][x] = " + sRows[y][x]);

                for (int k = x + 1; k < 9; k++) {
                    //System.out.println("inner loop and k is " + k);
                    //System.out.println("sRows[y][k] is " + sRows[y][k]);

                    if (num == sRows[y][k] || sRows[y][k] == 0) {
                        //System.out.println("k = " + sRows[y][k]);
                        //System.out.println("...num = " + num);
                        System.out.println("Bingo!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
                        return false;


                    }
                    //System.out.println("tjek");

                }
                //System.out.println(rowsCheck);
            }
        }
        return true;
    }

    public static boolean Columns(int[][] sCol) {
        int num = 0;

        for (int z = 0; z < 9; z++) {

            for (int p = 0; p < 9; p++) {
                num = sCol[p][z];
                //System.out.println(num);

                for (int l = p + 1; l < 9; l++) {
                    //System.out.println("inner loop columns");

                    if (num == sCol[l][z] || sCol[l][z] == 0) {
                        //System.out.println("z = " + sCol[l][z]);
                        //System.out.println("...num = " + num);
                        System.out.println("Bingo!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
                        return false;

                    }
                }
            }
        }
        return true;
    }


}









