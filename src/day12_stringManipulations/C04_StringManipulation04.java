package day12_stringManipulations;

import java.util.Scanner;

public class C04_StringManipulation04 {

	public static void main(String[] args) {
		/*Kullanicidan 4 harfli bir kelime isteyin 
		 * 4 harften uzun veya k�sa ise 
		 * "l�tfen 4 harfli bir kelime girin" yazd�r�n.
		 * ve uygun kelime girilirse tersten yazd�r�n
		 */
		
        Scanner scan=new Scanner(System.in);
		
		System.out.println("L�tfen 4 harfli bit kelime giriniz:");
		String kelime=scan.next();
		
		
		
		if (kelime.length()!=4) {
			System.out.println("l�tfen 4 harfli bir kelime girin");
		}else {
			System.out.println(kelime.substring(3,4) +kelime.substring(2,3)+kelime.substring(1,2)+kelime.substring(0,1));
			
		}
		scan.close();
		
		
		
		
	}

}
