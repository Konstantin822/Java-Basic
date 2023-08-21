package lessons.lesson4;

public class Airplains {
    public static void main(String[] args) {
//        Фабрика самолётов
//
//        1. Параметры самолетов:
//
//        String type = "Jet";
//        String name = "F52";
//        int firstClassPassengers = 20;
//        int secondClassPassengers = 250;
//        2. Фабрика выпускает три типа самолетов:
//
//        истребители: тип + имя
//        пассажирские без бизнес класса: тип + имя + кол. пассажиров 2-го класса
//        пассажирские с бизнес классом: тип + имя + кол. пассажиров 1 класса + кол. пассажиров 2-го класса
//        3. Сделать три метода с одним названием для каждого типа самолета
//
//        buildAirplane("Jet", "F52");
//        buildAirplane("Boeing", "747", 300);
//        buildAirplane("Boeing", "747", 300, 25);
//        4. Каждый метод должен выводить на экран параметры сделанного самолёта

        String type = "Jet";
        String name = "F52";
        int firstClassPassengers = 20;
        int secondClassPassengers = 250;

        String airplain1 = buildAirplain(type, name);
        String airplain2 = buildAirplain("Boeing", "747", secondClassPassengers);
        String airplain3 = buildAirplain("Boeing", "747", firstClassPassengers, secondClassPassengers);

        System.out.println(airplain1);
        System.out.println(airplain2);
        System.out.println(airplain3);
    }

    static String buildAirplain(String type, String name) {
        return "Type: " + type + ", " + "name: " + name;
    }

    static String buildAirplain(String type, String name, int passengers2) {
        return "Type: " + type + ", " + "name: " + name + ", " + "second class passengers: " + passengers2;
    }

    static String buildAirplain(String type, String name, int passengers1, int passengers2) {
        return "Type: " + type + ", " + "name: " + name + ", " + "first class passengers: " + passengers1 + ", "
                + "second class passengers: " + passengers2;
    }
}
