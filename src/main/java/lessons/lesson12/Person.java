package lessons.lesson12;

public class Person {

    public static int counter = 0;
    private int age;

    public Person(int age) {
        this.age = age;
        counter++;
    }

    public static int getCounter() {
        return counter;
    }

    public int getAge() {
        return age;
    }

    public final void demo() { // запрет на переопределеение
        System.out.println("demo");
    }
}
