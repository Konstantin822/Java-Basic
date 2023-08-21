package lessons.practise.sqrt;

public class sqrt {
    public static void main(String[] args) {
        int x = 81;
        int sqrt = mySqrt(x);
        System.out.println("Sqrt of " + x + " is " + sqrt);
    }
    public static int mySqrt(int x) {
        if (x == 0) {
            return 0;
        }

        long sqrt = x;

        while (sqrt * sqrt > x) {
            sqrt = (sqrt + x / sqrt) / 2;
        }
        return (int) sqrt;
    }
}
