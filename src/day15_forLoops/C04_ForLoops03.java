package day15_forLoops;

import java.util.Scanner;

public class C04_ForLoops03 {

	public static void main(String[] args) {
// Kullanicidan 100�den kucuk bir tamsayi isteyin. 1�den baslayarak girilen sayiya kadar
//3�un kati olan sayilari yazdirin.

		Scanner scan=new Scanner(System .in);
		System.out.println("L�tfen 100'den kucuk pozitif bir tam sayi giriniz:");
		
		int sayi=scan.nextInt();
		
		for (int i = 1; i <sayi; i++) {
			if(i%3==0) {
				System.out.print(i+ " ");
			}
			
		}
			scan.close();
			
	}

}
