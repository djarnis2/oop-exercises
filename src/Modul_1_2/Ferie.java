package Modul_1_2;
/*
8.5 Ferie
Undervisningskalenderen fortæller os at der (blandt andet) er følgende ferier:
• Efterårsferie Oktober
• Juleferie December
• Påskeferie April
• Sommerferie Juli + August
Skriv et program, hvori
1. Et månedsnummer gives via en variabel.
2. Afhængigt af indholdet af denne variabel udskrives en feries navn (hvis
der er ferie i måneden) eller “Hårdt arbejde” (hvis der ikke er).
 */
public class Ferie {
    public static void main(String[] args) {
        byte monthNumber = 11;
        switch (monthNumber) {
            case 1,2,3,5,6,9,11:
                System.out.println("Der er kun masser af hårdt arbejde i denne måned!");
                break;
            case 4:
                System.out.println("Du er heldig, der er påskeferie i denne måned...");
                break;
            case 7,8:
                System.out.println("Du er heldig, der er sommerferie i denne måned...");
                break;
            case 10:
                System.out.println("Du er heldig, der er efterårsferie i denne måned...");
                break;
            case 12:
                System.out.println("Du er heldig, der er juleferie i denne måned...");
                break;

            default:
                System.out.println("Der er kun 12 måneder at vælge i mellem.");
        }
    }
}
