package day17_nestedForLoopsWhileLoops;

import java.util.Scanner;

public class C07_WhileLoop05 {

	public static void main(String[] args) {
		/*
		 Kullanýcýdan toplamak üzere sayi isteyin 
		 toplam 200 oluncaya kadar sayi istemeye devam edin
		 toplam 200 geçtiðinde kullanýcýnýn kaç sayi girdiðini ve
		 bu sayýlarýn toplamýnýn kac oldugunu yazdýrýn.
		 */

		Scanner scan=new Scanner(System.in);
		
		
	
		
		int sayi=0;
		int toplam=0;
		int sayac=0;
		while(toplam<200) {
			System.out.println("lütfen toplamak icin bir tamsayi giriniz");
			sayi=scan.nextInt();
			toplam+=sayi;
			sayac++;
		}
		
		System.out.println("toplam"+sayac+"adet sayý girdiniz ve bu sayýlarýn toplamý:"+ toplam);	
		
			
		
		scan.close();
		
	}

}
