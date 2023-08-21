package lessons.lesson13.enumeration;

public class Main {
    public static void main(String[] args) {
//        System.out.println(TransportTypeClass.CAR.getTitle());
//        System.out.println();
//        System.out.println(TransportType.CAR.getTitle());

//        TransportType transportType = null;
//        while (true) {
//            for (TransportType value : TransportType.values()) {
//                String str = "CAR";
//                if (value.getTitle().equals(str)) {
//                    transportType = TransportType.valueOf(str);
//                }
//            }
//            if (transportType == null) {
//                System.out.println();
//            } else {
//                break;
//            }
//        }

        // Вариант 1
        TransportType transportType = null;
            for (TransportType value : TransportType.values()) {
                String str = "CAR";
                if (value.getTitle().equals(str)) {
                    transportType = TransportType.valueOf(str);
                }
            }
            if (transportType == null) {
                System.out.println();
            }

        // Вариант 2
        try {
            TransportType.valueOf("CAR2");
        } catch (IllegalArgumentException e) {
            System.out.println("bad data. try again");
        }

        //TransportType.valueOf(); Достает конкретный обьект, должно соападать имя
        //TransportType.values(); Возвращает список всех обьектов
        for (TransportType value : TransportType.values()) {
            System.out.println(value.getTitle());
        }

        // Сохраняем в массив
        TransportType[] values = TransportType.values();
        System.out.println(values[0].getTitle()); // достаем из массива

        TransportType car = TransportType.valueOf("CAR");// Вызываем конкретный обьект
        TransportType bus = TransportType.BUS;
        System.out.println(car.getTitle());
        System.out.println(bus.getTitle());


        switch (car) { // Или так TransportType.CAR
            case CAR: {
                System.out.println("You choose car");
                break;
            }
            case BUS: {
                System.out.println("You choose bus");
                break;
            }
            case TRUCK: {
                System.out.println("You choose truck");
                break;
            }
            default: {
                System.out.println("default");
            }
        }
    }
}
