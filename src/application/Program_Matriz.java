package application;

import java.util.Scanner;

public class Program_Matriz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[][] mat = new int [n][n];
		
		for(int i=0; i<mat.length; i++) {
			for(int j=0; j<mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Main diagonal:");
		for(int i=0; i<n; i++) {
			System.out.print(mat[i][i]+" ");
		}
		
		int soma = 0;
		System.out.println();
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(mat[i][j] < 0) {
				soma += 1;	
				}
			}
			
		}
		System.out.println("Negative numbers = "+soma);
		sc.close();

	}

}
