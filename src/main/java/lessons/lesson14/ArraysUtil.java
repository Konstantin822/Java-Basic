package lessons.lesson14;

public class ArraysUtil {
    int[] array = new int[] {1, 2, 3, 4, 5};
    public static int getElementIndex(int[] array, int element) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                return i;
            }
        }
        return -1;
    }
}
