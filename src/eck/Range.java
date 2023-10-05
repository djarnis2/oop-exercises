package eck;

public class Range {
    public static void main(String[] args) {
        double[] racetimes = {23.25,55.56,84.57,65.44,71.21,12.54};

        double min = racetimes[0];
        double max = racetimes[0];


        for (int i = 1; i < racetimes.length; i++) {
            if (racetimes[i] < min)
                min = racetimes[i];

            else if (racetimes[i] > max)
                max = racetimes[i];



        }
        System.out.println("The racetimes range is "  + (double)Math.round(max-min));
    }
}
