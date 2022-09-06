/**
 * Java Basic. Home work #1
 *
 *@author Aleh
 *@version 06.09.2022
 *
*/
class HomeWork001{
    public static void main(String[] args) {
        int a = 9;
        System.out.println( "a = " + a );
        int b =20;
        System.out.println( "b = " + b);
        int s = a * b;
        System.out.printf( "s = %s","a * b = " + s);
		int p = 2 * (a+b);
        System.out.printf("p = %s, p = %d", "2*(a+b)", p );
        int x = 3;
        int y = 5 ;
        System.out.println(x + y);
        System.out.println(x - y);
        System.out.println(x * y);
        System.out.println(x / y);
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
    }
}