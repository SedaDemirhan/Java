package day09_SwitchCase;

import java.util.Scanner;

public class C3_SwitchCase03 {

	public static void main(String[] args) {
		//  Kullanicidan gun ismini alip haftaici veya hafta sonu yazdiralim
	
	
		Scanner scan=new Scanner(System.in);
		System.out.println(" Bir g�n giriniz.");
		
		String g�n=scan.next().toLowerCase();
		
		switch (g�n){
		
		case "pazartesi":
		case "sali":
		case "car�amba":
		case "persembe":
		case "cuma":
			System.out.println("girdiginiz g�n haftaici");
			break;
		case "cumartesi":
		case "pazar":
			System.out.println("girdiginiz g�n haftasonu");
			break;
				default:
					System.out.println("gecerli g�n adi giriniz");
			
		
		}
		
		scan.close();
		
	
	
	}
	

}
