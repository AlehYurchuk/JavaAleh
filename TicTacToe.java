package work12;

import org.omg.CosNaming.BindingIterator;

import java.util.Random;
import java.util.Scanner;

public class TicTacToe {
    public static char[][] table = new char[3][3];
    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[]args) {
        init();
        printTable();
        while (true) {
            turnHuman();
            if (isWin('x')) {
                System.out.println("YOU WIN");
                break;
            }
            if (isTableFull()) {
                System.out.println("Sorry,DRAW");
                break;
            }
            turnAI();
            printTable();
            if (isWin('o')) {
                System.out.println("YOU WIN!");
                break;
            }
            if (isTableFull()) {
                System.out.println("Sorry,DRAW");
                break;
            }
        }
        printTable();
        System.out.println("Game Over");
    }
    public static void init(){
        for(int i = 0;i < 3; i++) {
            for (int j = 0;j < 3; j++) {
                table[i][j] = '.';
            }

        }
    }

    public static void printTable() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(table[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void turnHuman() {
        int x, y;
        do {
            System.out.println("Enter coordinates x and y [1..3]: ");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        } while (!isCellValid(x, y));
        table[y][x] = 'x';
    }

    public static void turnAI() {
        int x, y;
        do {
            x = random.nextInt(3);
            y = random.nextInt(3);
        }while (!isCellValid(x, y));
        table[y][x] = 'o';
    }

    public static boolean isCellValid(int x,int y) {
        if (x < 0 || y < 0 || x > 2 || y > 2) {
            return false;
        }
        return table[y][x] == '.';
    }

    public static boolean isWin(char ch) {
        for (int i = 0; i < 3; i++) {
            if((table[i][0] == ch && table[i][1] == ch && table[i][2] ==ch) ||
                    (table[2][0] == ch && table[1][1] == ch && table[0][2] ==ch)) {
                return true;
            }
            if ((table[0][0] == ch && table[1][1] ==ch && table[2][2] ==ch) ||
                    (table[2][0] == ch && table[1][i] == ch && table[2][i] ==ch)) {
                return true;
            }

        }
        return false;
    }
    public static boolean isTableFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (table [i][j] == '.') {
                    return false;
                }
            }
        }
        return true;
    }

}
