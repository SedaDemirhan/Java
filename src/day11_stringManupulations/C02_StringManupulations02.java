package day11_stringManupulations;

import java.util.Scanner;

public class C02_StringManupulations02 {

	public static void main(String[] args) {
/*Kullanicidan email adresini girmesini isteyin, 
mail @gmail.com iceriyorsa   “Email adresiniz kaydedildi”,
icermiyorsa “Lutfen gmail mail adresinizi giriniz.. “ yazdirin
*/
	
	Scanner scan=new Scanner(System.in);
	System.out.println("Lütfen mail adresinizi giriniz");
	
     String mail=scan.next();
   if(mail.contains("@gmail.com")) {
	   System.out.println("Email adresiniz kaydedildi");
   }else {
	   System.out.println("Lütfen gmail. mail adresi girinizi");
   }
		
		scan.close();
		
		
		
		
		
		
		
		
	}
}
