package lessons.lesson6;

public class Loops {
    public static void main(String[] args) {

        //        -------- ТЕРНАРНЫЙ ОПЕРАТОР --------
//        int a = 10;
//        int b = 5;
//
//        if (a < b) {
//            System.out.println("YES");
//        } else {
//            if (a > b) {
//                System.out.println("a > b");
//            } else {
//                System.out.println("a == b");
//            }
//        }
//        условие ? действие1 (если true) : действие2 (если false)

//        System.out.println(
//                (a > b) ? "YES" : "NO"
//        );
//
//        System.out.println(
//                (a < b) ? "YES" : (a > b) ?  "a > b" : "a == b"


        //     for (БЛОК ИНИЦИАЛИЗАЦИИ ИТЕРАТОРА ;
//             БЛОК УСЛОВИЯ ВЫХОДА ИЗ ЦИКЛА ;
//             БЛОК УВЕЛИЧЕНИЯ ИТЕРАТОРА)

//        for (int i = 0; i < 10; i++) {
//            System.out.println(i);
//        }


//        for (int i = 100; i <= 115; i++) {
//            System.out.println(i);
//        }

//        for (int i = 100; i >= 90; i--) {
//            System.out.println(i);
//        }

//        int i = 0;
//        for ( ; ; ) {
//            System.out.println(i);
//        }

//        for (int i = 0, j = 10, iterator = 10; i < 10 && j < 15; i++, j++, iterator++) {
//            System.out.println("i = " + i + ", j = " + j);
//        }

        // -- BREAK --
        // ОБРЫВАНИЕ ВСЕГО ЦИКЛА

        // -- CONTINUE --
        // ОБРЫВАЕТ ТЕКУЩУЮ ИТЕРАЦИЮ

//        for (int i = 0; ; i++) {
//            if (i == 5) {
//                continue;
//            }
//
//            if (i == 7) {
//                break;
//            }
//            System.out.println(i);
//        }


        int i = 0;
//        while (true) {
//            i++;
//            if (i == 5) {
//                continue;
//            }
//
//            if (i == 7) {
//                break;
//            }
//
//            System.out.println(i);
//        }


//        int i = 0;
//        do {
//            System.out.println(i);
//            i++;
//        } while (i == 10);

//        Scanner scanner = new Scanner(System.in);
//        int n;
//        while (true) {
//            if (scanner.hasNextInt()) {
//                n = scanner.nextInt();
//                break;
//            } else {
//                System.out.println("Wrong data. Try again");
//                scanner.nextLine();
//            }
//        }
//        task2(n);


//        System.out.println(demoRecursion(n));

        showFibonachi();


    }


    //    Выведите на экран первые 11 членов последовательности Фибоначчи
    // 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89
    static void showFibonachi() {
        int number1 = 1;
        int number2 = 1;
        int sum;

        System.out.print(number1 + " " + number2 + " ");
        for (int i = 3; i <= 11; i++) {
            sum = number1 + number2;
            System.out.print(sum + " ");
            number1 = number2;
            number2 = sum;
        }

    }

    //    Вычислить факториал числа от 0 до N (вводим из консоли)
    static void task2(int n) {

//        int result = 1;
//        for (int i = 1; i <= n; i++) {
//            result *= i;
//        }

        // 1 * 1 = 1
        // 1 * 2 = 2
        // 2 * 3 = 6
        // 6 * 4 = 24
        // 24 * 5 = 120


//        int result = 1;
//        int i = 1;
//        while (i <= n) {
//            result *= i;
//            i++;
//        }

        int result = 1;
        for (int i = n; i > 0; i--) {
            result *= i;
        }

        System.out.println(result);

    }

    static int demoRecursion(int n) {
        if (n == 1) {
            return 1;
        }
        return n * demoRecursion(n - 1);            // 5 * 4 * 3 * 2 * 1
    }


    //    Сделайте бомбу с обратным отсчетом от 10 до 0 с помощью цикла
    static void task1() {
        int a = 10;
//        10 9 8 .. 1 -> BOOM!!!

//        for ( ;   ; a--) {
//            if (a == 0) {
//                System.out.println("BOOM!!!!");
//                break;
//            }
//            System.out.println(a);
//        }

//        for ( ; a >= 0; a--) {
//            if (a == 0) {
//                System.out.println("BOOM!!!!");
//            } else {
//                System.out.println(a);
//            }
//        }

//        int i = 10;
//        while (true) {
//            if (i == 0) {
//                System.out.println("BOOM!!!!");
//                break;
//            }
//            System.out.println(i);
//            i--;
//        }

        int i = 10;
        while (i >= 0) {

            if ((int) (Math.random() * 101) > 80) {
                System.out.println("GOOD!!!");
                break;
            }

            if (i == 0) {
                System.out.println("BOOM!!!!");
            } else {
                System.out.println(i);
            }
            i--;
        }
    }
}
