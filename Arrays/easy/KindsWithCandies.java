package Arrays.easy;

import java.util.ArrayList;
import java.util.Arrays;


public class KindsWithCandies {
    public static void main(String[] args) {
       int[] candies = {12,1,12};
        System.out.println(kidsWithCandies(candies,10));
    }
    static ArrayList<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> res = new ArrayList<>();
        int  max = 0;
        for(int i = 0; i < candies.length; i++){
            max = Math.max(max, candies[i]);
        }
        for(int i = 0; i < candies.length; i++){
            res.add((candies[i] + extraCandies) >= max);
        }
        return res;
    }
}
