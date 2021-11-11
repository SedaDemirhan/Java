package day42_exceptions03;

import java.util.Scanner;

public class MehmetHoca_Exceptions01 {

	public static void main(String[] args) {
//kullanýcýdan yaþýný girmesini isteyin,
//kodunuzu kullanýcý sýfýrdan kucuk bir sayi girerse exception verecek
//þekilde yazýn
		/*
		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen yasýnýzý giriniz: ");
		int yas=scan.nextInt();
		
		if (yas>=0) {
			System.out.println("Girdiðiniz yas :"+yas);
			
		}else {
			throw new IllegalArgumentException();
		}
		System.out.println("kod bloke olamamýþ");
		*/
		//bu þekilde yazdýðýmýzda java excetion  throw eder ama
		//kodumuz da bloke olmuþ olur
		//bloke olmasýný engellemek için kodu try catch surround yapabiliriz
		
		//javaya bir exception throw ettirmek için "throw" ve "new" keyword'leri kullanýlabilir

		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen yasýnýzý giriniz: ");
		int yas=scan.nextInt();
		
		try {
		if (yas>=0) {
			System.out.println("Girdiðiniz yas :"+yas);
			
		}else {
			throw new IllegalArgumentException();
		}
		
		}catch(IllegalArgumentException e) {
			
			e.printStackTrace();
		}
		System.out.println("kod bloke olamamýþ");
		
	}

}
