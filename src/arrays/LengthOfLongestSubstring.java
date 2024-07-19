package arrays;

import java.util.HashMap;
import java.util.Map;

public class LengthOfLongestSubstring {
    public static void main(String[] args) {
        String s = "tmmzuxt";
        System.out.println(lengthOfLongestSubstring(s));

    }

    public static int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> bag = new HashMap<>();
        int maxLen = 0;
        int start = 0;
        int curLen = 0;
        for (int i = 0; i < s.length(); i++) {
            Character x = s.charAt(i);
            if (bag.get(x) != null && bag.get(x) >= start) {
                start = bag.get(x) + 1;
            }
            bag.put(x, i);
            curLen = i - start + 1;
            maxLen = Math.max(curLen, maxLen);
        }
        //System.out.println(bag);

        return maxLen;
    }

}
