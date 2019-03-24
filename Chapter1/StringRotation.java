package Chapter1;

import java.util.Scanner;

public class StringRotation {
	
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		String str1 = in.next();
		String str2 = in.next();
		
		str1 = str1+str1;
		if(str1.contains(str2)){
			System.out.println("True");
		}
		else{
			System.out.println("False");
		}
	}

}
