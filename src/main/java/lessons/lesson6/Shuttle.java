package lessons.lesson6;

public class Shuttle {
    public static void main(String[] args) {
//        В Японии числа 4 и 9 считаются несчастливыми. Вам нужно пронумеровать 100 космических шаттлов
//        для перевозки людей на Марс так, чтобы в номерах шаттлов не
//        попадалось несчастливых чисел. Напишите функцию, которая выводит все номера таких шаттлов.

        ship();
    }

    static void ship() {
        int shuttle = 1;
        int numberShuttle = 1;

        while (shuttle <= 100) {
            if (check(numberShuttle)) {
                System.out.println("number: " + numberShuttle + " - shuttle: " + shuttle);
                shuttle++;
            }
            numberShuttle++;
        }
    }
    static boolean check(int number) {
        int result = number % 10;
        do {
            if (result == 4 || result == 9) {
                return false;
            }
            number /= 10;
            result = number % 10;
        } while (number > 0);
        return true;
    }
}
