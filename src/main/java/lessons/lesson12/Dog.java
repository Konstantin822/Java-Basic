package lessons.lesson12;

public class Dog extends Animal implements Runnable, Swimmable {

    @Override
    void greeting() {
        System.out.println("Woof");
    }

    @Override
    public void run() {

    }

    @Override
    public void swim() {

    }
}
