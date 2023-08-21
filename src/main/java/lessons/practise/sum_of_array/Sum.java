package lessons.practise.sum_of_array;

import java.util.Arrays;

public class Sum {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 11);
        }
        System.out.println(Arrays.toString(array));
        int sum = arraySum(array);
        System.out.println(sum);
    }

    static int arraySum(int[] nums) {
        int sum = 0;

        for (int num : nums) {
            sum += num;
        }
        return sum;
    }
}
