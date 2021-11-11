package day12_stringManipulations;

import java.util.Scanner;

public class Ödev_02 {

	public static void main(String[] args) {
		/* Kullanicidan isim isteyin Eger
		-
		isim “ a" harfi iceriyorsa “Girdiginiz isim a harfi iceriyor”
		-
		isim “z" harfi iceriyorsa “Girdiginiz isim Z harfi iceriyor”
		-
		ikisi de yoksa “Girdiginiz isim a veya Z harfi icermiyor” yazdirin
		*/
		
        Scanner scan=new Scanner(System.in);
		
		System.out.println("Lütfen isminizi giriniz.");
		String isim=scan.nextLine().toLowerCase();
		
		if(isim.contains("a")) {
			System.out.println("Girdiginiz isim a harfi iceriyor");
		}else if(isim.contains("z")){
			System.out.println("Girdiginiz isim Z harfi iceriyor");
			
		}else {
			System.out.println("Girdiginiz isim a veya Z harfi icermiyor");
			
		}
scan.close();

	}

}
