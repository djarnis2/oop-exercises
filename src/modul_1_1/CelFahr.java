package modul_1_1;

/*
6.3 Celcius til Fahrenheit
Skriv et program, hvori
1. En temperatur angives i Celcius via en variabel.
2. Denne temperatur konverteres til Fahrenheit og gemmes i en anden variabel.
• Formel: TF = 32 + 9
3. Konverteringen udskrives på en passende måde.
 */

public class CelFahr {
    public static void main(String[] args) {
        double cel = 23.6;
        double fahr;
        fahr = cel*(9/5)+32;
        System.out.println("The temperature " + cel +"\u00b0C is the same as " + fahr + " in Fahrenheit!");
    }
}