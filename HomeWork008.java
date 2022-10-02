/**
 *  Java Basic. Home work008
 *
 * @author Aleh
 * @TODO: 28.09.2022
 * @date 02.10.2022
 */
public class HomeWork008 {
    public static void main(String[] args) {
        Cat cat = Cat ("Bro", "red", 2, 1);
        System.out.println(cat);
        System.out.println("Try to play:" + cat.play());
        cat.feed();
        System.out.println("Try to play" + cat.play());
        System.out.println("Try to play" + cat.play());
        cat.feed();
        System.out.println("Try to jump:" + cat.jump(1));
        cat.feed();
        System.out.println("Try to jump:" + cat.jump(2));
    }
}
