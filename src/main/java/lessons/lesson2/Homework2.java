package lessons.lesson2;

public class Homework2 {
    public static void main(String[] args) {
//        Создать в новом классе main-метод;
//        Создать три переменные для хранения сторон параллелепипеда;
//        Посчитать объем в переменной volume;
//        Вывести на экран переменную volume в виде:
//        System.out.println("Объем параллелепипеда = " + volume);
//        Посчитать суммарную длину всех сторон в переменной length и вывести её на экран;

        int a = 12;
        int b = 10;
        int c = 9;
        double volume;
        int lenght;
        volume = a * b * c;
        lenght = a + b + c;

        System.out.println("Volume = " + volume);
        System.out.println("Sum lenght = " + lenght);
    }
}
