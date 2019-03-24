package Chapter1;

import java.util.Scanner;

public class OneAway {
	public static void main(String []args){
		
		Scanner in = new Scanner(System.in);
		String str1 = in.next();
		String str2 = in.next();
		boolean b = checkOneAway(str1,str2);
		System.out.println(b);
		}

	private static boolean checkOneAway(String str1, String str2) {

		if(Math.abs(str1.length()-str2.length())>1){
			return false;
		}
		else if (str1.length() == str2.length()){
			boolean b1 = false;
			for(int i = 0 ;i <  str1.length() ;i++){
				if(str1.charAt(i) != str2.charAt(i)){
					if(b1){
						return false;
					}
					b1=true;
				}
			}
			return true;
		}
		else if(Math.abs(str1.length()-str2.length())==1){
			boolean b2 = false;
			int j = 0;
			for(int i = 0  ;i <  str1.length() && j < str2.length() ;i++,j++){
				if(str1.charAt(i) != str2.charAt(j)){
					if(b2){
						return false;
					}
					if(str1.length()>str2.length()){
						i++;
					}
					else{
						j++;
					}
					b2=true;
				}
			}
			
			return true;
		}
		else {
			return false;
		}
	
	}
	
}
