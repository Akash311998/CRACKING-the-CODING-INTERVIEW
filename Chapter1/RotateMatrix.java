package Chapter1;

import java.util.Scanner;

public class RotateMatrix {

	public static void main(String[]args){
		int matrix[][] =  new int[4][4];
		Scanner in = new Scanner(System.in);
		for(int i =0 ; i < 4 ;i++){
			for(int j = 0 ; j < 4 ; j++){
				matrix[i][j] = in.nextInt();
			}
		}
		int a1 =0 , a2 = 0 ;
		int temp2 = 0 ;
		for(a1 = 0 ; a1 < 4 ; a1++){
			a2=0;
			for(a2 = 0 ; a2 < 4 ;a2++){
			if(a1 <= a2){
				continue;
			}
			temp2  = matrix[a1][a2];
			matrix[a1][a2] = matrix[a2][a1] ;
			matrix[a2][a1] = temp2;
			}
		}
		for(int i =0 ; i < matrix.length ;i++){
			for(int j = 0 ; j < matrix[i].length ; j++){
				System.out.print(matrix[i][j]);
			}
			System.out.println("");
		}	
	}
}
