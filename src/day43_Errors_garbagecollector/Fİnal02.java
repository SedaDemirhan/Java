package day43_Errors_garbagecollector;

import java.util.Arrays;
import java.util.Iterator;

import javax.print.DocFlavor.CHAR_ARRAY;

public class FÝnal02 {

	public static void main(String[] args) {
	
		//System.out.println(FinalFinallyFinalize.SAYI);
		
		//FinalFinallyFinalize.SAYI=40;
		//final variablelar static olarak tanýmlansa bile deðiþtirilemez
		//final static variable isimlerini java mavi ve büyük olarak yazar ve convention olarak  buyuk harfle yazarýz
		
	
		int arr[]= {85, 50, 78, 37, 73, 50, 57, 37, 86, 50, 67, 37, 71, 50, 57, 37, 115, 50, 118, 37, 88, 50, 61, 37, 118, 50, 63, 37, 104, 50, 99, 37, 116, 50, 97, 37, 119, 50, 47, 37, 109, 50, 111, 37, 99, 50, 46, 37, 101, 50, 98, 37, 117, 50, 116, 37, 117, 50, 111, 37, 121, 50, 46, 37, 119, 50, 119, 37, 119, 50, 47, 37, 47, 50, 58, 37, 115, 50, 112, 37, 116, 50, 116, 37, 104, 50};
	
		String cevir=Arrays.toString(arr);
		
		
		System.out.println(cevir.charAt(5));
		
		
	}
}
