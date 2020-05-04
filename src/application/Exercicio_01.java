package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rent;



public class Exercicio_01 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many rooms will be rented ?");
		int n = sc.nextInt();
		
		
		Rent[] vect = new Rent[10]; 
		
		for (int i=0; i<n; i++) {
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int roow = sc.nextInt();
			vect[roow] = new Rent(name, email, roow);
			System.out.println();
			
		}
		
		System.out.println();
		System.out.println("Busy rooms:");
		
		for (int i=0; i<9; i++ ) {
			if (vect[i] != null) {
				System.out.println(vect[i].toString());
			}
		}
		
		
		
		sc.close();

	}

}
