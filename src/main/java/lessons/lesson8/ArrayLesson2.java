package lessons.lesson8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ArrayLesson2 {
    public static void main(String[] args) {
        int[] array = {1, 22, 13, 44, 77, -2, 2, 111, -7};

        System.out.println(Arrays.toString(array));
        bubbleSortReverse(array);
        System.out.println(Arrays.toString(array));


        System.out.println(Arrays.toString(array));
        Arrays.sort(array);

        // reverse only REFERENCES
//        Arrays.sort(array, Collections.reverseOrder());
//        System.out.println(Arrays.toString(array));


        int[] array2 = Arrays.copyOf(array, 15);

        System.out.println(Arrays.toString(array2));

        task1();
        task2();


    }
//    Создать массив из N чисел (вводим из консоли)
//    Разбить его на 2 массива равной длины
//    Отсортировать первую половину массива по возрастанию и вывести на экран
//    вторую половину массива отсортировать в обратном порядке и тоже вывести на экран
    static void task2() {

        int n = 0;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            if (scanner.hasNextInt()) {
                n = scanner.nextInt();
                if ((n > 0) && (n % 2 == 0)) {
                    break;
                } else {
                    System.out.println("please input number bigger then 0 and % 2 == 0");
                }
            } else {
                System.out.println("wrong data, try again");
                scanner.next();
            }
        }

        int[] array = new int[n];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 51);
        }
        System.out.println(Arrays.toString(array));

        int middle = n / 2;
        int[] arrayFirst = Arrays.copyOf(array, middle);
        int[] arraySecond = Arrays.copyOfRange(array, middle, n);


        System.out.println(Arrays.toString(arrayFirst));
        System.out.println(Arrays.toString(arraySecond));
        System.out.println();

       // Arrays.sort(arrayFirst);
        bubbleSort(arrayFirst);
        bubbleSortReverse(arraySecond);

        System.out.println(Arrays.toString(arrayFirst));
        System.out.println(Arrays.toString(arraySecond));

    }



//    a. Задать массив целых чисел длиной N элементов заполнить его рандомными числами
//     отсортировать его и вывести на экран поменять первый и последний элемент местами, вывести массив на экран еще раз

    static void task1() {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 51);
        }

        Arrays.sort(array);

        System.out.println(Arrays.toString(array));

        int temp = array[0];
        array[0] = array[array.length - 1];
        array[array.length - 1] = temp;

        System.out.println(Arrays.toString(array));

    }


    static void bubbleSort(int[] array) {
        int countIterations = 0;
        boolean isSorted = false;
        while (!isSorted) {
            countIterations++;
            isSorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                countIterations++;
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;

                    isSorted = false;
                }
            }
        }
        System.out.println("countIterations = " + countIterations);
    }

//    [1, 22, 13, 44, 77, -2, 2, 111, -7]

    static void bubbleSort2(int[] array) {
        int countIterations = 0;

        for (int i = 0; i < array.length - 1; i++) {
            countIterations++;
            for (int j = 0; j < array.length - 1 - i; j++) {
                countIterations++;
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }

        }

        System.out.println("countIterations = " + countIterations);

    }

    static void bubbleSortReverse(int[] array) {
        int countIterations = 0;

        for (int i = 0; i < array.length - 1; i++) {
            countIterations++;
            for (int j = 0; j < array.length - 1 - i; j++) {
                countIterations++;
                if (array[j] < array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        System.out.println("countIterations = " + countIterations);

    }



    static void demo1() {
        int[] array1 = {1, 2, 3, 4};
        int[] array2 = array1;
        int[] array3 = array1;

        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        System.out.println(Arrays.toString(array3));

        array3[0] = 10;

        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        System.out.println(Arrays.toString(array3));
    }
}
