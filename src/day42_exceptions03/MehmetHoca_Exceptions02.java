package day42_exceptions03;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class MehmetHoca_Exceptions02 {

	public static void main(String[] args) throws FileNotFoundException,IOException {

FileInputStream fis=new FileInputStream("C:\\Users\\Serdar\\eclipse-workspace\\sampleproject\\java2021SummerTr\\src\\day41_exception02\\File");
	
	//try-catch blogu exeption ile handle etmekde kullan�l�r
//throws keywords ise sadece declaration'd�r.Dolay�s�yla 
//throws kullan�lan bir method'da exception olu�ursa KOD BLOKE olur


int k=0;
while ((k=fis.read())!=-1) {
	System.out.print((char)k);
	
	
	}
//e�er birden fazla exception i�in throws keywod'u kullan�caksak
//yazaca��m�z exceptionlar�n aras�ndaki ili�ki ve s�ralama �nemli olur

}}
