package Arrays.easy;

import java.util.Arrays;

public class ShuffleTheArray {
    public static void main(String[] args) {
        int[] arr = {2,5,1,3,4,7};
        System.out.println(Arrays.toString(shuffle(arr,3)));
    }

    static int[] shuffle(int[] nums, int n) {
        int[] res = new int[2 * n];
        int j = 0;
        for (int i = 0; i < res.length; i+=2) {
            res[i] = nums[j];
            res[i + 1] = nums[j + n];
            j++;
        }
        return res;
    }
}
