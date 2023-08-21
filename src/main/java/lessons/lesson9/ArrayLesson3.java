package lessons.lesson9;

import java.util.Arrays;

public class ArrayLesson3 {
    public static void main(String[] args) {

//        int[][] array = new int[2][4];
//
//        array[0][0] = 10;
//        array[0][1] = 10;
//        array[0][2] = 10;
//        array[0][3] = 10;
//
//        array[1][0] = 20;
//        array[1][1] = 21;
//        array[1][2] = 22;
//        array[1][3] = 23;

//        int[][] array = {
//                {10, 11, 12, 13},
//                {20, 21, 22, 23},
//                {30, 31, 32, 33},
//                {40, 41, 42, 43},
//                {50, 51, 52, 53}
//        };

        //Длина строк (всегда возвращает кол-во строк в массиве) - array.length
//        System.out.println(array.length);

        //Взяли конкретную строку и вывели ее длину
//        System.out.println(array[0].length);
//        System.out.println(array[1].length);
//        System.out.println(Arrays.toString(array[0]));

        // Выводит ссылки [[I@6d03e736, [I@568db2f2]
        //System.out.println(Arrays.toString(array));

//        int[][] array = new int[3][4];

//      Зубчатый массив
//        int[][] array = {
//                {1},
//                {20, 21},
//                {30, 31, 32, 33},
//                {},
//                {50, 51, 52, 53, 54, 555, 42, 43}
//        };
//        System.out.println(array.length); // вернуло кол-во строк
//        System.out.println(array[0].length); // Смотрим кол-вщ элементов в 1 строке
//        System.out.println(array[1].length); // Смотрим кол-вщ элементов в 2 строке
//        System.out.println(array[2].length); // Смотрим кол-вщ элементов в 3 строке
//        System.out.println(array[3].length); // Смотрим кол-вщ элементов в 4 строке
//        System.out.println(array[4].length); // Смотрим кол-вщ элементов в 5 строке

//        int count = 1;
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) { // если кол-во столбцов и строк одинаковое [3][3]
//                //                                         можно писать array.lenght
//                //array[i][j] = i + j;
//                array[i][j] = count++;
//            }
//        }

        // Выводит двумерный массив (некрасиво)
        //System.out.println(Arrays.deepToString(array));

        // Выводим по умному
        //Бежит по строкам
//        for (int i = 0; i < array.length; i++) {
//            //Бежит по столбцам
//            for (int j = 0; j < array[i].length; j++) {
//                // Выводим все элементы через пробел
//                System.out.print(array[i][j] + "\t"); // "\t" - отступ на 4 пробела
//            }
//            // Делаем перенос строки №2
//            System.out.println();
//        }


        // Трехмерный массив
        // [1][2][3] - массив, строчка, столбец
        int[][][] array = {
                {
                        {18, 28, 18, 28}, {45, 90, 45, 0}
                },
                {
                        {7, 125, 500, 5}, {0, 11, 25, 30}
                },
                {
                        {81, 17, 19, 55}, {1, 7, 38, 11}
                }
        };

//        System.out.println(Arrays.deepToString(array));

//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                for (int k = 0; k < array[i][j].length; k++) {
//                    System.out.print(array[i][j][k] + "\t");
//                }
//                System.out.println();
//            }
//            System.out.println();
//        }

        // Достаем массив из трехмерного
        for (int i = 0; i < array[0].length; i++) {
            for (int j = 0; j < array[0][i].length; j++) {
                System.out.print(array[0][i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();

//        demo1();
//        task1();
//        task2();
        task3();
    }

    // Создать массив размеров 5х5. Заполнить массив с помощью цикла таким
    // образом, чтобы единица в каждой строке смещалась вправо

    // Вариант 1
    // 1 0 0 0 0
    // 0 1 0 0 0
    // 0 0 1 0 0
    // 0 0 0 1 0
    // 0 0 0 0 1

    // Вариант 2
    // 1 0 0 0 1
    // 0 1 0 1 0
    // 0 0 1 0 0
    // 0 1 0 1 0
    // 1 0 0 0 1

    static void task1() {
        int[][] array = new int[5][5];

//        array[0][0] = 1;
//        array[1][1] = 1;
//        array[2][2] = 1;
//        array[3][3] = 1;
//        array[4][4] = 1;

        // Вариант 1
        for (int i = 0; i < array.length; i++) {
            array[i][i] = 1;
        }

        // Вариант 2
//        for (int i = 0; i < array.length; i++) {
//            for (int j = array.length - 1; j >= 0; j--) {
//                if (i + j == array.length - 1) {
//                    array[i][j] = 1;
//                }
//            }
//        }

        // Короче
        for (int  i = 0, j = array.length - 1; i < array.length; i++, j--) {

            if (i + j == array.length - 1) {
                array[i][j] = 1;
            }
//            if (i == j) {
//                continue;
//            }
//            array[i][j] = 1;
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }

//    С помощью циклов создать шахматную доску 8х8 вида:
//
//    B W B W B W B W  // 00, 02, 04, 06  - 0, 2, 4, 6
//    W B W B W B W B  // 11, 13, 15, 17  - 2, 4, 6, 8
//    B W B W B W B W  // 20, 22, 24, 26  - 2, 4, 6, 8
//    W B W B W B W B  // 31, 33, 35, 37  - 4, 6, 8, 10
//    B W B W B W B W
//    W B W B W B W B
//    B W B W B W B W
//    W B W B W B W B

//    10 % 2 = 0
//    11 % 2 = 5.222

    static void task2() {
        char[][] array = new char[8][8];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
//                if ((i + j) % 2 == 0) {
//                    array[i][j] = 'B';
//                } else {
//                    array[i][j] = 'W';
//                }

                array[i][j] = ((i + j) % 2 == 0) ? 'B' : 'W';
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }

    static void task3() {
        int[][] array = new int[4][4];
        int count = 1;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = count++;
            }
        }

        System.out.println("Before");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array[i].length; j++) {
                int temp = array[i][j];
                array[i][j] = array[j][i];
                array[j][i] = temp;
            }
        }

        System.out.println("After");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }

    // Меняем число
    static void demo1() {
        int[][] array = {
                {10, 11, 12, 13, 14},
                {20, 21, 22, 23, 24},
                {30, 31, 32, 33, 34},
                {40, 41, 42, 43, 44},
                {50, 51, 52, 53, 54}
        };

//        array[2][2] = 77;
//
//        System.out.println((array[3][0]));

        // Выводим строку
        for (int i = 0; i < array[3].length; i++) {
            System.out.print(array[3][i] + "\t");
        }

        System.out.println(Arrays.toString(array[3]));

//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                System.out.print(array[i][j] + "\t");
//            }
//            System.out.println();
//        }
    }
}
