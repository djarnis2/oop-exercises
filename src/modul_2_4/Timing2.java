package modul_2_4;

public class Timing2 {
    static double base = 1.0000001;
    static double fun (double x, double y) {
        if (y<=1) {
            return x;
        } else {
            return fun(x, y-1)*fun(x, y-1);
        }
    }
    public static void main (String[] args) {
        for (double i=1 ; i<32 ; i++) {
            long t0 = System.currentTimeMillis();
            double f = fun(base, i);
            long t1 = System.currentTimeMillis();
            System.out.println("fun("+base+","+i+") = "+f+
                    " (calculation took "+(t1-t0)+"ms)");
        }
    }
}


