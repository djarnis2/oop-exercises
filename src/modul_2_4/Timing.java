
package modul_2_4;
import java.lang.*;
public class Timing {
    public static double fun(double x, double y) {
        if (y <= 1) {
            return x;
        } else
            return fun(x, y - 1) * fun(x, y - 1);

    }

    public static void main(String[] args) {

        double x = 1.0000001;
        double y = 0.0;
        long z = System.currentTimeMillis();
        for (int i = 0; i < 32; i++) {
            y = i + 1;
            //System.out.println("fun with x = " + x + " and y = " + y + " = ");
            System.out.println(fun(x,y));
            System.out.println("Time: ");
            System.out.println(z-System.currentTimeMillis());
            System.out.println("....");


        }
    }
}


