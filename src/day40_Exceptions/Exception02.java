package day40_Exceptions;

import java.util.Scanner;

public class Exception02 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		int count=1;
		while (count<=34) {
			System.out.println("bolunen say�y� giriniz:");
		int sayi1=scan.nextInt();
		
		System.out.println("b�len say�y� giriniz :");
		int sayi2=scan.nextInt();
		try {
			System.out.println("bol�m :"+ sayi1/sayi2);
		} catch (ArithmeticException e) {
			System.out.println("b�lme i�leminde bolen 0 olamaz !!!");
			System.out.println(e.getMessage());/// handle edilecek veridir.
			}
		count++;
		}
		


		

	}

}
