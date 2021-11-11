package day08_TernaryOperator;

import java.util.Scanner;

public class C6_NestedTernary {

	public static void main(String[] args) {
		// *Kullanicidan bir tamsayi alin ve 
		//sayi 10 ’dan kucukse “ rakam" 100 ’den kucukse “iki
		//basamakli sayi” degilse “uc basamakli veya daha buyuk sayi” 
		//yazdirin
		
		Scanner scan= new Scanner (System.in);
		
       System.out.println("Lütfen bir tamsayi sayi giriniz");
		
		int sayi=scan.nextInt();
		
	
		System.out.println(sayi<10 ? "Rakam" : (sayi<100 ? "iki basamaklý sayi" : "uc basamaklý ya da daha buyuk "));
	
	scan.close();
	
	}

}
