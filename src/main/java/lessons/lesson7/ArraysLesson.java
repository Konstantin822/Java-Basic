package lessons.lesson7;

import java.util.Arrays;

public class ArraysLesson {
    public static void main(String[] args) {
        //        int count = 0;
////        O(N^3)
//        for (int i = 0; i < 15; i++) {
//            for (int j = 0; j < 25; j++) {
//                for (int k = 0; k < 2; k++) {
//                    count++;
//                    System.out.println(count);
//                }
//            }
//        }


        int[] array1 = new int[10];
//        int[] array2 = new int[] {1, 2, 3};
//        int[] array3 = {1, 2, 3};

//        int array4[] = {1, 2, 3};

//        array1[0] = 1;
//        array1[1] = 3;
//        array1[2] = 5;
//        array1[] = 7;

//        System.out.println(array1.length);

//        for (int i = 0; i < array1.length; i++) {
//            array1[i] = (int) (Math.random() * 11);
//        }
//
////        array1[9] = 55;
//        array1[array1.length - 1] = 55;
//
//
//        for (int i = 0; i < array1.length; i++) {
//            System.out.print(array1[i] + " ");
//        }
//
//        int sum = 0;
//        for (int value : array1) {
//            System.out.print(value + " ");
//            sum += value;
//        }

//        task1();

//        int[] array = new int[10];
//        for (int i = 0; i < array.length; i++) {
//            array[i] = (int) (Math.random() * 11);
//        }
//        System.out.println(Arrays.toString(array));

//        task2(array);
        task3();
    }

        //    вывести на экран в одну строку все цифры, разделив их запятой, но у
        //    последнего символа не выводить запятую

        static void task1() {
            int[] array = new int[10];
            for (int i = 0; i < array.length; i++) {
                array[i] = (int) (Math.random() * 11);
            }

            for (int i = 0; i < array.length; i++) {
                if (array.length - 1 == i) {
                    System.out.print(array[i]);
                } else {
                    System.out.print(array[i] + ", ");
                }
            }
    }

    /*
    В убийстве Кеннеди есть 10 подозреваемых. Для каждого подозреваемого
    установлена вероятность того, что он был убийцей. Все эти вероятности
    записаны в виде массива чисел. Написать функцию, которая и определит
    номер подозреваемого, которого надо посадить в тюрьму.
   */

    static void task2(int[] array) {
        int indexMax = 0;
        int max = 0;
        String str = "";
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                indexMax = i + 1;

//                if (str.length() > 0) {
//                    str += ", ";
//                }
//                str += array[i];
//            }
            }
            System.out.println();
            System.out.println("element number: " + indexMax + ", chance: " + max);
        }
    }

    /*

    В вашей баскетбольной команде 10 человек. Очки игроков основного
    состава записаны в четные ячейки массива , а запасных игроков - в
    нечетных. Написать функцию, которая найдет насколько больше очков
    заработал основной состав по отношению к запасным игрокам.

     */

    static void task3() {
        int[] team = new int[10];
        for (int i = 0; i < team.length; i++) {
            team[i] = (int) (Math.random() * 10);
//            if (i % 2 == 0) {
//                team[i] = 1;
//            } else {
//                team[i] = 2;
//            }
        }

        int sumTeam1 = 0;
        int sumTeam2 = 0;

        for (int i = 0; i < team.length; i++) {
            if (i % 2 == 0) {
                sumTeam1 += team[i];
            } else {
                sumTeam2 += team[i];
            }
        }
        System.out.println(Arrays.toString(team));

        System.out.println(sumTeam1);
        System.out.println(sumTeam2);

        if (sumTeam1 > sumTeam2) {
            System.out.println("team 1 win");
        } else if (sumTeam1 < sumTeam2) {
            System.out.println("team 2 win");
        } else {
            System.out.println("draw");
        }
    }
}
