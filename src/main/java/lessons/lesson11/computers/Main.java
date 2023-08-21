package lessons.lesson11.computers;

public class Main {
    public static void main(String[] args) {
        PC pc1 = new PC("I9-9000K", "Samsung", 1500, "Logitech");

//        Computer computer1 = new Computer("I9-9000", "Samsung", 5000);
        Notebook notebook1 = new Notebook("I9-9000K", "Samsung", 1500, "Touchpad");
        System.out.println(pc1);
        System.out.println(notebook1);
    }
}
