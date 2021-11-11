package day11_stringManupulations;

import java.util.Scanner;

public class C01_StrinManupulations01 {

	public static void main(String[] args) {
		//kullanýcýdan bir cümle ve bir kelime alý,cümlede kelimenin
		//kullanýlýp kullanýlmadýðýný yazdýrýn.
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen bir cumle girin:");
		String cumle=scan.nextLine().toLowerCase();
		
		System.out.println("Lutfen bir kelime girin:");	
		String kelime=scan.next().toLowerCase();
		
		if (cumle.indexOf(kelime)!=-1)   {
			System.out.println("kelime cümlede kullanýlmýþ");
		}else {
			System.out.println("kelime cümlede kullanýlmamýþ");
		}
		
		//contains() kullanýmý:
		
		if (cumle.contains(kelime)) {
			System.out.println("kelime cümlede kullanýlmýþ");	
		}else {
			System.out.println("kelime cümlede kullanýlmamýþ");
	
		}
		
		scan.close();
		
	}
	
	

}
