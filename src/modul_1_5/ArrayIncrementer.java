package modul_1_5;
/*
I denne øvelse skal du:
1. Oversæt og udfør ovenstående kode.
2. Hvilken exception bliver kastet?
<ArrayIndexOutOfBoundsException>

3. Hvad forårsager at denne exception bliver kastet?
<At index 5 the index is out of bounds, the index goes from 0 to 4 inclusive>

4. Brug en try-catch konstruktion til at skippe de iterationer der kaster
denne exception.

5. Er dette den korrekte løsning på problemet, og hvorfor?
<Denne løsning for programmet til at virke og sender en besked om at index blev overskredet, men måske skal
der andre rettelser til.>

 */
class ArrayIncrementer {
    public static void main(String[] args) {
        int iterationer = 10;
        int[] array = {1, 2, 3, 4, 5};
// increment
        try {
            for (int i = 0; i < iterationer; i++) {
                array[i]++;
            }
        }
        catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Index is out of bounds");
            }


// print
            for (int i = 0; i < array.length; i++) {
                System.out.println(array[i]);

        }
    }
}



