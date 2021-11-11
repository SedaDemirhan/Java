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
		Girilen kelime cumlede 1 �den fazla kullanilmis
      */
		Scanner scan=new Scanner(System.in);
		
		
		System.out.println("l�tfen bir c�mle giriniz:");
		
		String cumle=scan.nextLine().toLowerCase();
		System.out.println("l�tfen bir kelime giriniz:");
		String kelime=scan.next().toLowerCase();
		
		int ilkKullan�mIndexi=cumle.indexOf(kelime);
		int sonKullan�mIndexi=cumle.lastIndexOf(kelime);
		//System.out.println( ilkKullan�mIndexi);
		//System.out.println(sonKullan�mIndexi);
		
		if (ilkKullan�mIndexi==-1) {
			System.out.println("girilen kelime kullan�lmam��");
		}else if(ilkKullan�mIndexi==sonKullan�mIndexi) {
			System.out.println("girilen kelime c�mlede bir kere kullan�lm��.");
			
		}else {
			System.out.println("girilen kelime c�mlede birden fazla kere kullan�lm��");
		}
		
		scan.close();
		
	}
	

}
