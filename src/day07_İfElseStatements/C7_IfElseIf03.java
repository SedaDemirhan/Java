package day07_ÝfElseStatements;

import java.util.Scanner;

public class C7_IfElseIf03 {

	public static void main(String[] args) {
		// Soru 7) Kullanicidan 100 uzerinden notunu isteyin.
		// Not’u harf sistemine cevirip yazdirin.
		// 50’den kucukse “D”, 50 60 arasi “C”, 60 80 arasi “B”,
		// 80’nin uzerinde ise “A”

		Scanner scan = new Scanner(System.in);

		System.out.println("lütfen notunuzu giriniz:");

		double not = scan.nextDouble();

		if (not > 100 || not < 0) {
			System.out.println("geçersiz not ");
		} else if (not < 50) {
			System.out.println("notunuz D");
		} else if (not <= 60) {
			System.out.println("notunuz C");
		} else if (not < 80) {
			System.out.println("notunuz B");
		} else {
			System.out.println("notunuz A");
		}
scan.close();

	}

}
