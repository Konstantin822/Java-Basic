package lessons.practise.hypotenuse;

import java.util.Scanner;

public class Hypotenuse {
    public static void main(String[] args) {
        int a;
        int b;
        double c;
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter side a: ");
//        a = scanner.nextInt();
//
//        System.out.println("Enter side b: ");
//        b = scanner.nextInt();
//
//        c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
//        System.out.println("Side c = " + c);
        hypotenuse(scanner);
    }

    static int hypotenuse(Scanner scanner) {
        int a = 0;
        int b = 0;
        double c;
        System.out.println("Enter side a: ");
        if (scanner.hasNextInt()) {
            a = scanner.nextInt();
        } else {
            System.out.println("Enter side a: ");
        }
        System.out.println("Enter side b: ");
        if (scanner.hasNextInt()) {
            b = scanner.nextInt();
        } else {
            System.out.println("Enter side b: ");
        }
        c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        System.out.println("Side c = " + c);
        return (int) c;
    }
}
