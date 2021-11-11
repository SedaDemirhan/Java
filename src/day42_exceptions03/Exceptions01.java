package day42_exceptions03;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exceptions01 {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("/Users/yeni/eclipse-workspace/javaSummer2021Tr/src/_14_Exceptions/file");
	      
	     int i = 0;
	       
	     while ((i = fis.read()) != -1) {
	                                        
	      System.out.print((char) (i));
	        }
	     /*
	      * thorws keyword'u sadece declaration'dir. 
	      * Throws kullanilan methodda exception olusursa CODE BLOCK olur.
	      * Exceptions arasinda pranet-child iliskisi varsa parent class exception throws'dan sonra yazilmali
	      */
	}

}
