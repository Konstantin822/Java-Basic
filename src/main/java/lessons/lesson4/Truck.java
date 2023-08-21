package lessons.lesson4;

public class Truck {
    public static void main(String[] args) {
        int length = 2;
        int width = 4;
        int height = 6;

        System.out.println(countVolume(length, width, height));
        System.out.println(countVolume(10, width, height));
    }

    static int countVolume(int length, int width, int height) {
        return length * width * height;
    }
}
