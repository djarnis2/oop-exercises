package modul_1_1;
/*
Er en tildeling (af en værdi til en variabel) et expression? Hvordan tester I en hypotese om dette?
 */

public class Exprtest {
    public static void main(String[] args) {
        int var1;
        int var2 = var1 = 42;
        System.out.println(var1);
        System.out.println(var2);
    }
}
