package Arrays.easy;

import java.util.ArrayList;
import java.util.Arrays;

public class SmallerNumbersThanCurrent {
    public static void main(String[] args) {
        int[] arr = {8,1,2,2,3};
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(arr)));
    }
    static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] minCount = new int[nums.length];
        for(int i = 0; i<nums.length; i++) {
            for(int j = 0; j<nums.length; j++) {
                if((j != i) && (nums[j] < nums[i])) {
                    minCount[i]++;
                }
            }
        }
        return minCount;
    }
}
