package lessons.lesson2;

public class Homework {
    public static void main(String[] args) {
//        Создать две переменные с широтой и долготой вашего текущего местоположения,
//        либо местоположения любой достопримечательности в мире; Вывести на экран

        String name = "latitude";
        String name2 = "longitude";
        int northern = 52;
        int eastern = 13;
        char charVariable = '\u00b0';

        System.out.println("Brandenburger Gate coordinates: ");
        System.out.println("Northern " + name + ": " + northern + charVariable);
        System.out.println("Eastern " + name2 + ": " + eastern + charVariable);
    }
}
