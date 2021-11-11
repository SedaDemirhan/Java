package day46_Iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Iterator02 {

	public static void main(String[] args) {
		
		
		List<String>list=new ArrayList<>(Arrays.asList("t","a","r","�","k"));
		System.out.println("ilk hali :"+list);
       
		ListIterator lt1= list.listIterator();//list�terator interfaceden lt1 variable creat edildi.de�erini listten assign edildi
       
       while (lt1.hasNext()) {
        
    	   
        String depo=(String)lt1.next();
        
        lt1.set(depo+":-)");//list elemanlar�n� update etti
		
	}
	
	System.out.println("update hali :"+list);
	
	
	
	
	List<String>list1=new ArrayList<>(Arrays.asList("m","e","l","�","h","a"));//son eleman�na  :-) ile update ediniz
	
	System.out.println("ilk hali :"+list1);
	
	ListIterator lt2= list1.listIterator();
	while (lt2.hasNext()) {
		
		String depo= (String) lt2.next();
	
		if (!lt2.hasNext()) {
			lt2.set(":-)"+" "+depo );
			
		}
		
	}
	
	//System.out.println(list1);
	
	while (lt2.hasPrevious()) {
		String depo= (String) lt2.previous();//kursorun �ncesi eleman� return eder ve cursor �ncesine gider
		System.out.print(depo+" ");//:-) a h � l e m 
		
	}
	/*
	 * hasPrevious() ve previous methodlar�n�n �al��mas� i�in �ncesinde mutlaka kesinlikle hasNext() ve next() methodlar� �al��t�r�larak cursor(pointer) en sona getirilmeli
	 *
	 * 
	 * "ITERATOR" ve "LISTITERATOR" arasi farklar :

1) "ITERATOR" sadece hasNext(), next() ve remove() methodlarini icerir
    "LISTITERATOR"  ise hasNext(), next(),remove() hasPrevius(), Previus(), add(); set()  method'rini i�erir.

2) "LISTITERATOR" sadece list'ler cin kullanilir.
    "ITERATOR" ise tum collection(list set map) elemanlari icin kullanilir

3) "ITERATOR" sadece ileri gidiyor, "LISTITERATOR" hem ileri hem geri cift yonlu gitmek icin kullanilir.
	 * 
	 * 
	 */
	
	}

}
