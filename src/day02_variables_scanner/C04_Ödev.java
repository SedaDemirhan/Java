package day02_variables_scanner;

import java.util.Scanner;

public class C04_�dev {

	public static void main(String[] args) {
//Kullanicidan karenin bir kenar uzunlugunu alin ve karenin cevresini ve alanini
//hesaplayip yazdirin
		
    Scanner scan =new Scanner(System.in);
    System.out.println("Kenar uzunlu�u giriniz:");
    
    int sayi=scan.nextInt();
    System.out.println("Karenin alan�:" +(sayi*sayi));
    System.out.println("Karenin cevresi:"+(4*sayi));
   
    //Kullanicidan yaricap isteyip cemberin cevresini ve dairenin alanini hesaplayip yazdirin
    
    System.out.println("Yaricap giriniz:");
   int sayi1=scan.nextInt();
    System.out.println("Cemberin cevresi:" +(2*(3.14)*sayi1));
    System.out.println("Dairenin alan�:" +((3.14)*sayi1*sayi1));
    	scan.close();
    	
	}

}
