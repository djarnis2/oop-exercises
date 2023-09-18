package modul_1_2;
/*
part one with int rounds off to lower int, therefore only 5 loops
part two with doubles repeats as long as it can record a number in the
memory, of course the loop could go on forever if memory size was not an issue.
double makes 328 iterations, float makes 50.
 */

public class Loop {
    public static void main(String[] args) {
        /*
        int i = 12345;
        do {
            System.out.println(i%10);
            i /= 10;
            System.out.println(i);
        }
        while (i>0);
         */


        int count = 0;
        double i = 12345;
        do {
            System.out.println(i%10);
            i /= 10;
            System.out.println(i);
            count++;
        }
        while (i>0);
        System.out.println("Repeated loop "+count+" times.");


        /*
        int count = 0;
        float i = 12345f;
        do {
            System.out.println(i%10);
            i /= 10;
            System.out.println(i);
            count++;
        }
        while (i>0);
        System.out.println("Repeated loop "+count+" times.");
         */



    }
}
