package day07_�fElseStatements;

import java.util.Scanner;

public class C4_IfElse03 {

	public static void main(String[] args) {
		// Kullaniciya yasini sorun, eger yas 65�e e�it kucuk ise �emekli olamazsin, calismalisin�, 
		//65�den buyukse �Emekli olabilirsin� yazdirin
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("l�tfen yasinizi giriniz:");
		
		int yas=scan.nextInt();
		
		if(yas<=65) {
			System.out.println("emekli olamazs�n�z");
		} else {
			System.out.println("emekli olabilirsin");
		}
		
		scan.close();
		

	}

}
