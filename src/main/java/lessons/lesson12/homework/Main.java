package lessons.lesson12.homework;

public class Main {
    public static void main(String[] args) {
        Androids androids = new Androids();
        IPhones iPhones = new IPhones();

        androids.call();
        androids.sms();
        androids.internet();
        androids.Linux();

        System.out.println();

        iPhones.call();
        iPhones.sms();
        iPhones.internet();
        iPhones.iosPhone();
    }
}
