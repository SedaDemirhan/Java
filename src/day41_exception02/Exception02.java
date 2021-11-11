package day41_exception02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exception02 {

	public static void main(String[] args) {
	/*Eger handle edilecek excepsionslar aras�nda parent-child ili�kisi varsa parent class excepsion'u creat edilip
	 * child class excepsion'u olmadan da code calisir ancak:
	 * olumlu durum: tek catch body ile t�m exceptions handle edilebilir
	 * olumsuz durum : bir hata durumunda hatan�n turu vd verileri vs ula��lamayaca�� icin handle edilme imkan�  olmaz
	 * 
	 * 
	 * 	
	 */
		
		try {
        FileInputStream fis = new FileInputStream(
                "/Users/yeni/eclipse-workspace/javaSummer2021Tr/src/_14_Exceptions/file");
        fis.close();//fis obj close edildi
        int i = 0;
        
        while ((i = fis.read()) != -1) {
            System.out.print((char) (i));
        }
    }
    
    catch (IOException e) {
        System.out.println(e.getMessage());
    }
    
    System.out.println();
    System.out.println("dewamkeee yazisini okuduysan kod bu satira kadar sorunsuz run olmustur...");

	}

}
