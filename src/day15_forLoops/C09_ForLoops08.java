package day15_forLoops;

import java.util.Scanner;

public class C09_ForLoops08 {

	public static void main(String[] args) {
		// Interview Question: Kullanicidan 10�den kucuk bir tam sayi  isteyin ve
		//girilen sayinin faktoryel�ini bulun. (5!=5*4*3*2*1)
		
		Scanner scan=new Scanner(System .in);
		System.out.println("l�tfen 10 dan k�c�k bir pozitif bir tam  say� giriniz");
		
		int sayi=scan.nextInt();
		int faktoryel=1;
		
		for (int i = 1; i <=sayi; i++) {
			faktoryel*=i;
			
		}
  System.out.println("girdi�iniz sayinin faktoryeli:"+faktoryel);
  scan.close();
	}

}
