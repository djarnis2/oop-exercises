package Modul_1_1;

/*Skriv et program der udregner og udskriver arealet (π · r
        2
        ) af tre cirkler med
        radius på hhv. 1, 3 og 5.
        */

public class Cirkler {
    public static void main(String[] args) {
        int r1 = 1;
        int r2 = 3;
        int r3 = 5;
        System.out.println("The area of a circel with the radius " + r1 + " is " + r1*r1*Math.PI);
        System.out.println("The area of a circel with the radius " + r2 + " is " + r2*r2*Math.PI);
        System.out.println("The area of a circel with the radius " + r3 + " is " + r3*r3*Math.PI);
        /*
        6.2 Sum af Areal af Cirkler
        Skriv et program der udregner og udskriver omkredsen (2 · π · r) af tre cirkler
        med radius på hhv. 1, 3 og 5, og afslutter med at udskriven summen af disse.
         */
        System.out.println("The circumference of a circel with the radius " + r1 + " is " + r1*2*Math.PI);
        System.out.println("The circumference of a circel with the radius " + r2 + " is " + r2*2*Math.PI);
        System.out.println("The circumference of a circel with the radius " + r3 + " is " + r3*2*Math.PI);

    }
}
