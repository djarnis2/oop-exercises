package modul_1_1;

/*
Undersøg hvordan følgende stykke kode fungerer ved at modificere indholdet af
strengen i den sidste linje:
int i = 42;
long l = 56;
float f = 3.14159;
double d = 3.14159*10;
System.out.printf("i=%d l=%,4d f=%f d=%6.2f", i, l, f, d);
 */
public class Printf {
    public static void main(String[] args) {
        int i = 42;
        long l = 56;
        float f = 3.14159f;
        double d = 3.14159*10;
        double e = 0.0000000045;
        System.out.printf("i=%d l=%,4d f=%f d=%6.2f", i, l, f, d);
        System.out.println(" ");
        System.out.printf("i=%,4d l=%,4d f=%f d=%6.2f", i, l, f, d);
        System.out.println(" ");
        System.out.printf("i=%d l=%,4d f=%f d=%6.2f e=%1.2g", i, l, f, d, e);

    }

}
