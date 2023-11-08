package longestCommonPrefix14;

public class Main {

	public static void main(String[] args) {
		Solution sol = new Solution();
		String[] array1 = {"flower", "flow", "flight"};
		System.out.println(sol.longestCommonPrefix(array1));
		
		String[] array2 = {"dog", "racecar", "car"};
		
		if (sol.longestCommonPrefix(array2).equals("")) {
			System.out.println("No common prefix");
		}
		
		String[] array3 = {"llightyagami", "llawliet", "llwlietl"};
		System.out.println(sol.longestCommonPrefix(array3));

	}

}
