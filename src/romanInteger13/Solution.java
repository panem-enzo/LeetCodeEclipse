package romanInteger13;

import java.util.HashMap;

public class Solution {
	 public int romanToInt(String s) {
	        
        HashMap<Character, Integer> rn = new HashMap<>();
        rn.put('I', 1);
        rn.put('V', 5);
        rn.put('X', 10);
        rn.put('L', 50);
        rn.put('C', 100);
        rn.put('D', 500);
        rn.put('M', 1000);

        int result = 0;

        for (int c = 0; c < s.length(); c++) {
            if (c != s.length()-1) {
                if (s.charAt(c) == 'I' && (s.charAt(c+1) == 'V' || s.charAt(c+1) == 'X')) {
                    result += rn.get(s.charAt(c+1)) - rn.get(s.charAt(c));
                    c++;
                } else if (s.charAt(c) == 'X' && (s.charAt(c+1) == 'L' || s.charAt(c+1) == 'C')) {
                    result += rn.get(s.charAt(c+1)) - rn.get(s.charAt(c));
                    c++;
                } else if (s.charAt(c) == 'C' && (s.charAt(c+1) == 'D' || s.charAt(c+1) == 'M')) {
                    result += rn.get(s.charAt(c+1)) - rn.get(s.charAt(c));
                    c++;
                } else {
                	result += rn.get(s.charAt(c));
                }
            } else {
            	result += rn.get(s.charAt(c));
            }
        }

        return result;

    }
}
