package Chapter1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.*;

public class StringCompression {
	
	public static void main(String []args){
		
		Scanner in = new Scanner(System.in);
		String str = in.next();
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		int arraysize= 0 ;
		for(char ch : str.toCharArray()){
			if(map.containsKey(ch))
				map.put(ch, map.get(ch)+1);
			else{
				map.put(ch, 1);
				arraysize++;
			}
		}
		List<String> list = new ArrayList<>();
		int i = 0 ;
		for(Map.Entry<Character, Integer> entry : map.entrySet()){
			list.add(entry.getKey()+"");
			list.add(entry.getValue()+"");
		}
		
		for(int j  = 0 ;  j < list.size() ; j++){
			System.out.print(list.get(j));
		}
		
	}

}
