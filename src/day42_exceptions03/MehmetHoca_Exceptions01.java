package day42_exceptions03;

import java.util.Scanner;

public class MehmetHoca_Exceptions01 {

	public static void main(String[] args) {
//kullan�c�dan ya��n� girmesini isteyin,
//kodunuzu kullan�c� s�f�rdan kucuk bir sayi girerse exception verecek
//�ekilde yaz�n
		/*
		Scanner scan=new Scanner(System.in);
		System.out.println("L�tfen yas�n�z� giriniz: ");
		int yas=scan.nextInt();
		
		if (yas>=0) {
			System.out.println("Girdi�iniz yas :"+yas);
			
		}else {
			throw new IllegalArgumentException();
		}
		System.out.println("kod bloke olamam��");
		*/
		//bu �ekilde yazd���m�zda java excetion  throw eder ama
		//kodumuz da bloke olmu� olur
		//bloke olmas�n� engellemek i�in kodu try catch surround yapabiliriz
		
		//javaya bir exception throw ettirmek i�in "throw" ve "new" keyword'leri kullan�labilir

		
		Scanner scan=new Scanner(System.in);
		System.out.println("L�tfen yas�n�z� giriniz: ");
		int yas=scan.nextInt();
		
		try {
		if (yas>=0) {
			System.out.println("Girdi�iniz yas :"+yas);
			
		}else {
			throw new IllegalArgumentException();
		}
		
		}catch(IllegalArgumentException e) {
			
			e.printStackTrace();
		}
		System.out.println("kod bloke olamam��");
		
	}

}
