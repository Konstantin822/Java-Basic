package lessons.lesson6;

import java.util.Random;
import java.util.Scanner;

public class Guess {
    public static void main(String[] args) {
//        Сделать игру, в которой нужно отгадать целое число, которое "загадал" компьютер в диапазоне от 0 до 10
//        У пользователя должна быть возможность угадывать в несколько попыток (минимум 3).

        Random();

    }
    static void Random() {
        Scanner scanner = new Scanner(System.in);

        int attempts = 3;
        int randomNumber = (int) (Math.random() * 11);
        System.out.println("Guess number from 0 to 10.");
        System.out.println("You have " + attempts + " attempts");

        do {
            if (randomNumber == number(scanner)) {
                System.out.println("You guess right");
                break;
            } else {
                attempts--;
                System.out.println("Wrong. You have left " + attempts + " attempts");
            }
        } while (attempts > 0);
    }

    static int number(Scanner scanner) {
        while (true) {
            if (scanner.hasNextInt()) {
                int result = scanner.nextInt();
                if (result >= 0 && result <= 10) {
                    return result;
                } else {
                    System.out.println("Enter number from 0 to 10");
                }
            } else {
                System.out.println("Try again");
                scanner.next();
            }
        }
    }
}
