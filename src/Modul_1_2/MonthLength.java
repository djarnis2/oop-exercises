package Modul_1_2;
/*
8.4 Længden af en Måned
Skriv et program, hvori
1. En måneds nummer gemmes i en variabel. Denne variabel skal fungere
som input til jeres program.
• Hvilket navn ville være passende for denne variabel?
• Hvilken type ville være passende for denne variabel?
2. Skriv noget kode der bestemer hvor mange dage der er i den måned som udpeges af denne variabels konkrete værdi (vi antager at det ikke er skudår),
og udskriv dette tal.
3. Skriv dette tal ud på skærmen.
4. Overbevis jer selv om at jeres kode er korrekt.
 */

public class MonthLength {
    public static void main(String[] args) {
        byte monthNumber = 10;
        switch (monthNumber) {
            case 1,3,5,7,8,10,12:
                System.out.println("Der er 31 dage i denne måned");
                break;
            case 2:
                System.out.println("Der er 28 dage i denne måned");
                break;
            case 4,6,9,11:
                System.out.println("Der er 30 dage i denne måned");
                break;
            default:
                System.out.println("Der er kun 12 måneder at vælge i mellem.");
        }


    }
}
