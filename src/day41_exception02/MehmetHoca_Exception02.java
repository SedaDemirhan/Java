package day41_exception02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class MehmetHoca_Exception02 {

	public static void main(String[] args) {
	/*eger kodumuzda birden fazla exceptionla ili�kili durum olu�uyorsa
	 * i�i�e try-catch bloklar� olu�turabiliriz.
	 * bu �rnekte ilk �nce dosyay� okutmak istedik
	 * Jva "ya dosyay� bulamazsam?" diye bizden yard�m istedi
	 * biz de  try-catch blogu ile FileNotFoundException ile handle etmesine yard�mc� olduk
	 * Sonra dosyadaki yaz�lar� okumaya cal��t�k ve java yeniden "ya dosyay� okuyamzsam" diye yard�m istedi
	 * 
	 *biz de try-catch blogu ile handle etmesini sa�lad�k 
	 */
		
		try {
			FileInputStream fis=new FileInputStream("C:\\Users\\Serdar\\eclipse-workspace\\sampleproject\\java2021SummerTr\\src\\day41_exception02\\File");
			
			int k=0;
			try {
				while ((k=fis.read())!=-1) {
					System.out.print((char)k);
					
				}
			} catch (IOException e) {//dosyalarla ilgili genel yazma ve okuma sorunlar� ile handle eder
				
				e.printStackTrace();
			}
		
		
		} catch (FileNotFoundException e) {
			
			System.out.println(e.getMessage());
			
		}
		
		System.out.println("kod bloke olmam��");
	
	
	}

}
