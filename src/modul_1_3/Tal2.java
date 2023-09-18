package modul_1_3;
/*
Skriv et program, hvori
1. En heltallig variabel ved navn size initialiseres til en værdi under 30. I
vælger selv den konkrete værdi.
2. Der oprettes et array med en længde som modsvarer værdien af size.
3. Arrayet fyldes op med 3-tabellen. Altså, elementet med indeks n skal have
værdien 3 · n.
4. Et (eller flere) velvalgt(e) element(er) udskrives for at verificere korrektheden.
*/
public class Tal2 {
    public static void main(String[] args) {
        int size = 25;
        int[] arraySize = new int[size];
        int i;
        for (i=0; i < size; i++) {
            arraySize[i] = (i+1)*3;
        }
        for (int j = 0; j < size; j++) {
            System.out.println(arraySize[j]);
        }
    }
}
