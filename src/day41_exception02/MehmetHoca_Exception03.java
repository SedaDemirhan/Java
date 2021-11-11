package day41_exception02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class MehmetHoca_Exception03 {

	public static void main(String[] args) {
//i�i�e try-catch yerine 1 tane try ve multiple catch blogu kullanabilirz	
		
//ancak bu durumda yazd���m�z exceptionlar aras�nda parent-child ili�kisi varsa 
//�nce child class� yazmal�y�z	
//aksi takdirde(yani �nce parent yaz�l�rsa) child'a i� kalmaz. java eri�ilemez catch-blogu diyerek CTE verir
		
		try {
			FileInputStream fis=new FileInputStream("C:\\Users\\Serdar\\eclipse-workspace\\sampleproject\\java2021SummerTr\\src\\day41_exception02\\File");
			
			int k=0;
			
			
				while ((k=fis.read())!=-1) {
					System.out.print((char)k);
					
				}
			} catch (FileNotFoundException e) {
				
				e.printStackTrace();
			
		
		
		} catch (IOException e) {
			
			System.out.println(e.getMessage());
			
		}
		
		System.out.println("kod bloke olmam��");
	

	}

}
