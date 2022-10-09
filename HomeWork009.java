/**
 *  Java Basic. Home work007
 *
 * @author Aleh
 * @TODO: 05.10.2022
 * @date 09.10.2022
 */
public class HomeWork009 {
    public static void main(String[] args) {
        Cat cat = new Cat("Bars", "red", 2);
        Dog dog = new Dog("Polkan", "blask", 5);
        IAnimal[] animals = {cat, dog};

        for(IAnimal animal : animals) {
            System.out.println(animal);
            System.out.println(animal.voice());
        }
    }
}
