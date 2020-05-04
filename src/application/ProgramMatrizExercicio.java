package application;

import java.util.Scanner;

public class ProgramMatrizExercicio {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int M = sc.nextInt();
		int N = sc.nextInt();
		
		int mat[][] = new int [M][N];
		
		for(int i=0; i<mat.length; i++) {
			for(int j=0; j<mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		int n = sc.nextInt();
		
		for (int i=0; i<mat.length; i++) {
			for(int j=0; j<mat[i].length; j++) {
				if(n == mat[i][j]) {
					System.out.println("Position "+ i +"," + j + ":");
				
					if(i > 0) {
						System.out.println("Up: " + mat[i-1][j]);
					}
					if (i < mat[i].length) {
						System.out.println("Down: " + mat[i+1][j]);
					}
					if(j > 0) {
						System.out.println("Left: " + mat[i][j-1]);
					}
					if(j < mat.length ) {
						System.out.println("Right: " + mat[i][j+1]);
					}
				}
			}
		}
				
		
		
		
		
		
		sc.close();

	}

}
