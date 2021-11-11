package day41_exception02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class MehmetHoca_Exception02 {

	public static void main(String[] args) {
	/*eger kodumuzda birden fazla exceptionla iliþkili durum oluþuyorsa
	 * içiçe try-catch bloklarý oluþturabiliriz.
	 * bu örnekte ilk önce dosyayý okutmak istedik
	 * Jva "ya dosyayý bulamazsam?" diye bizden yardým istedi
	 * biz de  try-catch blogu ile FileNotFoundException ile handle etmesine yardýmcý olduk
	 * Sonra dosyadaki yazýlarý okumaya calýþtýk ve java yeniden "ya dosyayý okuyamzsam" diye yardým istedi
	 * 
	 *biz de try-catch blogu ile handle etmesini saðladýk 
	 */
		
		try {
			FileInputStream fis=new FileInputStream("C:\\Users\\Serdar\\eclipse-workspace\\sampleproject\\java2021SummerTr\\src\\day41_exception02\\File");
			
			int k=0;
			try {
				while ((k=fis.read())!=-1) {
					System.out.print((char)k);
					
				}
			} catch (IOException e) {//dosyalarla ilgili genel yazma ve okuma sorunlarý ile handle eder
				
				e.printStackTrace();
			}
		
		
		} catch (FileNotFoundException e) {
			
			System.out.println(e.getMessage());
			
		}
		
		System.out.println("kod bloke olmamýþ");
	
	
	}

}
