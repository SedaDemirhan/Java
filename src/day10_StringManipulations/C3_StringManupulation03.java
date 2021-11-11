package day10_StringManipulations;

import java.util.Scanner;

public class C3_StringManupulation03 {

	public static void main(String[] args) {
		String str="Java ögrenmek ne güzel";
		
		System.out.println(str.indexOf("e"));//8
		
		System.out.println(str.indexOf(' '));// 4
		
		System.out.println(str.indexOf("mek"));// 10
		
		System.out.println(str.indexOf("")); // 0
		
		System.out.println(str.indexOf("j"));//-1
		
		System.out.println(str.indexOf("J")); // 0
		
		//KULLANICIDAN BÝR STRÝNG ÝSTEYÝN GÝRDÝÐÝ STRÝNG
		//"JAVA" ÝÇERÝYORSA "AFERÝN" YAZDIRIN.ÝÇERMÝYORSA
		// "DAHA ÇOK ÇALIÞMAN LAZIM" YAZDIRIN.BÜYÜK KÜÇÜK HARF ÖNEMSÝZ
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lütfen bir cümle giriniz:");
		String cumle=scan.nextLine().toLowerCase();
		
		if (cumle.indexOf("java")==-1) {
			System.out.println("daha çok çalýþman lazým");
			
		}else {
			System.out.println("aferin");
		}
		
		// ternary metodu
		System.out.println(cumle.indexOf("java")==-1 ? "daha çok çalýþman lazým" :"aferin");
		scan.close();
		
	}

}
