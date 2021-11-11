package day10_StringManipulations;

import java.util.Scanner;

public class C3_StringManupulation03 {

	public static void main(String[] args) {
		String str="Java �grenmek ne g�zel";
		
		System.out.println(str.indexOf("e"));//8
		
		System.out.println(str.indexOf(' '));// 4
		
		System.out.println(str.indexOf("mek"));// 10
		
		System.out.println(str.indexOf("")); // 0
		
		System.out.println(str.indexOf("j"));//-1
		
		System.out.println(str.indexOf("J")); // 0
		
		//KULLANICIDAN B�R STR�NG �STEY�N G�RD��� STR�NG
		//"JAVA" ��ER�YORSA "AFER�N" YAZDIRIN.��ERM�YORSA
		// "DAHA �OK �ALI�MAN LAZIM" YAZDIRIN.B�Y�K K���K HARF �NEMS�Z
		
		Scanner scan=new Scanner(System.in);
		System.out.println("l�tfen bir c�mle giriniz:");
		String cumle=scan.nextLine().toLowerCase();
		
		if (cumle.indexOf("java")==-1) {
			System.out.println("daha �ok �al��man laz�m");
			
		}else {
			System.out.println("aferin");
		}
		
		// ternary metodu
		System.out.println(cumle.indexOf("java")==-1 ? "daha �ok �al��man laz�m" :"aferin");
		scan.close();
		
	}

}
