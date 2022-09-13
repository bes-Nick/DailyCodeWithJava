package Arrays.easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AddToArrayFrom {
    public static void main(String[] args) {
        int[] arr = {1,2,0,0};
        System.out.println(addToArrayForm(arr,34));

    }
    static List<Integer> addToArrayForm(int[] num, int k) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = num.length - 1; i >= 0; i--) {
            arr.add((num[i] + k) % 10);
            k = (num[i] + k) / 10;
        }
        while(k>0) {
            arr.add(k % 10);
            k /= 10;
        }
        Collections.reverse(arr);
        return arr;
    }
}
