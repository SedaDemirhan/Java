package day12_stringManipulations;

import java.util.Scanner;

public class C02_StringManipulation02 {

	public static void main(String[] args) {
/*Kullanicidan ismini, soyismini ve kredi karti bilgisini isteyin
	ve asagidaki gibi yazdirin
	isim-soyisim: M***** B*******
     kart no:**** **** **** 1234
		*/
		Scanner scan=new Scanner(System.in);
		
		System.out.println("L�tfen isminizi giriniz:");
		String isim=scan.nextLine();
		System.out.println("L�tfen soyisminizi giriniz:");
		String soyisim=scan.nextLine();
		System.out.println("L�tfen kart numaran�z� giriniz:");
		String kkNo=scan.nextLine();
		
		String isimD�zenlenmis=isim.substring(0,1).toUpperCase() + isim.substring(1).replaceAll("\\w","*");
		String soyisimD�zenlenmis=soyisim.substring(0,1).toUpperCase()+soyisim.substring(1).replaceAll("\\w", "*");
		
		 
		String kkNoD�zenlenmis="**** **** ****" + kkNo.substring(15);
		
		System.out.println("isim-soyisim:"+isimD�zenlenmis+" "+soyisimD�zenlenmis+"\n kart no:"+ kkNoD�zenlenmis);
		
		scan.close();
		
		
		
		
		
		
		
		
		
	}

}
