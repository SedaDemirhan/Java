package day07_ÝfElseStatements;

import java.util.Scanner;

public class C8_NestedIfElse {

	public static void main(String[] args) {
// Kullanicidan cinsiyet ve yas aliniz
// Eger calisan kadinsa 60 yasindan buyuk oldugunda emekli olabilir,
// calisan erkekse 65 yasindan buyukse emekli olabilir yazdirin
// emekli olamayacaksa emekli olamazsin daha ... yil calisman lazim yazdirin
		
     Scanner scan= new Scanner(System.in);
		
		System.out.println("lütfen cinsiyetinizi giriniz \nErkek icin E,Kdin icin K giriniz");
		
		char cinsiyet=scan.next().toUpperCase().charAt(0);
		
		System.out.println("lütfenyasinizi tamsayi olarak giriniz");
		
		int yas=scan.nextInt();
		
		if (cinsiyet=='K') {
			if (yas>=60) {
				System.out.println("emekli olabilirsin");
			}else {
				System.out.println("emekli olamazsýn \nDaha " +(60-yas)+ "yil calismalisin");
			}
		
			
	}else if(cinsiyet=='E')

	{
		if (yas >= 65) {
			System.out.println("emekli olabilirsin");
		} else {
			System.out.println("emekli olamazsýn\nDaha "  +(60-yas)+  "yil calismalisin");
		}

	}else
	{
		System.out.println("erkek için E,kadin icin K giriniz.");
	}
 scan.close();
 
	}
}
