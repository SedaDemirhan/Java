package day02_variables_scanner;

import java.util.Scanner;

public class C02_Scanner {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("L�tfen iki tamsayi giriniz");
		
		int sayi1 = scan.nextInt();
		int sayi2 = scan.nextInt();
		
		System.out.println("girdi�iniz sayilarin toplam� :"+(sayi1+sayi2));
scan.close();

	}

}
