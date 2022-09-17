import java.util.Random;
import java.util.Scanner;
/**
 * Java Basic. Home work #003
 *
 *@author Aleh
 *@version 14.09.2022
 *@date 17.09.2022
*/

class HomeWork004 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scaner = new Scanner(System.in);
        int number = 0;
        int guess = -1;

        do {
            number = random.nextInt(10);
            for (int i = 0; i < 3; i++) {
                System.out.print("Guess the number [0..9]: ");
                guess = scaner.nextInt();
                if (guess < number) {
                    System.out.println("Your number is less");
                } else if (guess > number) {
                    System.out.println("Your number is bigger");
                } else {
                    System.out.println("you WIN, you guess my number");
                    break;
                }
            }
            if (number != guess) {
                System.out.println("Game over.");
            }
            System.out.print("Repeat game? Yes - 1, No - 0: ");
        } while (scaner.nextInt() == 1);
    }
}