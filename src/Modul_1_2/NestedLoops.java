package Modul_1_2;

/*
This loop takes a number and multiplies with it, to a max of the number squared.
counting up to 10.
So output is: [1],[2,4],[3,6,9],[4,8,12,16]......[10,20,...100]
 */

public class NestedLoops {
    public static void main(String[] args) {
        for (int y=1 ; y<=10 ; y++) {
            System.out.println("Outer Loop...");
            System.out.println("y is: " +y);
            for (int x=1 ; x<=y ; x++) {
                System.out.println(" ");
                System.out.println("Inner Loop...");

                System.out.println("x is: " +x);
                System.out.print("x * y is: ");
                System.out.printf("%10d", x*y);
                System.out.println(" ");


            }
            System.out.println("");
        }

    }
}
