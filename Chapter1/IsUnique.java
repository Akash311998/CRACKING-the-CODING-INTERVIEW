package Chapter1;

//Complexity O(N)
//In case of Extra Space is not Required the Complezity will be O(N^2)

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class IsUnique {
	public static void main(String[]args){
		Scanner in = new Scanner(System.in);
		String str = in.next();
		str = str.toLowerCase();
		boolean b  = isUnique(str);
		if(b)
			System.out.println("Unique");
		else 
			System.out.println("Not Unique");
	}

	private static boolean isUnique(String str) {
		Map<Character,Integer> map  = new HashMap<Character,Integer>();
		for(char ch: str.toCharArray()){
			if(map.containsKey(ch))
				return false;
			else
				map.put(ch, 1);
		}
		return true;
	}
	
}