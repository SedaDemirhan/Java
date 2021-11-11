package day08_TernaryOperator;

import java.util.Scanner;

public class C1_IfElse_Art�kYil {

	public static void main(String[] args) {
		
		/*Kullanicidan artik yil olup olmadigini kontrol etmek icin yil girmesini isteyin.
		Kural 1: 4 ile bolunemeyen yillar artik yil degildir
		Kural 2: 4 ile bolunup 100 ile bolunemeyen yillar artik yildir
		Kural 3: 4�un kati olmasina ragmen 100 ile bolunebilen yillardan sadece 400�un kati olan yillar artik 		yildir
	
		 */
		
		Scanner scan=new Scanner (System.in);
		
		System.out.println("L�tfenn artik yil kontrol� icin bir yil giriniz");
		
		int yil=scan.nextInt();
		
		if (yil % 4 !=0) {
			System.out.println("Girdiginiz yil artik yil degil");
		}else if (yil %100 !=0) {
			System.out.println("girdi�iniz yil at�k yildir");
		}else if(yil %400 ==0) {
			System.out.println("girdi�iniz yil art�k y�ld�r");
		}else {
			System.out.println("Girdiginiz yil artik yil degil");
		}
		scan.close();
		

	}

}
