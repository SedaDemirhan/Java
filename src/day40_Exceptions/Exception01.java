package day40_Exceptions;

import java.util.Scanner;

public class Exception01 {
	public static void main(String[] args) {
		
	
//kullan�c�dan alaca��n�z iki tam say�n�n b�l�m�n� yazd�r�n�z
	
	Scanner scan=new Scanner(System.in);

	System.out.println("bolunen say�y� giriniz:");
	int sayi1=scan.nextInt();
	
	System.out.println("b�len say�y� giriniz :");
	int sayi2=scan.nextInt();
	
	try {
		System.out.println("bol�m :"+ sayi1/sayi2);
	} catch (ArithmeticException e) {
		System.out.println("b�lme i�leminde bolen 0 olamaz !!!");
		
	}
	
	
	
	}

}
