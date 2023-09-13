package Modul_1_1;

/*
6.7 Daglige Differencer
Skriv et program, der givet 7 dagstemperaturer udregner og udskriver
temperaturdifferencen mellem alle to på hinanden følgende dage
(dvs. Tirsdag-Mandag, Onsdag-Tirsdag . . . Søndag-Lørdag).
Dagstemperaturerne kunne være:
• Mandag: 21.5
• Tirsdag: 23.7
• Onsdag: 19.6
• Torsdag: 22.5
• Fredag: 25.3
• Lørdag: 21.7
• Søndag: 18.9
 */

public class Temperature2 {
    public static void main(String[] args) {
        double mandag = 21.5;
        double tirsdag = 23.7;
        double onsdag = 19.6;
        double torsdag = 22.5;
        double fredag = 25.3;
        double lørdag = 21.7;
        double søndag = 18.9;
        System.out.println("Today the temperature is " + (tirsdag - mandag) + " \u00b0C different from mandag");
        System.out.println("Today the temperature is " + (onsdag - tirsdag) + " \u00b0C different from tirsdag");
        System.out.println("Today the temperature is " + (torsdag - onsdag) + " \u00b0C different from onsdag");
        System.out.println("Today the temperature is " + (fredag - torsdag) + " \u00b0C different from torsdag");
        System.out.println("Today the temperature is " + (lørdag - fredag) + " \u00b0C different from fredag");
        System.out.println("Today the temperature is " + (søndag - lørdag) + " \u00b0C different from lørdag");
    }
}
