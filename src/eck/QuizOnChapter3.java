package eck;

public class QuizOnChapter3 {
    public static void main(String[] args) {
        String name;
        int i;
        boolean startWord;

        name = "Richard M. Nixon";
        startWord = true;
        for (i = 0; i < name.length(); i++) {
            if (startWord) // even though startWord is set to true, it continues down the list and ends up going into 'else'
                            // second time around.
                            // If the second 'if' is changed to else if, it will print the whole name.
                            // That is because 'else if' has a second priority to 'if'.

                System.out.println(name.charAt(i));
            if (name.charAt(i) == ' ')
                startWord = true;
            else
                startWord = false;
        }
    }
}
