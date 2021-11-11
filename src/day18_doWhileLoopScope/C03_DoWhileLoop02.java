package day18_doWhileLoopScope;

import java.util.Scanner;

public class C03_DoWhileLoop02 {

	public static void main(String[] args) {
/*Soru 3) Kullanicidan toplamak uzere pozitif sayilar isteyin, 
 * islemi bitirmek icin 0’a basmasini soyleyin.
		 
 Kullanici 0’a bastiginda toplam kac pozitif sayi girdigini ve
 girdigi pozitif sayilarin toplaminin kac oldugunu yazdirin.
 kullanýcý negatif sayi girerse ignore edin
 */
		double sayi=5;
		int count=0;
		double sayýlartoplami=0;
		
		Scanner scan=new Scanner(System.in);
		do {
			System.out.println("lütfen toplamak icin pozitif sayýlar girin"+"\niþlemi bitirmek icin 0'a basýn");
		sayi=scan.nextDouble();	
		
		//kullanýcýdan aldýðým sayýyý pozitif mi diye kontrol edelim
	
		if (sayi>0) {
			sayýlartoplami+=sayi;
			count++;
			
		}else if(sayi<0){
			System.out.println("pozitif sayý girmelisiniz"
					+"\nbu sayi negatif olduðu için yok sayýyorum" );
			
		}
			
		}while(sayi!=0.0);//sýfýra eþit olmadýðý müddetçe tekrar tekrar sor!
		System.out.println("girdiðiniz sayýlardan"+ count +"tanesi pozitifti ve sayýlarýn toplamý"+sayýlartoplami);
		
		scan.close();
		
		
	}

}
