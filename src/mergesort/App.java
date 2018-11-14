package mergesort;

import java.util.Random;

public class App {

    public static void main(String[] args) {

        Random random = new Random();

        int[] nums = new int[100];

        for (int j = 0; j < nums.length; j++)
            nums[j] = random.nextInt(100) - 50;

        // O(n log n)
        Mergesort mergesort = new Mergesort(nums);
        mergesort.sort();
        mergesort.showResult();
    }
}
