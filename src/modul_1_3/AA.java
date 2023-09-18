package modul_1_3;

/*
Alle indre arrays behøver ikke at have samme
    længde: Pas på når du indekserer!
 */
public class AA {

   public static void main(String[] args) {
       int[][] as = {
               {1},
               {2,3},
               {3,4,5},
               {4,5,6,7}
       };
       for (int y=0 ; y<as.length ; y++) {
           for (int x = 0; x < as[y].length; x++) {
               System.out.println("as[" + y + "][" + x + "] = " + as[y][x]);

           }
       }
    }
}
