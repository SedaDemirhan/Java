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
		//set'de önemli olan özellik no dublication(Tekrarsýz) ve elemanýn kumede var olup olmamasýdýr
		//sýralama set için önemli deðildir
		//set için elemanlarý girdiðimiz sýrada verir veya elemanlarý natural sýralama ile verir
		//gibi bir cümle KULLANMAYIZ
		System.out.println(set1.hashCode());//412
		
		//collections'da hashCode() methodu collection içindeki tüm 
		//elemanlarýn hash code'larýnýzn toplamýný verir
		//yeni eleman eklersek doðal olarak hash code deðiþir
		
		
		

	}

}
