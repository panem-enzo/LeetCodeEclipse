package longestCommonPrefix14;

public class Solution {
	public String longestCommonPrefix(String[] strs) {
		
		String temp = "";
		String result = strs[0];
		
		if (strs.length == 1) {
			return result;
		} else {
			for (int i = 1; i < strs.length; i++) {
				if (result.length() < strs[i].length()) {
					boolean flag = true;
					for (int j = 0; j < result.length() && flag; j++) {
						if (strs[i].substring(j, j+1).equals(result.substring(j, j+1))) {
							temp += strs[i].substring(j, j+1);
						} else {
							flag = false;
						}
					}
					result = temp;
				} else {
					boolean flag = true;
					for (int k = 0; k < strs[i].length() && flag; k++) {
						if (strs[i].substring(k, k+1).equals(result.substring(k, k+1))) {
							temp += strs[i].substring(k, k+1);
						} else {
							flag = false;
						}
					}
					result = temp;
				}
				temp = "";
			}
		}
		
        return result;
    }
	
}
