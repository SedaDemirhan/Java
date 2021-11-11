package day14_methodCreationForLoop;

import java.util.Scanner;

public class C03_MethodCreation03 {

	public static void main(String[] args) {
/*
 Email kontrolu yapan bir program yazin.Kullanicinin girdigi sifre 
 - @ isareti icermiyorsa gecersiz email yazdirin
 - @gmail.com icermiyorsa “lutfen gmail adresinizi girin” yazdirin
 - @gmail.com ile bitmiyorsa “Yazimda bir sorun var, maili kontrol ediniz”
*/
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen Email adresinizi giriniz: ");
		
		String mail=scan.nextLine();
		emailKontrolEt(mail);
		scan.close();
		
			
		}

	public static void emailKontrolEt(String mail) {
		if(!mail.contains("@")) {
			System.out.println("gecersiz mail adresi");
		
	}else if (!mail.contains("@gmail.com")) {
		System.out.println("lutfen gmail adresinizi girin");
	}else if (!mail.endsWith("@gmail.com")) {
		System.out.println("Yazimda bir sorun var, maili kontrol ediniz");
	}else {
		System.out.println("mail adresiniz baþarýyla kaydedilmiþtir.");
	}
		
		
	}

}
