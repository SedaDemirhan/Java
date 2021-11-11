package day40_Exceptions;

import java.util.Scanner;

public class Exception01 {
	public static void main(String[] args) {
		
	
//kullanýcýdan alacaðýnýz iki tam sayýnýn bölümünü yazdýrýnýz
	
	Scanner scan=new Scanner(System.in);

	System.out.println("bolunen sayýyý giriniz:");
	int sayi1=scan.nextInt();
	
	System.out.println("bölen sayýyý giriniz :");
	int sayi2=scan.nextInt();
	
	try {
		System.out.println("bolüm :"+ sayi1/sayi2);
	} catch (ArithmeticException e) {
		System.out.println("bölme iþleminde bolen 0 olamaz !!!");
		
	}
	
	
	
	}

}
