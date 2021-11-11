package day41_exception02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class MehmetHoca_Exception03 {

	public static void main(String[] args) {
//içiçe try-catch yerine 1 tane try ve multiple catch blogu kullanabilirz	
		
//ancak bu durumda yazdýðýmýz exceptionlar arasýnda parent-child iliþkisi varsa 
//önce child classý yazmalýyýz	
//aksi takdirde(yani önce parent yazýlýrsa) child'a iþ kalmaz. java eriþilemez catch-blogu diyerek CTE verir
		
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
		
		System.out.println("kod bloke olmamýþ");
	

	}

}
