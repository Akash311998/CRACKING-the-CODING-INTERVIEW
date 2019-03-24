package Chapter1;

import java.util.*;
import java.util.Scanner;

public class ZeroMatrix {
	
	public static void main(String[]args){
		
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int matrix[][] = new int[n][n];
		for(int i  = 0 ; i < n;i++){
			for(int j  = 0 ; j < n ;j++){
				matrix[i][j] = in.nextInt();
			}
		}
		Set<Integer> rowZeroIndex = new HashSet<>();
		Set<Integer> colZeroIndex = new HashSet<>();
		
		for(int i  = 0 ; i < n;i++){
			for(int j  = 0 ; j < n ;j++){
				if(matrix[i][j] == 0){
					rowZeroIndex.add(i);
					colZeroIndex.add(j);
				}
			}
		}
		
		for(int a : rowZeroIndex.toArray(new Integer[0])){
			for(int col = 0 ; col< n ;col++){
				matrix[a][col] = 0;
			}
		}
		for(int a : colZeroIndex.toArray(new Integer[0])){
			for(int row = 0 ; row< n ;row++){
				matrix[row][a] = 0;
			}
		}
		for(int i  = 0 ; i < n;i++){
			for(int j  = 0 ; j < n ;j++){
				System.out.print(matrix[i][j]);
			}
			System.out.println("");
		}
		
		
	}

}
