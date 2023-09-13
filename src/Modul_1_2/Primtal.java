package Modul_1_2;

/*
9.5 Primtal
Skriv et program, der udregner alle primtal under 1.000.000, og udskriver det
største.
Hints (se bort fra følgende hints hvis I er friske på en udfordring):
• Benyt en del-og-hersk strategi, hvor I ser opgaven som tre delopgaver:
– Gennemløb alle positive heltal under 1.000.000. Har vi ikke en konstruktion der kan det?
– Bestem om et givent positivt heltal er et primtal.
– Udprint et heltal (hvis det altså er et primtal).
• Et positivt heltal er et primtal hvis, og kun hvis, der ikke er andre heltal
end 1 der går op i det.
• For at bestemme om et givent positivt heltal er et primtal kan I endnu
engang benytte del-og-hersk:
1. Opret en variable af typen boolean ved navn is_prime som er True.
2. Gennemløb alle heltal fra og med 2 til (men ikke med) 1.000.000.
3. For hvert af disse tal skal I checke om dette tal går op i det potentielle
primtal. Gør de det, så sættes is_prime til False. Men hvordan
undersøger man om ét tal går op i et andet?
– Man prøver det da!
– Hvis en heltalsdivision går op er det ikke nogen rest og en modulo
operation (via operatoren %) giver nul.
– Alternativt kan man udnytte at en heltalsdivision kommer til
at foretage en afrunding hvis divisionen ikke går op sådan at
(a/b) · b ̸= a.
4. Herefter repræsenterer is_prime en sandhedsværdi for hvovidt et tal
er et primtal.
 */

import java.util.ArrayList;
import java.util.List;

// WARNING this program takes 11 minutes to run !!!

public class Primtal {
    public static void main(String[] args) {

        boolean is_prime = true;
        int i;
        int j;
        List<Integer> primes = new ArrayList<Integer>();
        outerloop:
        for (i = 1; i < 1_000_000; i++) {
            //System.out.println("i = " + i);
            for (j = i ; j > 1; j--) {
                //System.out.println("j = " + j);
                //System.out.println("i%j = " + i % j + " when i = " + i + " j = " + j);
                if ((i % j == 0) && i != j) {
                    is_prime = false;
                    continue outerloop;
                }
            }
            //System.out.println("PRIME" + i + " when i = " + i + " and j = " + j);
            primes.add(i);
        }
        System.out.println(primes);
        System.out.println(primes.size());
        int last = primes.get(primes.size() - 1);
        System.out.println("Highest prime is: " + last);
    }
}


