package day15_forLoops;

import java.util.Scanner;

public class C08_ForLoops07 {

	public static void main(String[] args) {
		// Kullanicidan bir String isteyin ve Stringi tersine ceviren
		//bir program yazin.
		
		
		Scanner scan=new Scanner(System .in);
		System.out.println("l�tfen tersten yazd�rmak i�in bir kelime giriniz");
		
		String kelime=scan.nextLine();
		
		String terstenKelime="";
		for (int i = 0; i < kelime.length(); i++) {
			terstenKelime+=kelime.substring(kelime.length()-1-i,kelime.length()-i);
			
		}
		System.out.println(terstenKelime);
		scan.close();
		
	}

}
