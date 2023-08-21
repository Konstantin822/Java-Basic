package lessons.lesson11.computers;

public class Notebook extends Computer {

    String touchpad;

    public Notebook(String processor, String monitor, double price, String touchpad) {
        super(processor, monitor, price);
        this.touchpad = touchpad;
    }

    @Override
    public String toString() {
        return "Notebook{" +
                "processor='" + processor + '\'' +
                ", monitor='" + monitor + '\'' +
                ", price=" + price +
                ", touchpad='" + touchpad + '\'' +
                '}';
    }
}
