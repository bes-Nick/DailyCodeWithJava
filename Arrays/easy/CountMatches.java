package Arrays.easy;

import java.util.ArrayList;
import java.util.List;

public class CountMatches {
    public static void main(String[] args) {

    }

    static  int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int temp;
        if (ruleKey.equals("type")) {
            temp = 0;
        } else if (ruleKey.equals("color")) {
            temp = 1;
        } else {
            temp = 2;
        }
        int count = 0;
        for (List<String> item : items)
            if (item.get(temp).equals(ruleValue))
                count++;
        return count;
    }
}
