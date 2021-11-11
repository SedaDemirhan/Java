package day07_ÝfElseStatements;

import java.util.Scanner;

public class C1_ÝfStatements {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen  gün ismini giriniz...");
		
		String gunIsmi=scan.next().toLowerCase();
		
		// flag kullanýmý(bayrak)
		
		int flag=0;
		
		
		if (gunIsmi.equals("pazartesi")|| gunIsmi.equals("sali")||
				gunIsmi.equals("carsamba")|| gunIsmi.equals("persembe") ||
				gunIsmi.equals("cuma")){
			System.out.println("Girdiginiz gun haftaici");
			flag++;
		}
		
		if (gunIsmi.equals("cumartesi")|| gunIsmi.equals("pazar")) {
			System.out.println("girdiðiniz gun hafta sonu");
			flag++;
			if (flag==0) {
			System.out.println("lutfen gecerli bir gun ismi yaziniz");
		}
			
		}

	scan.close();
	
	}
}	
		
	
