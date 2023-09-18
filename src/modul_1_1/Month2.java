package modul_1_1;

/*
6.5 Inkrementering af Måned
Skriv et program, hvori
1. En heltallig variabel bruges til at repræsentere en måned.
2. Denne variabel tildeles en værdi (du vælger selv).
3. Udskriv variablens værdi.
4. Forøg værdien af denne variabel med en halv.
5. Udskriv variablens værdi.
6. Forøg værdien af denne variabel med en halv.
7. Udskriv variablens værdi.
Få dette program til at oversætte, kør det og beskriv hvad du observerer.
Forklar hvorfor programmet opfører sig sådan.
 */

public class Month2 {
    public static void main(String[] args) {
        int month = -6;
        System.out.println(month);
        month = (int)(month - 0.5);

        System.out.println(month);
        month = (int)(month - 0.5);
        System.out.println(month);
        System.out.println("int rounds down to the \"numerically\" nearest whole number");




    }
}