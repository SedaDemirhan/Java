package day17_nestedForLoopsWhileLoops;

import java.util.Scanner;

public class C07_WhileLoop05 {

	public static void main(String[] args) {
		/*
		 Kullan�c�dan toplamak �zere sayi isteyin 
		 toplam 200 oluncaya kadar sayi istemeye devam edin
		 toplam 200 ge�ti�inde kullan�c�n�n ka� sayi girdi�ini ve
		 bu say�lar�n toplam�n�n kac oldugunu yazd�r�n.
		 */

		Scanner scan=new Scanner(System.in);
		
		
	
		
		int sayi=0;
		int toplam=0;
		int sayac=0;
		while(toplam<200) {
			System.out.println("l�tfen toplamak icin bir tamsayi giriniz");
			sayi=scan.nextInt();
			toplam+=sayi;
			sayac++;
		}
		
		System.out.println("toplam"+sayac+"adet say� girdiniz ve bu say�lar�n toplam�:"+ toplam);	
		
			
		
		scan.close();
		
	}

}
