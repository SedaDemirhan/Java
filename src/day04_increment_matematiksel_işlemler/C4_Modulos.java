package day04_increment_matematiksel_iþlemler;

public class C4_Modulos {

	public static void main(String[] args) {
		
		
		int sayi=5496;
		int rakamlarToplami=0;
		
		int rakam = sayi%10;
		
		rakamlarToplami+= rakam;
		
		sayi/=10;
		
		rakam= sayi%10;
	    rakamlarToplami+=rakam;
		sayi/=10;
		
		rakam=sayi%10;
		rakamlarToplami+=rakam;
		sayi/=10;
		
		rakam=sayi%10;
		rakamlarToplami+=rakam;
		sayi/=10;

	
		
		System.out.println(rakamlarToplami);
	}

}
