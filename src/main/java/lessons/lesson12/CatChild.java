package lessons.lesson12;

public class CatChild extends Cat {
//    @Override - статический метод нельзя переопределить

    public static int someInt = 20;
    public static void demo() {
        System.out.println("demo from Cat");
    }
}
