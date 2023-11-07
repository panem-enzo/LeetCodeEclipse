package containsDuplicate217;

import java.util.HashMap;

public class Solution {
	public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        if (nums.length == 1 || nums.length == 0) {
            return false;
        } else {
            for (int num:nums) {
                if (hm.containsKey(num) == false) {
                    hm.put(num, 1);
                } else {
                    int current = hm.get(num);
                    hm.replace(num, ++current);
                } 
                if (hm.get(num) >= 2) {
                    return true;
                }
            }
            return false;
        }
    }
}
