package day09_SwitchCase;

import java.util.Scanner;

public class C1_SwitchCase01 {

	public static void main(String[] args) {
		// Soru1 : Kullanicidan haftanin kacinci gunu oldugunu 
		//sorun ve gun ismini yazdirin
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("L�tfen haftanin kac�nc� g�n�nde oldugunuzu giriniz.");
		
		int gunNo=scan.nextInt();
		
		switch(gunNo) {
			
		case 1:
			System.out.println("Bugun pazartesi");
			break;
		case 2:
			System.out.println("Bug�n sal�");
			break;
		case 3:
			System.out.println("bug�n �ar�amba");
			break;
		case 4:
			System.out.println("Bug�n per�embe");
			break;
		case 5:
			System.out.println("Bug�n cuma");
			break;
		case 6:
			System.out.println("Bug�n cumartesi");
			break;
		case 7:
			System.out.println("Bug�n pazar");
			break;
		default:
			System.out.println("l�tfen ge�erli g�n numaras� giriniz.");
			
		}
		scan.close();
		
		
	}

}
