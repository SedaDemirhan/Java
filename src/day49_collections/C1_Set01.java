package day49_collections;

import java.util.HashSet;
import java.util.Set;

public class C1_Set01 {

	public static void main(String[] args) {
    
		Set<String>set1=new HashSet<>();
		set1.add("A");
		set1.add("B");
		set1.add("C");
		set1.add("B");
		set1.add("A");
		set1.add("C");
		set1.add("B");
		set1.add("D");
		
		System.out.println(set1);//[A, B, C, D]
		
		System.out.println(set1.hashCode());//266
		
		set1.add("M");
		set1.add("E");
		System.out.println(set1);//[A, B, C, D, E, M]
		//set'de �nemli olan �zellik no dublication(Tekrars�z) ve eleman�n kumede var olup olmamas�d�r
		//s�ralama set i�in �nemli de�ildir
		//set i�in elemanlar� girdi�imiz s�rada verir veya elemanlar� natural s�ralama ile verir
		//gibi bir c�mle KULLANMAYIZ
		System.out.println(set1.hashCode());//412
		
		//collections'da hashCode() methodu collection i�indeki t�m 
		//elemanlar�n hash code'lar�n�zn toplam�n� verir
		//yeni eleman eklersek do�al olarak hash code de�i�ir
		
		
		

	}

}
