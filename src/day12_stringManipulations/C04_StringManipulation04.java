package day12_stringManipulations;

import java.util.Scanner;

public class C04_StringManipulation04 {

	public static void main(String[] args) {
		/*Kullanicidan 4 harfli bir kelime isteyin 
		 * 4 harften uzun veya kýsa ise 
		 * "lütfen 4 harfli bir kelime girin" yazdýrýn.
		 * ve uygun kelime girilirse tersten yazdýrýn
		 */
		
        Scanner scan=new Scanner(System.in);
		
		System.out.println("Lütfen 4 harfli bit kelime giriniz:");
		String kelime=scan.next();
		
		
		
		if (kelime.length()!=4) {
			System.out.println("lütfen 4 harfli bir kelime girin");
		}else {
			System.out.println(kelime.substring(3,4) +kelime.substring(2,3)+kelime.substring(1,2)+kelime.substring(0,1));
			
		}
		scan.close();
		
		
		
		
	}

}
