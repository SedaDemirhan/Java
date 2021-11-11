package day41_exception02;

import java.io.FileInputStream;

import java.io.IOException;

public class MehmetHoca_Exception04 {

	public static void main(String[] args) {
	/*
	 * eger handle edilecek exceptionlar arasýnda parent-child iliþkisi varsa 
	 * bu durumda child exception için catch blogu yazmasakda kodumuz calýþýr
	 * 
	 * child exeption silinirse;
	 *pozitif yönü: tek catch blogu ile tüm exceptionlar handle edilebilir
	 *negatif yönü: bir sorunla karþýlaþtýðýmýzda bunun dosya bulunamadýðý icin mi
	 *yoksa dosya okunamadýðý için mi olduðu anlaþýlamaz 
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
		
		System.out.println("kod bloke olmamýþ");
		
	
	}

}
