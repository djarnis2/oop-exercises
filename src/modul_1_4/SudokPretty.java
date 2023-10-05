package modul_1_4;
/*
11.3 Sudoku Prettyprinter
Følgende datastruktur repræsenterer en udfyldt sudoku plade:
int[][] puzzle = {
{7, 3, 6, 4, 5, 2, 9, 8, 1},
{1, 9, 8, 6, 3, 7, 4, 5, 2},
{4, 2, 5, 9, 8, 1, 3, 7, 6},
{3, 6, 4, 5, 2, 8, 1, 9, 7},
{9, 5, 2, 7, 1, 4, 6, 3, 8},
{8, 1, 7, 3, 9, 6, 2, 4, 5},
{2, 8, 9, 1, 7, 3, 5, 6, 4},
{6, 7, 3, 2, 4, 5, 8, 1, 9},
{5, 4, 1, 8, 6, 9, 7, 2, 3},
};
Skriv et program, hvori
1. Ovenstående datastruktur er defineret.
2. En metode er defineret der som parameter tager en sådan struktur og
skriver den ud på skærmen.
22
• Hvilken prototype (i.e., returværdi og signatur) skal denne metode
have?
• Skal man udprinte en række af gangen eller en søjle af gangen?
• Hint: Metoden System.out.print gør det samme som System.out.println
men undlader at bryde linjen.
3. En main metode kalder denne metode.

 */

public class SudokPretty {
    public static void main(String[] args) {

        int[][] puzzle = {
                {7, 3, 6, 4, 5, 2, 9, 8, 1},
                {1, 9, 8, 6, 3, 7, 4, 5, 2},
                {4, 2, 5, 9, 8, 1, 3, 7, 6},
                {3, 6, 4, 5, 2, 8, 1, 9, 7},
                {9, 5, 2, 7, 1, 4, 6, 3, 8},
                {8, 1, 7, 3, 9, 6, 2, 4, 5},
                {2, 8, 9, 1, 7, 3, 5, 6, 4},
                {6, 7, 3, 2, 4, 5, 8, 1, 9},
                {5, 4, 1, 8, 6, 9, 7, 2, 3},
        };

        prettyPrint(puzzle);
    }

    public static void prettyPrint(int[][] sudokuplade) {
        System.out.printf("%23S", "SUDOKU\n");
        System.out.println("----------------------------------------");

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.printf("%4d", sudokuplade[i][j]);
                if (j == 8) {
                    System.out.println(" ");
                }
            }
        }
    }
}










