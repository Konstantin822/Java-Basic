package lessons.lesson11.computers;

import lessons.lesson11.computers.Computer;

public class PC extends Computer {
    String mouse;

    public PC(String processor, String monitor, double price) {
        super(processor, monitor, price); // ссылка на родителя
        System.out.println("Running constructor: PC");
        System.out.println(this.processor);
    }

    public PC(String processor, String monitor, double price, String mouse) {
        super(processor, monitor, price);
        System.out.println("Running constructor: PC");
        this.mouse = mouse;
    }

    @Override
    public String toString() {
        return "PC{" +
                "processor='" + processor + '\'' +
                ", monitor='" + monitor + '\'' +
                ", price=" + price +
                ", mouse='" + mouse + '\'' +
                '}';
    }
}
