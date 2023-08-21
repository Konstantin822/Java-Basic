package lessons.lesson5;

import java.util.Scanner;

public class LogicalOperators {
    public static void main(String[] args) {
//        int a = getNumber();
        //int a = 7;
//        int b = 10;

//        boolean trueValue = false;
//
//        if (b > a) {
//            System.out.println("b > a");
//        } else if (b < a) {
//            System.out.println("b < a");
//        } else {
//            System.out.println("b == a");
//        }
//
//
//        if (b == 1) {
//            System.out.println("number = " + 1);
//        } else if (b == 2) {
//            System.out.println("number = " + 2);
//        } else if (b == 3) {
//            System.out.println("number = " + 3);
//        } else if (b == 4) {
//            System.out.println("number = " + 4);
//        } else if (b == 5) {
//            System.out.println("number = " + 5);
//        }

        // Вложенная проверка

//        if (b >= a) {
//            System.out.println("b >= a");
//
//            if (b == a) {
//                System.out.println("b = a");
//            } else {
//                System.out.println("b > a");
//            }
//        } else {
//            System.out.println("b < a");
//        }

        /////////////////////////////////

//        int number = getNumber();
//        int number2 = 2;
//        System.out.println(number);
//
//        if (number % 2 == 0) {
//            System.out.println("Четное");
//        } else {
//            System.out.println("Не четное");
//        }

        /////////////////////////////////

//        int a = 1;
//        int b = 5;
//        int c = 10;

        // Логическое И -> &&
        // Логическое ИЛИ -> ||

//        if (a < b && c > b) {
//            System.out.println("yes");
//        } else {
//            System.out.println("no");
//        }
//
//        if ((a < b) || (c > b) && (10 > 4)) {
//            System.out.println("yes");
//        } else {
//            System.out.println("no");
//        }

//        if (true && false) -> false
//        if (true || false) -> true

//        if (true || false && true) - (true && true) -> true
//        if (true || (false && true)) -> (true || false) -> true

//        int x = 10;
//        System.out.println(x);
//
//        if ((x > 11) || (--x == 9)) {
//            System.out.println("yes");
//        } else {
//            System.out.println("no");
//        }
//
//        System.out.println(x);

        /////////////////////////////////

//        int a = 9;
//
//        switch (a) {
//            case 5:
//                System.out.println("value = 5");
//                break;
//            case 7:
//                System.out.println("value = 7");
//                break;
//            case 10:
//                System.out.println("value = 10");
//                break;
//            default:
//                System.out.println("default");
//                break;
//        }

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter team name");
        String str1 = scanner.next();
        System.out.println(str1);

        System.out.println("Enter count for player 1");
        int number1 = 0;

        if (scanner.hasNextInt()) {
            number1 = scanner.nextInt();
        } else {
            System.out.println("wrong data");
            System.exit(0);
        }

        System.out.println("Enter count for player 2");
        int number2 = scanner.nextInt();
        System.out.println("Enter count for player 3");
        int number3 = scanner.nextInt();
        System.out.println("Enter count for player 4");
        int number4 = scanner.nextInt();
        System.out.println("Enter count for player 5");
        int number5 = scanner.nextInt();
        System.out.println("number = " + number1);
        System.out.println("number = " + number2);
        System.out.println("number = " + number3);
        System.out.println("number = " + number4);
        System.out.println("number = " + number5);
    }

    static int getNumber(Scanner scanner) {
        return (int) (Math.random() * 11);
    }
}
