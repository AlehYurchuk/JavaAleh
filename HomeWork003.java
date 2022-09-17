/**
 * Java Basic. Home work #003
 *
 *@author Aleh
 *@version 12.09.2022
 *@date 17.09.2022
*/
class HomeWork003 {
    public static void main(String[] args) {
        //task1
        int[] array = {17, 2, 0, 66, 78, 1};
        printArray(array);

        //task 2
        int max = getMax(array);
        System.out.println("Max = " + max);

        // task 3
        int[] invArray = {1, 0, 0, 1, 1, 0, 1, 0, 0};
        printArray(invArray);
        printArray(invertArray(invArray));

    }

    static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
    }

    static int getMax(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++){
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    static int[] invertArray(int[] array) {
        int[] result = new int[array.length];
        for (int i = 1; i < array.length; i++) {
            if (array[i] == 1) {
                result[i] = 0;
            } else
                result[i] = 1;
        }
        return result;
    }
}