/**
 * Java Basic. Home work #1
 *
 *@author Aleh
 *@version 06.09.2022
 *@date
*/
class HomeWork001{
    public static void main(String[] args) {
        // task 1
        int a = 9;
        int b = 20;
        int s = a * b;
        int p = 2 * (a+b);
        System.out.printf( "Area = " + s);
        System.out.printf("Perimeter = " + p );

        // task 2
        int x = 3;
        int y = 5 ;
        System.out.printf("%d + %d = %d\n", x, y, x + y);
        System.out.printf("%d - %d = %d\n", x, y, x - y);
        System.out.printf("%d * %d = %d\n", x, y, x * y);
        System.out.printf("%d / %d = %f\n", x, y, (float)x / y);

        //task 3
        int[] array = new int [5];
        array[0] = 5;
        System.out.println(array[0]);
        array[1] = 4;
        System.out.println(array[1]);
        array[2] = 3;
        System.out.println(array[2]);
        array[3] = 2;
        System.out.println(array[3]);
        array[4] = 1;
        System.out.println(array[4]);

        // task 4
        int pizzaDiameter = 28;
        double pizzaRadius = pizzaDiameter / 2d;
        double pizzaArea = Math.PI * pizzaRadius *pizzaRadius;
        double pizzaCalories = pizzaArea * 40;
        System.out.printf("Pizza %d cm in diameter has %.2f calories", pizzaDiameter, pizzaCalories);
    }
}