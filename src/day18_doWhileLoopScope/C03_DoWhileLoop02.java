package day18_doWhileLoopScope;

import java.util.Scanner;

public class C03_DoWhileLoop02 {

	public static void main(String[] args) {
/*Soru 3) Kullanicidan toplamak uzere pozitif sayilar isteyin, 
 * islemi bitirmek icin 0�a basmasini soyleyin.
		 
 Kullanici 0�a bastiginda toplam kac pozitif sayi girdigini ve
 girdigi pozitif sayilarin toplaminin kac oldugunu yazdirin.
 kullan�c� negatif sayi girerse ignore edin
 */
		double sayi=5;
		int count=0;
		double say�lartoplami=0;
		
		Scanner scan=new Scanner(System.in);
		do {
			System.out.println("l�tfen toplamak icin pozitif say�lar girin"+"\ni�lemi bitirmek icin 0'a bas�n");
		sayi=scan.nextDouble();	
		
		//kullan�c�dan ald���m say�y� pozitif mi diye kontrol edelim
	
		if (sayi>0) {
			say�lartoplami+=sayi;
			count++;
			
		}else if(sayi<0){
			System.out.println("pozitif say� girmelisiniz"
					+"\nbu sayi negatif oldu�u i�in yok say�yorum" );
			
		}
			
		}while(sayi!=0.0);//s�f�ra e�it olmad��� m�ddet�e tekrar tekrar sor!
		System.out.println("girdi�iniz say�lardan"+ count +"tanesi pozitifti ve say�lar�n toplam�"+say�lartoplami);
		
		scan.close();
		
		
	}

}
