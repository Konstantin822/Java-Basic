package lessons.lesson13.enumeration;

public class TransportTypeClass {
    private String title;
// Так писали до появления Enum
    public static final TransportTypeClass MOTORCYCLE = new TransportTypeClass("Motorcycle");
    public static final TransportTypeClass CAR = new TransportTypeClass("Car");
    public static final TransportTypeClass BUS = new TransportTypeClass("Bus");
    public static final TransportTypeClass TRUCK = new TransportTypeClass("Truck");


    private TransportTypeClass(String title) {
        this.title = title;
        System.out.println("qwerty");
    }

    public String getTitle() {
        return title;
    }
}
