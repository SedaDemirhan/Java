package day15_forLoops;

import java.util.Scanner;

public class Odev03 {

	public static void main(String[] args) {
		// Kullanicidan 10’den kucuk bir sayi isteyin ve girilen
		//sayinin faktoryel’ini bulun. (5!=5*4*3*2*1)
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lütfen 10 dan kücük bir tamsayi giriniz:");
		
		int sayi=scan.nextInt();
        int faktoriyel=1;
		
		System.out.print(sayi+"!=");
		
		for (int i=1;i<=sayi;i++) {
			
			faktoriyel=faktoriyel*i;
			System.out.print(i);
			
			if (i!=sayi) {
				System.out.print("*");
			}
		}
		System.out.println("="+faktoriyel);
		scan.close();
		
		
		
	}

}
