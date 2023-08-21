package lessons.palindrome;

public class Palindrome {
    public static void main(String[] args) {
        int number = 569459;

        if (isPalindrome(number)) {
            System.out.println(number + " is palindorme");
        } else {
            System.out.println(number + " is not palindrome");
        }
    }

    public static boolean isPalindrome(int number) {
        if (number < 0 || (number != 0 && number % 10 == 0)) {
            return false;
        }
        int reversedNumber = 0;
        int originalNumber = number;

        while (number > 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }
        return originalNumber == reversedNumber;
    }
}

