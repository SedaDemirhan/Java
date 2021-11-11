package day15_forLoops;

import java.util.Scanner;

public class Odev01 {

	public static void main(String[] args) {
		// Kullanicidan bir String isteyin. Kullanicinin girdigi String’in
		//palindrome olup olmadigini kontrol eden bir program yazin.
		
		Scanner scan=new Scanner(System .in);
		System.out.println("lütfen  bir kelime giriniz");
		
		String kelime=scan.nextLine();
		String terstenÝsim= "";
		
		for (int i=0; i <kelime.length();i++) {
			
			terstenÝsim+=kelime.substring(kelime.length()-1-i,kelime.length()- i);
		}
			
		if (kelime.equals(terstenÝsim)) {
				System.out.println("kelimeniz palindrome kelimedir");
		}else {
			System.out.println("kelimeniz palindrome kelime degildir.");
			}
			
		
	scan.close();
	

	}

}
