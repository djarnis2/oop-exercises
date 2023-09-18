package modul_1_1;

/*4.4 Heltallige Grænser
1. Hvilke heltallige datatyper kan man benytte sig af i Java?
2. Vælg én af dem.
3. Skriv et program der eksperimentelt afslører hvad der sker når man
   overskrider den størst mulige værdi.
4. Beskriv hvad det er I observerer?
Datatype    Mulige      værdier:                     Plads
byte        Heltal:     -128 til 127                8 bit
short       Heltal:     -32768 til 32767            16 bit
int         Heltal:     -2147483648 til 2147483647  32 bit
long        Heltal:     -9223372036854775808 til
                        9223372036854775807         64 bit
float       Decimal:    7 betydende cifre†          32 bit
double      Decimal:    15 betydende cifre†         64 bit
char        Tegn: A, i. Et unicode tegn*            16 bit
boolean     true / false                            8 bit
*/

public class Integers {
    public static void main(String[] args) {
        int veryHigh = 2147483647 +1;
        System.out.println("");
        System.out.println("This is a big number: ");
        System.out.println(veryHigh);
        System.out.println("");

        //int tooHigh = 2147483648;
        //System.out.println(tooHigh);

        System.out.println("If you make the program print out the highest number (2147483647) + 1");
        System.out.println("instead it prints the lowest number -2147483648");
        System.out.println("- If you instead ask it to print out directly 2147483648");
        System.out.println("you get an error message \"java: integer number too large\"");
        System.out.println(" \n");
        System.out.println("The integer int has a memory that is 2^32 big, ");
        System.out.println("half of these are negative and half are positive including 0.");
        System.out.println("-So the highest number an int can be is (2^32)/2-1");

    }
    // If you print out the highest number (2147483647) + 1
    // it prints the lowest number -2147483648
    // If you instead ask it to print out directly 2147483648
    // you get an error message "java: integer number too large"
}
