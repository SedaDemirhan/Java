package day12_stringManipulations;

import java.util.Scanner;

public class �dev_01 {

	public static void main(String[] args) {
		// Kullanicidan isim ve soyismini isteyin ve hangisinin daha uzun oldugunu yazdirin
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("L�tfen isminizi giriniz.");
		String isim=scan.nextLine();
		
		System.out.println("L�tfen soyisminizi giriniz.");
		String soyisim=scan.nextLine();
		
		if (isim.length()>soyisim.length()) {
			System.out.println("isminizin harf say�s� soyisminizin harf say�s�ndan uzundur");
			
		}else {
			System.out.println("soyisminiz isminizden uzundur.");
		}
		scan.close();
		
	}

}
