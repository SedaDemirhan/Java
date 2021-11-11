package day41_exception02;

import java.util.Scanner;

public class Exception07 {

	public static void main(String[] args) {
/*Soru: Kullanicidan yasini girmesini isteyin. 
 * Kodunuzu kullanici sifirdan kucuk bir sayi girerse Exception verecek 
 * sekilde yazin.
 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lütfen yaþýnýzý giriniz :");
		
		int yas=scan.nextInt();
		
		//1.yol try-catcth kullanmadan
	/*	if (yas>=0) {
			System.out.println("yasýnýz :"+yas);
			
		}else {
			throw new IllegalArgumentException();
		}
		*/
		
		
		//2.yol try-catch kullanarak
	
		try {
			if (yas>=0) {
				System.out.println("yasýnýz :"+yas);
			}else {
				throw new IllegalArgumentException();
			}
		
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		
		}
		
		System.out.println();
		
		System.out.println("devam edin");
		
		
		
		
		
	}

}
