package day07_�fElseStatements;

import java.util.Scanner;

public class C1_�fStatements {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen  g�n ismini giriniz...");
		
		String gunIsmi=scan.next().toLowerCase();
		
		// flag kullan�m�(bayrak)
		
		int flag=0;
		
		
		if (gunIsmi.equals("pazartesi")|| gunIsmi.equals("sali")||
				gunIsmi.equals("carsamba")|| gunIsmi.equals("persembe") ||
				gunIsmi.equals("cuma")){
			System.out.println("Girdiginiz gun haftaici");
			flag++;
		}
		
		if (gunIsmi.equals("cumartesi")|| gunIsmi.equals("pazar")) {
			System.out.println("girdi�iniz gun hafta sonu");
			flag++;
			if (flag==0) {
			System.out.println("lutfen gecerli bir gun ismi yaziniz");
		}
			
		}

	scan.close();
	
	}
}	
		
	
