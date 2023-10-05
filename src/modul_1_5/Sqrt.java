package modul_1_5;

public class Sqrt
{
    public static double sqrt (double x) {
        double candidate = 0.0;
        for (double pointer = 1_000_000_000.0; pointer>0.000_000_001 ; pointer /=10) {
            System.out.println("b4 loop and b4 += candidate is: " + candidate + " + pointer is: " + pointer);
            candidate += 10*pointer;
            // most times candidate went to 0 in privious loop so this will restart loop
            // with candidates last value b4 it went to 0 because pointer was reduced with the /10 loop
            // So with the pointer as 1/10th the value of the new candidate we can make a backwards loop deducting
            // a 10th from candidate 10 times in a 10-fold loop
            // at some point candidate does not lose all its value because the loop will break in the middle,
            // b4 its has reached 0. This is when we can start the loop over with the pointer reduced to a 10th
            // but at the same time leftover value in the candidate and it will thus start finding the 2nd ciffer in the solution
            System.out.println("b4 loop candidate is: " + candidate + " + pointer is: " + pointer);
            for (int i=0 ; i<10; i++) {
                candidate -= pointer;
                System.out.println("2nd loop candidate is: " + candidate + " + pointer is: " + pointer);
                if (candidate*candidate<x) {
                    System.out.println("Tjek while candidate = " + candidate + " and pointer is " + pointer);
                    break;

                }
            }
        }
        return candidate;
    }
    public static void main (String[] args) {
        for (double x=1 ; x<=10 ; x++) {
            System.out.println("sqrt("+x+")="+sqrt(x));
        }
    }
}