package day07_ÝfElseStatements;

import java.util.Scanner;

public class C2_ÝfElse01 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);

		System.out.println("Lutfen dikdortgenin kenarlarýný giriniz \nIlk kenari yazinca ENTER'a basiniz.");
		
		double kenar1=scan.nextDouble();
		double kenar2=scan.nextDouble();
		
		if (kenar1==kenar2) {
			System.out.println("Girdiginiz dikdörtgen kare");
			
		} else {
			System.out.println("Girdiginiz dikdörtgen kare deðil");
		}
		
		scan.close();
		
	}

}
