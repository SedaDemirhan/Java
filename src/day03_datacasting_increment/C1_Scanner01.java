package day03_datacasting_increment;

import java.util.Scanner;

public class C1_Scanner01 {

	public static void main(String[] args) {
		
//Kullanicidan ismini ve soyismini isteyip asagidaki sekilde yazdirin
		//Isminiz : Mehmet
		//Soyisminiz : Bulut
		//Kursumuza katiliminiz alinmistir,tesekkur ederiz
		
		
		Scanner scan= new Scanner(System.in);
		System.out.println("lütfen isminizi ve soyisminizi yaziniz,\nisminizi yazdiktan sonra ENTER'a basiniz");
		
	String name=scan.nextLine();
	String surname=scan.nextLine();
	System.out.println("isminiz:"+name +"\nsoyisminiz:"+surname +"\nkursumuza katýlým alinmiþtir,teþekküler");

	scan.close();
	
	}
	
	

}
