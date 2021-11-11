package day15_forLoops;

import java.util.Scanner;

public class C09_ForLoops08 {

	public static void main(String[] args) {
		// Interview Question: Kullanicidan 10’den kucuk bir tam sayi  isteyin ve
		//girilen sayinin faktoryel’ini bulun. (5!=5*4*3*2*1)
		
		Scanner scan=new Scanner(System .in);
		System.out.println("lütfen 10 dan kücük bir pozitif bir tam  sayý giriniz");
		
		int sayi=scan.nextInt();
		int faktoryel=1;
		
		for (int i = 1; i <=sayi; i++) {
			faktoryel*=i;
			
		}
  System.out.println("girdiðiniz sayinin faktoryeli:"+faktoryel);
  scan.close();
	}

}
