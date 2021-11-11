package day15_forLoops;

import java.util.Scanner;

public class C07_ForLoops06 {

	public static void main(String[] args) {
// Kullanicidan bir String isteyin ve Stringi tersten yazdirin.
		
		
		
		Scanner scan=new Scanner(System .in);
		System.out.println("lütfen tersten yazdýrmak için bir kelime giriniz");
		
		String kelime=scan.nextLine();
		
		for (int i =0; i <kelime.length() ; i++) {
			System.out.print(kelime.substring(kelime.length()-1-i,kelime.length()-i));
			
		}
		//// ikinci yol
		
		 System.out.println("");
	        for (int i = kelime.length()-1; i >= 0; i--) {
	            System.out.print(kelime.substring(i,i+1));
	        }
	        scan.close();
	        
	}

}
