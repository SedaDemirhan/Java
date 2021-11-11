package day09_SwitchCase;

import java.util.Scanner;

public class C2_SwitchCase02 {

	public static void main(String[] args) {
		/* Kullanicidan bir sayi girmesini isteyin
		 Girilen sayi
		 10 ise “Iki basamakli en kucuk sayi 
		 100 ise “uc basamakli en kucuk sayi”
		 1000 ise “dort basamakli en kucuk sayi”
		 diger durumlarda “Girdigin sayiyi degistir” yazdirin
		 */
		Scanner scan=new Scanner(System.in);
		System.out.println(" Bir tamsayi giriniz.");
		
		int sayi=scan.nextInt();
		
		switch(sayi) {
		
		case 10:
			System.out.println("iki basamakli en kücük sayi");
			break;
		case 100:
			System.out.println("üc basamakli en kücük sayi");
			break;
		case 1000:
			System.out.println("dört basamakli en kücük sayi");
			break;
		default :
			System.out.println("girdiðin sayiyi degistir.");
		}
		scan.close();
		
	
	}

}
