package lessons.lesson15.demo;

public class Main {
    public static void main(String[] args) {
        demo("hsh", 1, 2, 3);
    }

    //varargs Неограниченное кол-во int-ов, ставиться всегда послденим,
    // хранится как массив
    static void demo(String str, int... ints) {
        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }
    }
}
