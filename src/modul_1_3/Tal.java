package modul_1_3;
/*
Skriv et program, der finder det største tal i et array af typen int[], og udskriver
indeks for dette tal. Find selv på noget passende indhold til dette array.
*/
public class Tal {
    public static void main(String[] args) {
        int[] tal = {7,8,56,812,4,75,8,321};
        int i;
        int greatestNum = tal[0];
        for (i = 0; i < tal.length; i++) {
            if (tal[i] > greatestNum)
                greatestNum = tal[i];
        }
        System.out.println(greatestNum);
    }
}
