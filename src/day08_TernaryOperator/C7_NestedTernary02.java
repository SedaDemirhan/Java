package day08_TernaryOperator;

import java.util.Scanner;

public class C7_NestedTernary02 {

	public static void main(String[] args) {
// Kullanicidan dikdortgenin uzunlugunu ve genisligini alin, 
//girilen degerlere gore dikdorgenin kare olup olmadigini yazdirin.
    Scanner scan= new Scanner(System.in);
		
		System.out.println("Lütfen dikdörtgenin kenar uzunluklarýný giriniz");
		
		double sayi1=scan.nextDouble();
		double sayi2=scan.nextDouble();
		
		System.out.println( sayi1<=0 || sayi2<=0 ? "lütfen gecerli uzunluk giriniz": 
			sayi1==sayi2 ? "Kare": "kare degil");
		scan.close();
		
	}

}
