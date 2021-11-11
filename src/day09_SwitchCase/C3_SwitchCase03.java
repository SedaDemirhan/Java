package day09_SwitchCase;

import java.util.Scanner;

public class C3_SwitchCase03 {

	public static void main(String[] args) {
		//  Kullanicidan gun ismini alip haftaici veya hafta sonu yazdiralim
	
	
		Scanner scan=new Scanner(System.in);
		System.out.println(" Bir gün giriniz.");
		
		String gün=scan.next().toLowerCase();
		
		switch (gün){
		
		case "pazartesi":
		case "sali":
		case "carþamba":
		case "persembe":
		case "cuma":
			System.out.println("girdiginiz gün haftaici");
			break;
		case "cumartesi":
		case "pazar":
			System.out.println("girdiginiz gün haftasonu");
			break;
				default:
					System.out.println("gecerli gün adi giriniz");
			
		
		}
		
		scan.close();
		
	
	
	}
	

}
