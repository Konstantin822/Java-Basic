package lessons.practise.primeNumber;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter you number: ");
        int number = scanner.nextInt();
        boolean isPrime = isPrimeNumber(number);

        if (isPrime) {
            System.out.println(number + " - prime number");
        } else {
            System.out.println(number + " - number is not prime");
        }
    }

    public static boolean isPrimeNumber(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
