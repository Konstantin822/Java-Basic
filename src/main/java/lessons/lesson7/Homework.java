package lessons.lesson7;

import java.util.Arrays;

public class Homework {
    public static void main(String[] args) {
//        Есть две команды регби из 25 игроков разного возраста в каждой.
//        Возраст берем случайным образом в диапазоне от 18 до 40.
//        Выведите в двух строках возраст игроков каждой команды.
//        Посчитайте средний возраст игроков каждой команды и выведите на экран.

//        int min = 18;
//        int max = 40;
//
//        int[] team1 = new int[25];
//        int sum1 = 0;
//        for (int i = 0; i < team1.length; i++) {
//            team1[i] = min + (int) (Math.random() * (max - min + 1));
//            sum1 += team1[i];
//        }
//        System.out.println(Arrays.toString(team1));
//        double avg1 = sum1 / 25;
//        System.out.println(avg1);
//
//        int[] team2 = new int[25];
//        int sum2 = 0;
//        for (int i = 0; i < team2.length; i++) {
//            team2[i] = min + (int) (Math.random() * (max - min + 1));
//            sum2 += team2[i];
//        }
//        System.out.println(Arrays.toString(team2));
//        double avg2 = sum2 / 25;
//        System.out.println(avg2);

        task();
    }

    static void task() {
        final int count_players = 25;

        int[] team1 = new int[count_players];
        int[] team2 = new int[count_players];

        fillArray(team1);
        fillArray(team2);

        System.out.println(Arrays.toString(team1));
        System.out.println(Arrays.toString(team2));

        System.out.println(calculateAvg(team1));
        System.out.println(calculateAvg(team2));
    }

    static void fillArray(int[] array) {
        int min = 18;
        int max = 40;
        for (int i = 0; i < array.length; i++) {
            array[i] = min + (int) (Math.random() * (max - min + 1));
        }
    }

    static double calculateAvg(int[] array) {
        double sum = 0;
        for (int value : array) {
            sum += value;
        }
        return sum / array.length;
    }
}
