package day41_exception02;

import java.io.FileInputStream;

import java.io.IOException;

public class MehmetHoca_Exception04 {

	public static void main(String[] args) {
	/*
	 * eger handle edilecek exceptionlar aras�nda parent-child ili�kisi varsa 
	 * bu durumda child exception i�in catch blogu yazmasakda kodumuz cal���r
	 * 
	 * child exeption silinirse;
	 *pozitif y�n�: tek catch blogu ile t�m exceptionlar handle edilebilir
	 *negatif y�n�: bir sorunla kar��la�t���m�zda bunun dosya bulunamad��� icin mi
	 *yoksa dosya okunamad��� i�in mi oldu�u anla��lamaz 
	 * 
	 */
		try {
			FileInputStream fis=new FileInputStream("C:\\Users\\Serdar\\eclipse-workspace\\sampleproject\\java2021SummerTr\\src\\day41_exception02\\File");
			
			int k=0;
				while ((k=fis.read())!=-1) {
					System.out.print((char)k);
					fis.close();
					
				}
			
		
		} catch (IOException e) {
			
			System.out.println(e.getMessage());
			
		}
		
		System.out.println("kod bloke olmam��");
		
	
	}

}
