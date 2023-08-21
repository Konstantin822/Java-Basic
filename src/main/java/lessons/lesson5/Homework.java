package lessons.lesson5;

import java.util.Scanner;
import java.util.SortedMap;

public class Homework {
    public static void main(String[] args) {
//        ввести имя первой команды
//        ввести количество фрагов для 5-ти игроков первой команды (т.е. должно быть 5 переменных)
//        ввести имя второй команды
//        ввести количество фрагов для 5-ти игроков второй команды (т.е. должно быть 5 переменных)
//        подсчитать среднее арифметическое очков каждой команды
//        сравнить результаты команд и определить победителя
//        вывести в консоль:
//        "Победила команда " + teamName + " набравшая " + result + " очков"

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first team name: ");
        String firstTeam = scanner.next();
        System.out.println(firstTeam);

        int team1Player1 = score(scanner, 1);
        int team1Player2 = score(scanner, 2);
        int team1Player3 = score(scanner, 3);
        int team1Player4 = score(scanner, 4);
        int team1Player5 = score(scanner, 5);

        System.out.println(team1Player1);
        System.out.println(team1Player2);
        System.out.println(team1Player3);
        System.out.println(team1Player4);
        System.out.println(team1Player5);

        System.out.println("Enter second team name: ");
        String secondTeam = scanner.next();
        System.out.println(secondTeam);

        int team2Player1 = score(scanner, 1);
        int team2Player2 = score(scanner, 2);
        int team2Player3 = score(scanner, 3);
        int team2Player4 = score(scanner, 4);
        int team2Player5 = score(scanner, 5);

        System.out.println(team2Player1);
        System.out.println(team2Player2);
        System.out.println(team2Player3);
        System.out.println(team2Player4);
        System.out.println(team2Player5);
        scanner.close();

        double avgTeam1 = (team2Player1 + team1Player2 + team1Player3 + team1Player4 + team1Player5) / 5;
        double avgTeam2 = (team2Player1 + team2Player2 + team2Player3 + team2Player4 + team2Player5) / 5;

        System.out.println("Team " + firstTeam + " average points: " + avgTeam1);
        System.out.println("Team " + secondTeam + " average points: " + avgTeam2);

        if (avgTeam1 > avgTeam2) {
            System.out.println("Team " + firstTeam + " wins");
        } else if (avgTeam1 < avgTeam2) {
            System.out.println("Team " + secondTeam + " wins");
        } else if (avgTeam1 == avgTeam2) {
            System.out.println("Draw");
        }
    }

    static int score(Scanner scanner, int number) {
        System.out.println("Enter frags for player number: " + number);
        return scanner.nextInt();
    }
}
