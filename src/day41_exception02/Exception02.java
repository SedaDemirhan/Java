package day41_exception02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exception02 {

	public static void main(String[] args) {
	/*Eger handle edilecek excepsionslar arasýnda parent-child iliþkisi varsa parent class excepsion'u creat edilip
	 * child class excepsion'u olmadan da code calisir ancak:
	 * olumlu durum: tek catch body ile tüm exceptions handle edilebilir
	 * olumsuz durum : bir hata durumunda hatanýn turu vd verileri vs ulaþýlamayacaðý icin handle edilme imkaný  olmaz
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
