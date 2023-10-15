package modul_2_4;
/*
I følgende program, hvor kan (og bør) variablene i, d, tmp, sum og bonus erklæres?

Hvad sker der hvis en variabel erklæres to gange?

 */
class Scope {
// location 0

    // location 1
    static int doubler (int value) {
// location 2
        int d = value * 2;
// location 3
        return d;
// location 4
    }
    // location 5
    public static void main (String[] args) {
// location 6
        int sum = 0;
        int bonus = 42;
// location 7
        for (/* location 8 */int i=0 ; /* location 9 */ i<100 ; /* location 10 */ i++) {
// location 11
            int tmp = doubler(i);
// location 12
            sum += tmp;
// location 13
        }

// location 14
        System.out.println(sum+bonus);
// location 15
    }
// location 16
}
