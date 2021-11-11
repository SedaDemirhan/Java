package day41_exception02;

import java.util.Scanner;

public class MehmetHoca_Exception08 {

	public static void main(String[] args) {
	/*Kullanýcýdan çarpma yapmak için bir string isteyin.
	 * kullanýcýnýn girdiði String sadece sayýlardan oluþuyorsa,
	 * sayýyý 2ile carpip sonucu yazdýrýn
	 * kullanýcý sayýlardan oluþmayan bir string girerse 
	 * "girdiðiniz String sayýya cevrilmez" yazdýrýn.
	 */
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("lütfen 2 ile carpmak için bir string giriniz :");
		
		String str=scan.nextLine();
		try {
		System.out.println(2*Integer.parseInt(str));
		
		}catch(NumberFormatException e) {
			System.out.println("girdiðiniz string sayýya çevrilemez");
		}
		
	}

}
