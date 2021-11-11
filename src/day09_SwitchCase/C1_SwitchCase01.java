package day09_SwitchCase;

import java.util.Scanner;

public class C1_SwitchCase01 {

	public static void main(String[] args) {
		// Soru1 : Kullanicidan haftanin kacinci gunu oldugunu 
		//sorun ve gun ismini yazdirin
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen haftanin kacýncý gününde oldugunuzu giriniz.");
		
		int gunNo=scan.nextInt();
		
		switch(gunNo) {
			
		case 1:
			System.out.println("Bugun pazartesi");
			break;
		case 2:
			System.out.println("Bugün salý");
			break;
		case 3:
			System.out.println("bugün çarþamba");
			break;
		case 4:
			System.out.println("Bugün perþembe");
			break;
		case 5:
			System.out.println("Bugün cuma");
			break;
		case 6:
			System.out.println("Bugün cumartesi");
			break;
		case 7:
			System.out.println("Bugün pazar");
			break;
		default:
			System.out.println("lütfen geçerli gün numarasý giriniz.");
			
		}
		scan.close();
		
		
	}

}
