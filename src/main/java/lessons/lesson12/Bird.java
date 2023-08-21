package lessons.lesson12;

public class Bird extends Animal implements Flyable {

    // extends - только от одного
    // implements - сколько угодно
    @Override
    public void fly() {
        System.out.println("fly");
    }

    @Override
    void greeting() {
        System.out.println("Hello");
    }
}
