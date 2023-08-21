package lessons.lesson12.homework;

public class Androids implements Smartphones, LinuxOS {
    @Override
    public void call() {
        System.out.println("Calling");
    }

    @Override
    public void sms() {
        System.out.println("Smsing");
    }

    @Override
    public void internet() {
        System.out.println("Accessing");
    }

    @Override
    public void Linux() {
        System.out.println("Loading");
    }
}
