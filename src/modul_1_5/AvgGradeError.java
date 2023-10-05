package modul_1_5;
/*
12.4 Gennemsnitlig Karakter
Delopgave 1
På mange uddannelsessteder udregnes en studerendes gennemsnitlige karakter udelukkende ud fra de beståede karakterer. I denne øvelse skal vi se på hvordan
dette kunne implementeres. I denne øvelse skal du:

1. Lav et nyt program via en klasse der hedder AvgGradeError.
2. I denne klasse erklæres en int[] variable kaldet grades og denne initialiseres til at indeholde karaktererne 4, 7, 02, 00, 10, 4, og 12.
3. Dernæst erklæres der i samme klasse en getGrade metode, der tager en
int some parameter og returnerer en int. Parameteren gives navnet
courseid.
4. I kroppen på denne metode udtrækkes først en værdi fra courseid positionen af grades. Denne gemmes i en grade variabel af typen int.
Hvis karakteren er bestået returneres denne. Ellers oprettes der en Error
hvorefter denne kastes.
5. Slutteligt erklæres der en main metode. Denne er opdelt i tre dele:
(a) Initialisering Der erklæres to variable af typen int kaldet count og sum.
(b) Udregning Gennemløb alle indexer (kald dem courseid) fra grades
med et for-loop (der ikke hardcoder antallet). For hvert courseid kaldes getGrade.
Sørg for at netop de kald der ikke resulterer i en Error, resulterer i at (i) count bliver inkrementeret,
og (ii) at sum bliver forøget med returværdien.
(c) Udprint Gennemsnittet count sum  udregnes og printes ud til brugeren.
6. Verificer at koden virker korrekt.
Delopgave 2
Lav en kopi af din løsning af delopgave 1, og navngiv denne AvgGradeException. Modificer denne sådan at der i stedet for at blive kastet en Error i getGrade, bliver kastet en Exception.

 */
public class AvgGradeError {
    static int[] grades = {4,7,2,0,10,4,12};
    public static int getGrade(int courseid) throws Exception {
        int grade = grades[courseid];
        if (grade == 0)
            System.out.println("not passed " + grade);
        if (grade != 0) {
            return grade;
        }
        else
            throw new Exception ("Grade not passed");

    }
    public static void main(String[] args) throws Exception {
        int count = 0;
        int sum = 0;
        for (int i=0;i<grades.length;i++) {
            try {
                int courseid = getGrade(i);
                count += 1;
                System.out.println(grades[i]);
                sum += courseid;
            }
            catch (Exception e) {

            }
            System.out.println(count+ " + " + sum);
        }


    }

}
