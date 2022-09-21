import java.util.Random;
import java.util.Scanner;

/**
 * Java Basic. Home work #005
 *
 *@author Aleh
 *@version 19.09.2022
 *@date 21.09.2022
*/

class HomeWork005 { //FieldofMiracles
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        String[] words = {"sport", "agent", "index"};
        String word = words[random.nextInt(words.length)];
        char[] mask = {'#', '#', '#','#', '#'};
        int number = 0;
        int guess = -1;
        int counter = 0;
        int letterCounter = 0;
        System.out.println("Welcome to the game! todat we have a 5 letter word");

        do {
            counter++;
            System.out.print("Guess the word: [" + new String(mask) + "]: ");
            char letter = scanner.next().charAt(0);
            for (int i = 0; i < word.length(); i++) {
                if (letter == word.charAt(i) && mask[i] == '#') {
                    mask [i] = letter;
                    letterCounter++;
                }
            }
        } while (letterCounter < word.length());

        System.out.println("You guess the word [" + word + "], attempts: " + counter);
    }
}