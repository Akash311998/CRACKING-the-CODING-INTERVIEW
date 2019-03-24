package Chapter1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//Permutation  : same number of same words 
public class CheckPermutation {

	private static boolean chechPermutationWithOutSorting(String str1, String str2) {
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for (char ch : str1.toCharArray()) {
			if (map.containsKey(ch))
				map.put(ch, map.get(ch) + 1);
			else
				map.put(ch, 1);
		}
		HashMap<Character, Integer> map1 = new HashMap<Character, Integer>();
		for (char ch : str2.toCharArray()) {
			if (map1.containsKey(ch))
				map1.put(ch, map1.get(ch) + 1);
			else
				map1.put(ch, 1);
		}

		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			if (map1.containsKey(entry.getKey()) && map1.get(entry.getKey()) == entry.getValue()) {

			} else {
				return false;
			}
		}
		return true;
	}

	private static boolean chechPermutationBySorting(String str1, String str2) {
		char ch1[] = str1.toCharArray();
		char ch2[] = str2.toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		if (new String(ch1).equalsIgnoreCase(new String(ch2)))
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str1 = in.next();
		String str2 = in.next();
		boolean b = chechPermutationBySorting(str1, str2);
		boolean b2 = chechPermutationWithOutSorting(str1, str2);

		if (b)
			System.out.println("Permutation");
		else
			System.out.println("Not Permutation");

		if (b2)
			System.out.println("Permutation");
		else
			System.out.println("Not Permutation");
	}
}
