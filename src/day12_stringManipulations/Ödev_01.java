package day12_stringManipulations;

import java.util.Scanner;

public class Ödev_01 {

	public static void main(String[] args) {
		// Kullanicidan isim ve soyismini isteyin ve hangisinin daha uzun oldugunu yazdirin
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lütfen isminizi giriniz.");
		String isim=scan.nextLine();
		
		System.out.println("Lütfen soyisminizi giriniz.");
		String soyisim=scan.nextLine();
		
		if (isim.length()>soyisim.length()) {
			System.out.println("isminizin harf sayýsý soyisminizin harf sayýsýndan uzundur");
			
		}else {
			System.out.println("soyisminiz isminizden uzundur.");
		}
		scan.close();
		
	}

}
