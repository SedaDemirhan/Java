package day40_Exceptions;

import java.util.Scanner;

public class Exception_mehmetHoca02 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		int count=0;
		while (count<=100) {
		System.out.println("bolunen say�y� giriniz:");
		int sayi1=scan.nextInt();
		
		System.out.println("b�len say�y� giriniz :");
		int sayi2=scan.nextInt();
		// java exception'i handle etmek i�in try_catch blogu olu�turmu�
		
		System.out.println("i�lem no :"+count);
		try {
			System.out.println("b�lme i�leminin sonucu :"+sayi1/sayi2);
		}catch(ArithmeticException e){
			System.out.println("say�y� s�f�ra b�lemezsin");
		}
		
		
		count++;
		}

	}

}
