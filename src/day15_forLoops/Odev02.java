package day15_forLoops;

import java.util.Scanner;

public class Odev02 {

	public static void main(String[] args) {
		//Kullanicidan iki sayi isteyin. Girilen sayilar ve aralarindaki tum tamsayilari
		//toplayip, sonucu yazdiran bir program yaziniz

		Scanner scan=new Scanner(System.in);
		
	System.out.println("L�tfen iki tamsayi giriniz:");
	
	int sayi1=scan.nextInt();
	int sayi2=scan.nextInt();
	int toplam=0;
	
	
	if (sayi1 < sayi2) {
		for (int i = sayi1; i <= sayi2; i++) {
			toplam += i;
		}
		System.out.println(sayi1 + " ile " + sayi2 + " arasindaki sayilar�n toplami :  " + toplam);
	
	} else if (sayi1 > sayi2) {
		for (int i = sayi2; i <= sayi1; i++) {
			toplam += i;
		}
		System.out.println(sayi1 + " ile " + sayi2 + " aras�ndaki sayilarin toplami :  " + toplam);
	
	} else {
		System.out.println("Say�lar esit ve toplam� : " + (sayi1 + sayi2));
	}
	
	scan.close();
	}

}
