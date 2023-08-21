package lessons.lesson13.enumeration;

import java.util.Scanner;

public class Exam {
    public static void main(String[] args) {
        runApp();
        System.out.println(DriverLicense.counter);
    }
    public static void runApp() {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        do {
            String type = scanner.next();
            TransportType transportType = TransportType.valueOf(type.toUpperCase());
            int years = scanner.nextInt();

            boolean ok = false;

            switch (transportType) {
                case CAR: {
                    System.out.println(transportType.getTitle() + TransportCategory.B);
                    ok = checkYears(years, TransportCategory.B);
                    break;
                }
                case MOTORCYCLE: {
                    System.out.println(transportType.getTitle() + TransportCategory.A);
                    ok = checkYears(years, TransportCategory.A);
                    break;
                }
                case BUS: {
                    System.out.println(transportType.getTitle() + TransportCategory.D);
                    ok = checkYears(years, TransportCategory.D);
                    break;
                }
                case TRUCK: {
                    System.out.println(transportType.getTitle() + TransportCategory.C);
                    ok = checkYears(years, TransportCategory.C);
                    break;
                }
            }

            if (ok) {
                System.out.println("Права выданы");
            } else {
                System.out.println("Недостаточно стажа");
            }
            i++;
        } while (i < 2);
    }

    private static boolean checkYears(int years, TransportCategory transportCategory) {
        switch (transportCategory) {
            case A: {
                return years > 3;
            }
            case B: {
                return years > 0;
            }
            case C: {
                return years > 5;
            }
            case D: {
                return years > 7;
            }
            default: {
                return false;
            }
        }
    }
}

