/**
 * Java Basic. Home work #002
 *
 *@author Aleh
 *@version 06.09.2022
 *@date
*/
class HomeWork002 {
    public static void main(String[] args) {
         checkWeather();
         canWalk();
         dayOfWeek();
         int a = add(10, 5);
         System.out.println(a);
         int d = div(10, 5);
         System.out.println(d);
         int s = sub(10, 5);
         System.out.println(s);
         int m = mul(10, 5);
         System.out.println(m);
    }

    static void  checkWeather() {
        // task 1
        int t = 15;
        if (t < 0) {
            System.out.println("it's frost");
        } else if (t == 0 || t <= 18 ) {
            System.out.println("it's cold");
        } else if (t == 19 || t <= 28) {
            System.out.println("it's warm");
        } else if (t > 29) {
            System.out.println("it's hot");
        } else {
        System.out.println("Error!");
        }
    }

    static void canWalk() {
        //task 2
        boolean isWeekend = !false ;
        boolean isRain = true;
        if (isWeekend && isRain){
            System.out.println("I can walk if there is not rain");
        } else {
            System.out.println("it's rain");
        }
    }

    //task 3
    static int add(int a, int b) {
        int c = a + b;
        return c;
    }

    static int div(int a, int b) {
        int c = a / b;
        return c;
    }

    static int sub(int a, int b) {
        int c = a + b;
        return c;
    }

    static int mul(int a, int b) {
        int c = a + b;
        return c;
    }

    static void dayOfWeek() {
        //task 4
        int d = 6;
        switch (d) {
            case 1:
                System.out.println("Monday");
                 break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Error");
       }
    }
}
