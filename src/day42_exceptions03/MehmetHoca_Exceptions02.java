package day42_exceptions03;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class MehmetHoca_Exceptions02 {

	public static void main(String[] args) throws FileNotFoundException,IOException {

FileInputStream fis=new FileInputStream("C:\\Users\\Serdar\\eclipse-workspace\\sampleproject\\java2021SummerTr\\src\\day41_exception02\\File");
	
	//try-catch blogu exeption ile handle etmekde kullanýlýr
//throws keywords ise sadece declaration'dýr.Dolayýsýyla 
//throws kullanýlan bir method'da exception oluþursa KOD BLOKE olur


int k=0;
while ((k=fis.read())!=-1) {
	System.out.print((char)k);
	
	
	}
//eðer birden fazla exception için throws keywod'u kullanýcaksak
//yazacaðýmýz exceptionlarýn arasýndaki iliþki ve sýralama önemli olur

}}
