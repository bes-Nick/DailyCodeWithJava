package Arrays.easy;

import java.util.Arrays;

public class RunningSum {
    public static void main(String[] args) {
        int[] arr = {3,1,2,10,1};
        System.out.println(Arrays.toString(runningSum(arr)));
    }

    static int[] runningSum(int[] nums) {
        int[] runningSum = new int[nums.length];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            runningSum[i] = sum;
        }
        return runningSum;
    }
}
