package day07_ÝfElseStatements;

import java.util.Scanner;

public class C4_IfElse03 {

	public static void main(String[] args) {
		// Kullaniciya yasini sorun, eger yas 65’e eþit kucuk ise “emekli olamazsin, calismalisin”, 
		//65’den buyukse “Emekli olabilirsin” yazdirin
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("lütfen yasinizi giriniz:");
		
		int yas=scan.nextInt();
		
		if(yas<=65) {
			System.out.println("emekli olamazsýnýz");
		} else {
			System.out.println("emekli olabilirsin");
		}
		
		scan.close();
		

	}

}
