package day41_exception02;

import java.util.Scanner;

public class MehmetHoca_Exception08 {

	public static void main(String[] args) {
	/*Kullan�c�dan �arpma yapmak i�in bir string isteyin.
	 * kullan�c�n�n girdi�i String sadece say�lardan olu�uyorsa,
	 * say�y� 2ile carpip sonucu yazd�r�n
	 * kullan�c� say�lardan olu�mayan bir string girerse 
	 * "girdi�iniz String say�ya cevrilmez" yazd�r�n.
	 */
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("l�tfen 2 ile carpmak i�in bir string giriniz :");
		
		String str=scan.nextLine();
		try {
		System.out.println(2*Integer.parseInt(str));
		
		}catch(NumberFormatException e) {
			System.out.println("girdi�iniz string say�ya �evrilemez");
		}
		
	}

}
