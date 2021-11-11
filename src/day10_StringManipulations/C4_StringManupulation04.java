package day10_StringManipulations;

import java.util.Scanner;

public class C4_StringManupulation04 {

	public static void main(String[] args) {
		/*Kullanicidan bir cumle ve bir kelime isteyin, kelimenin cumledeki
		kullanimina bakarak asagidaki 3 cumleden uygun olani yazdirin
		-
		Girilen kelime cumlede kullanilmamis
		-
		Girilen kelime cumlede 1 kere kullanilmis
		-
		Girilen kelime cumlede 1 ’den fazla kullanilmis
      */
		Scanner scan=new Scanner(System.in);
		
		
		System.out.println("lütfen bir cümle giriniz:");
		
		String cumle=scan.nextLine().toLowerCase();
		System.out.println("lütfen bir kelime giriniz:");
		String kelime=scan.next().toLowerCase();
		
		int ilkKullanýmIndexi=cumle.indexOf(kelime);
		int sonKullanýmIndexi=cumle.lastIndexOf(kelime);
		//System.out.println( ilkKullanýmIndexi);
		//System.out.println(sonKullanýmIndexi);
		
		if (ilkKullanýmIndexi==-1) {
			System.out.println("girilen kelime kullanýlmamýþ");
		}else if(ilkKullanýmIndexi==sonKullanýmIndexi) {
			System.out.println("girilen kelime cümlede bir kere kullanýlmýþ.");
			
		}else {
			System.out.println("girilen kelime cümlede birden fazla kere kullanýlmýþ");
		}
		
		scan.close();
		
	}
	

}
