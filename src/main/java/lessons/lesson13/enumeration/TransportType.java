package lessons.lesson13.enumeration;

public enum TransportType {
    // Перечисляем
    // Появляется констурктор, пишем ()
    MOTORCYCLE("Motorcycle"),
    CAR("Car"),
    BUS("Bus"),
    TRUCK("Truck");

    private String title;
    //private int someInt;
    TransportType(String title) {
        this.title = title;
        //System.out.println("qwerty enum"); // Конструктор вызывается для всех перечислений,
        // в данном случае 4 перечисления
    }

    public String getTitle() {
        return title;
    }
}
