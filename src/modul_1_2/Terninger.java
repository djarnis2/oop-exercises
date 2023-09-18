package modul_1_2;
/*
7.4 Terninger
Skriv et program, hvori
1. Værdien af et terningeslag er gemt i en variabel ved navn dice.
• Hvilken type giver det mening at erklære variablen som?
• Vælg selv en specifik værdi.
2. Opret en boolsk variabel og tildel den en værdi der repræsenterer hvorvidt
værdien fra variablen dice er lige og større end 3.
3. Udskriv den værdien af denne boolske variabel.
 */

public class Terninger {
    public static void main(String[] args) {
        int dice = 4;
        boolean evenAndGreaterThanThree = dice%2==0 && dice>3;
        System.out.println(evenAndGreaterThanThree);
    }
}
