package lessons.lesson12;

public class Cat extends Animal {

    public static int someInt = 10;

    public void jump() {
        System.out.println("Cat jump");
    }

    @Override
    void greeting() {
        System.out.println("Meow");
    }

    public static void demo() {
        System.out.println("demo Cat");
    }
}
