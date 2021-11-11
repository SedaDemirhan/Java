package day14_methodCreationForLoop;

import java.util.Scanner;

public class C01_MethodCreation01 {

	public static void main(String[] args) {
	/* Kullanicidan bir sayi alin.
	 i)Bu sayinin tek mi cift mi oldugunu, 
	ii)sifirdan buyuk mu kucuk mu oldugunu, 
	iii)ayrica ve 100’den buyukse birler,
		onlar ve yuzler basamagindaki rakamlarin toplamini,
		100’den kucukse sadece 1’ler basamagini yazdiran
		3 method olusturun.
		*/
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen bir tam sayi yaziniz");
		int sayi=scan.nextInt();
		tekMiCiftmi(sayi);
		sýfýrlaKarsýlastir(sayi);
		istenenBasamaklariYazdir(sayi);
scan.close();


	}

   public static void istenenBasamaklariYazdir(int sayi) {
	   if (sayi<100) {
           System.out.println("girdiginiz sayinin birler basagi : " + (sayi%10));
       } else { // sayi 100'den buyuk  455254
           
           int rakamlarToplami=0;
           int rakam=0;
           
           rakam=sayi%10;  //4
           rakamlarToplami+=rakam; //4
           sayi/=10; // 45525
           
           rakam=sayi%10; // 5
           rakamlarToplami+=rakam; // 9
           sayi/=10; // 4552
           
           rakam=sayi%10; // 2
           rakamlarToplami+=rakam; // 11
       }	
	}

	public static void sýfýrlaKarsýlastir(int sayi) {
		if (sayi>0) {
			System.out.println("girilen sayi pozitif");
		}else if(sayi<0) {
			System.out.println("girilen sayi negatif");
		}else {
			System.out.println("girilen sayi negatif veya pozitif deðil");
		}
		
	}

	public static void tekMiCiftmi(int sayi) {
	if (sayi%2==0) {
		System.out.println("Girilen sayi çift bir sayidir.");
	}else {
		System.out.println("Girilen sayi tek bir sayidir");
	}
		
	}

}
