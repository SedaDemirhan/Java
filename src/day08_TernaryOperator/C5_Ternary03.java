package day08_TernaryOperator;

import java.util.Scanner;

public class C5_Ternary03 {

	public static void main(String[] args) {
		// Kullanicidan bir sayi alin ve sayinin mutlak 
		//degerini yazdirin

		Scanner scan= new Scanner(System.in);
		
		System.out.println("Lütfen bir sayi giriniz");
		
		double sayi=scan.nextDouble();
		
		System.out.println( sayi>=0 ? sayi : -1*sayi);
		
		//if ile yapsaydýk
		
		if (sayi>0) {
			System.out.println("girdiðiniz sayinin mutlak deðeri:" +sayi);
			
		}else {
			System.out.println("girdiðiniz sayinin mutlak deðeri :"+ -sayi);
			scan.close();
			
		}
		
	}

}
