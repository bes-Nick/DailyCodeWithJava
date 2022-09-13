package Arrays.easy;

import java.util.Arrays;

public class BuildArray {
        public static void main(String[] args) {
            int[] nums = {0,2,1,5,3,4};
            System.out.println(Arrays.toString(buildArray(nums)));
        }

        static int[] buildArray(int[] arr) {
            int[] temp = new int[arr.length];
            for (int i = 0; i < arr.length; i++) {
                temp[i] = arr[arr[i]];
            }
            return temp;
        }
    }


