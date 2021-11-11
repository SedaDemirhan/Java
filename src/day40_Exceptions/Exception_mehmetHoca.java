package day40_Exceptions;

import java.util.Scanner;

public class Exception_mehmetHoca {

	public static void main(String[] args) {
		
	
		Scanner scan=new Scanner(System.in);

		System.out.println("bolunen sayýyý giriniz:");
		int sayi1=scan.nextInt();
		
		System.out.println("bölen sayýyý giriniz :");
		int sayi2=scan.nextInt();
		// java exception'i handle etmek için try_catch blogu oluþturmuþ
		try {
		System.out.println("bölme iþleminin sonucu :"+sayi1/sayi2);
		
		}catch(ArithmeticException e) {
			System.out.println("sayýyý sýfýra bölemezsin");
		}
		
		}
	}


