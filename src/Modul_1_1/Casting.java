package Modul_1_1;

/*
4.5 Casting
Når vi godt vil konvertere mellem int værdier og long værdier skal der udføres
et cast. Men, hvornår er det at dette cast skal gøres eksplicit, og hvornår må
det være implicit?
• Hvorved adskilder int og long sig?
• Prøv at skrive et program der (i) erklærer i som en int variabel, (ii)
tildeler den en værdi, (iii) erklærer l som en long variabel, (iv) tildeler
værdien af i til l, og (v) slutteligt tildeler værdien af l til i.
• Eksperimentér med hvor det er nødvendigt at have eksplicitte casts.
• Gør nu det samme med en float variabel f og en double variabel d.
• Eksperimentér igen med hvor det er nødvendigt at have eksplicitte casts.
• Afhænger resultatet af disse eksperimenter af den værdi som I initielt
tildeler den første variabel?
 */

public class Casting {
    public static void main(String[] args) {
        int i = 26;
        long l;
        l = i;
        System.out.println("\ninteger i implicitly converted to long is: " + l);
        i = (int)l;
        System.out.println("long l explicitly converted to int is: " + i);
        System.out.println("\nVed at foretage et eksplicit cast fortæller man oversætteren at man påtager sig ansvaret\n" +
                "for sådanne tab af præcision.");

        // "java: incompatible types: possible lossy conversion from long to int": hvis ikke den castes med (int)
        // Ved at foretage et eksplicit cast fortæller man oversætteren at man påtager sig ansvaret
        //for sådanne tab af præcision.
        float f = 2.3f;
        double d;
        d= f;
        System.out.println("\nfloat f implicitly converted to double is: " + d);
        f = (float)d;
        System.out.println("double d explicitly converted to float is: " + f);
        System.out.println("\nThere is a loss of precision when the convertion is taking place,\nbut that is due to the binary system!");
    }
}
