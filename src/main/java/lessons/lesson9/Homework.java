package lessons.lesson9;

import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
//        Транспонируйте матрицу M x N. Размеры M и N задаются из консоли.
//        После ввода должны автоматически создаваться два массива размером M x N первый и N x M второй.
        Scanner scanner = new Scanner(System.in);
        int n = getNumber(scanner);
        int m = getNumber(scanner);

        int[][] array1 = new int[n][m];
        int[][] array2 = new int[m][n];

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                array1[i][j] = (int) (Math.random() * 11);
            }
        }

        System.out.println("Array 1");
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                System.out.print(array1[i][j] + "\t");
            }
            System.out.println();
        }

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                array2[j][i] = array1[i][j];
            }
        }

        System.out.println("Array 2");
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                System.out.print(array2[i][j] + "\t");
            }
            System.out.println();
        }
    }

    static int getNumber(Scanner scanner) {
        while(true) {
            System.out.println("Input number from 1 to 10");
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                if (number >= 1 && number <= 10) {
                    return number;
                }
            } else {
                scanner.next();
            }
        }
    }
}
