package Chapter1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
Permutation Palindrome is a String which can be Palindrome by Rearranging the Words of the String 
for this String must contains all the character with even count and at max only one char with odd count */


public class PermutationPalindrome {
	
	public static void main(String []args){
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		for(char ch : str.toCharArray()){
			if(ch == ' ')continue;
			if(map.containsKey(ch)){
				map.put(ch, map.get(ch)+1);
			}
			else{
				map.put(ch, 1);
			}
		}
		boolean b = false;
		for(Map.Entry<Character, Integer> entry : map.entrySet()){
			if(entry.getValue() %2 != 0){
				if(b){
					System.out.println("false");
					System.exit(0);
				}
				b =true;
			}
		}
		System.out.println("True");
	}
	
}
