package lessons.lesson6;

import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String team1Name, team2Name;

        int team1Player1 = 0, team1Player2, team1Player3, team1Player4, team1Player5,
                team2Player1, team2Player2, team2Player3, team2Player4, team2Player5;


        System.out.println("Enter team1 name");
//        team1Name = scanner.next();
        team1Name = scanner.nextLine();
        System.out.println(team1Name);


//        if (scanner.hasNextInt()) {
//            team1Player1 = scanner.nextInt();
//        } else {
//            System.out.println("Wrong data. Try again");
//            System.exit(0);
//        }

        team1Player1 = getFrags(scanner, 1);
        team1Player2 = getFrags(scanner, 2);
        team1Player3 = getFrags(scanner, 3);
        team1Player4 = getFrags(scanner, 4);
        team1Player5 = getFrags(scanner, 5);
        scanner.nextLine();

        System.out.println("Enter team2 name");
//        team2Name = scanner.next();
        team2Name = scanner.nextLine();
        System.out.println(team2Name);


        team2Player1 = getFrags(scanner, 1);
        team2Player2 = getFrags(scanner, 2);
        team2Player3 = getFrags(scanner, 3);
        team2Player4 = getFrags(scanner, 4);
        team2Player5 = getFrags(scanner, 5);

        double avgTeam1 = ((double) team1Player1 + team1Player2 + team1Player3 + team1Player4 + team1Player5) / 5;
//        double avgTeam1 = (team1Player1 + team1Player2 + team1Player3 + team1Player4 + team1Player5) / (double) 5;
//        double avgTeam1 = (team1Player1 + team1Player2 + team1Player3 + team1Player4 + team1Player5) / 5.0;
//        double avgTeam1 = (team1Player1 + team1Player2 + team1Player3 + team1Player4 + team1Player5) / 5d;
        double avgTeam2 = ((double) team2Player1 + team2Player2 + team2Player3 + team2Player4 + team2Player5) / 5;


//        if (avgTeam1 > avgTeam2) {
//            System.out.println("team1 " + team1Name + " win");
//        }
//
//        if (avgTeam1 < avgTeam2) {
//            System.out.println("team2 " + team2Name + " win");
//        }
//
//        if (avgTeam1 == avgTeam2) {
//            System.out.println("draw");
//        }

        if (avgTeam1 > avgTeam2) {
            System.out.println("team1 " + team1Name + " win");
        } else if (avgTeam1 < avgTeam2) {
            System.out.println("team2 " + team2Name + " win");
        } else {
            System.out.println("draw");
        }


    }

    static int getFrags(Scanner scanner, int numberPlayer) {
//        Scanner scanner = new Scanner(System.in);
//        int temp = 0;
//        System.out.println("Enter frags for player " + numberPlayer);
//        while (true) {
//            if (scanner.hasNextInt()) {
//                temp = scanner.nextInt();
//                break;
//            } else {
//                System.out.println("Wrong data. Try again");
//                scanner.nextLine();
//            }
//        }

//        return temp;




//        System.out.println("Enter frags for player " + numberPlayer);
//        while (true) {
//            if (scanner.hasNextInt()) {
//                return scanner.nextInt();
//            } else {
//                System.out.println("Wrong data. Try again");
//                scanner.nextLine();
//            }
//        }


        System.out.println("Enter frags for player " + numberPlayer);
        do {
            if (scanner.hasNextInt()) {
                return scanner.nextInt();
            } else {
                System.out.println("Wrong data. Try again");
                scanner.nextLine();
            }
        } while (true);
    }
}
