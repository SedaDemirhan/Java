package day07_ÝfElseStatements;

import java.util.Scanner;

public class C6_IfElseIf02 {

	public static void main(String[] args) {
		//Soru 5) Kullanicidan gun ismini yazmasini isteyin. Girilen isim gecerli bir gun ise gun
		//isminin 1.,2. ve 3.harflerini ilk harf buyuk diger ikisi kucuk olarak yazdirin, gun ismi
		//gecerli degilse “Gecerli gun ismi giriniz” yazdirin
		
     Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen  gün ismini giriniz...");
		
		String gunIsmi=scan.next().toLowerCase();
		
		if (gunIsmi.equals("pazartesi")|| gunIsmi.equals("sali")||
				gunIsmi.equals("carsamba")|| gunIsmi.equals("persembe") ||
				gunIsmi.equals("cuma")){
			System.out.println("Girdiginiz gun haftaici");
		} else if (gunIsmi.equals("cumartesi")|| gunIsmi.equals("pazar")) {
			System.out.println("girdiðiniz gün hafta sonu");
			
		}else {
			System.out.println("lutfen geçerli bir gün ismi giriniz");
		}
		
scan.close();

	}

}
