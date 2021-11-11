package day04_increment_matematiksel_iþlemler;

public class C2_Preincrement_Postincrement {

	public static void main(String[] args) {
		
		int sayi1=20;
		
		int sayi2=++sayi1;
		
		System.out.println("pre_increment sayi1:"+sayi1);
		System.out.println("pre_increment sayi2:"+sayi2);
		
		
        sayi2=sayi1++;
		
		System.out.println("post_increment sayi1:"+sayi1);
		System.out.println("post_increment sayi2:"+sayi2);
		
		int sayi3=10;
		
		System.out.println("pre increment:"+ ++sayi3);
	}
	
	

}
