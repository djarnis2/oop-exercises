package Modul_1_3;

public class Tal2 {
    public static void main(String[] args) {
        int size = 25;
        int[] arraySize = new int[size];
        int i;
        for (i=0; i < size; i++) {
            arraySize[i] = (i+1)*3;
        }
        System.out.println(arraySize[5]);
    }
}
