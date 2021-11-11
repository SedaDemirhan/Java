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
		
		System.out.println("Lütfen isminizi giriniz:");
		String isim=scan.nextLine();
		System.out.println("Lütfen soyisminizi giriniz:");
		String soyisim=scan.nextLine();
		System.out.println("Lütfen kart numaranýzý giriniz:");
		String kkNo=scan.nextLine();
		
		String isimDüzenlenmis=isim.substring(0,1).toUpperCase() + isim.substring(1).replaceAll("\\w","*");
		String soyisimDüzenlenmis=soyisim.substring(0,1).toUpperCase()+soyisim.substring(1).replaceAll("\\w", "*");
		
		 
		String kkNoDüzenlenmis="**** **** ****" + kkNo.substring(15);
		
		System.out.println("isim-soyisim:"+isimDüzenlenmis+" "+soyisimDüzenlenmis+"\n kart no:"+ kkNoDüzenlenmis);
		
		scan.close();
		
		
		
		
		
		
		
		
		
	}

}
