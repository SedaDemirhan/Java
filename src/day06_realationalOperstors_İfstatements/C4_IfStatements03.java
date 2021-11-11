package day06_realationalOperstors_Ýfstatements;

import java.util.Scanner;

public class C4_IfStatements03 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen istediðiniz gun isminin ilk harfini giriniz");

		char harf = scan.next().toLowerCase().charAt(0);
		if (harf == 'p' || harf == 'p') {
			System.out.println("pazartesi,persembe veya pazar");

		}
		if (harf == 's') {
			System.out.println("sali");

		}
		if (harf == 'c') {
			System.out.println("carsamba,cuma,cumartesi");
			
		}
scan.close();
	}

}
