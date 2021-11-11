package day14_methodCreationForLoop;

import java.util.Scanner;

public class C02_MethodCreation02 {

	public static void main(String[] args) {
	/*Kullaniciya kac sayi toplamak istedigini sorun.
	 *  Kullanici 2,3 veya 4 degerini girerse, kullanicidan bu sayilari girmesini isteyin ve 
	 *  sayilarin toplamini yazdirin. 
	 Kullanici toplamak istedigi sayi adedini 4�den buyuk girerse,
	  �Cok sayi girdiniz, ben toplayamam� yazdirin.
	 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Kac sayi, toplamak istersiniz...");
		
		int sayiAdedi=scan.nextInt();
		
		if (sayiAdedi<2) {
			System.out.println("toplamak icin en az 2 sayi girmelisinzi");
		}else if (sayiAdedi==2) {
			ikiSayiTopla();
		}else if (sayiAdedi==3) {
			�cSayiTopla();
		}else if(sayiAdedi==4) {
			d�rtSayitopla();
		}else {
			System.out.println("Cok sayi girdiniz, ben toplayamam");
		}
scan.close();
	}

 private static void d�rtSayitopla() {
	   Scanner scan=new Scanner(System.in);
		System.out.println("L�tfen �c tamsayi giriniz:");
		   int sayi1=scan.nextInt();
		   int sayi2=scan.nextInt();
		   int sayi3=scan.nextInt();
		   int sayi4=scan.nextInt();
		   System.out.println("say�lar�n toplam�:"+(sayi1+sayi2+sayi3+sayi4));
		scan.close();
		
		
	}

private static void �cSayiTopla() {
	   Scanner scan=new Scanner(System.in);
		System.out.println("L�tfen �c tamsayi giriniz:");
		   int sayi1=scan.nextInt();
		   int sayi2=scan.nextInt();
		   int sayi3=scan.nextInt();
		   System.out.println("say�lar�n toplam�:"+(sayi1+sayi2+sayi3));
		scan.close();
	}

public static void ikiSayiTopla() {
	Scanner scan=new Scanner(System.in);
	System.out.println("L�tfen iki tamsayi giriniz:");
	   int sayi1=scan.nextInt();
	   int sayi2=scan.nextInt();
	   System.out.println("say�lar�n toplam�:"+(sayi1+sayi2));
		
		scan.close();
		
	}

}
