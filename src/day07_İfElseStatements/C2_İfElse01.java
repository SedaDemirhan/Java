package day07_�fElseStatements;

import java.util.Scanner;

public class C2_�fElse01 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);

		System.out.println("Lutfen dikdortgenin kenarlar�n� giriniz \nIlk kenari yazinca ENTER'a basiniz.");
		
		double kenar1=scan.nextDouble();
		double kenar2=scan.nextDouble();
		
		if (kenar1==kenar2) {
			System.out.println("Girdiginiz dikd�rtgen kare");
			
		} else {
			System.out.println("Girdiginiz dikd�rtgen kare de�il");
		}
		
		scan.close();
		
	}

}
