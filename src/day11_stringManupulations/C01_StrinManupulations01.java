package day11_stringManupulations;

import java.util.Scanner;

public class C01_StrinManupulations01 {

	public static void main(String[] args) {
		//kullan�c�dan bir c�mle ve bir kelime al�,c�mlede kelimenin
		//kullan�l�p kullan�lmad���n� yazd�r�n.
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen bir cumle girin:");
		String cumle=scan.nextLine().toLowerCase();
		
		System.out.println("Lutfen bir kelime girin:");	
		String kelime=scan.next().toLowerCase();
		
		if (cumle.indexOf(kelime)!=-1)   {
			System.out.println("kelime c�mlede kullan�lm��");
		}else {
			System.out.println("kelime c�mlede kullan�lmam��");
		}
		
		//contains() kullan�m�:
		
		if (cumle.contains(kelime)) {
			System.out.println("kelime c�mlede kullan�lm��");	
		}else {
			System.out.println("kelime c�mlede kullan�lmam��");
	
		}
		
		scan.close();
		
	}
	
	

}
