package day48_collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class C1_LinkedList01 {

	public static void main(String[] args) {
	//linked baglý demektir.
	//linked list tüm elemalar tren gibi birbirine baðlýdýr
	
	/*Collections'da obje oluþtururken
	 * oluþturmak istediðimiz collection'ýn class mý yoksa interface mi olduðuna bakmalýyýz
	 * rðer oluþturmak istediðimiz collection interface ise data türü olarak
	 * o interface i constructor olarak ise uygun bir class secmeliyiz
	 * þimdiye kadar lis(interface) oluþtururken constructor olarak ArrayList() seçiyorduk
	 */
		
	List<String>liste = new ArrayList<>();
	liste.add("X");
	liste.add("Y");//[X,Y]
	
	LinkedList<String>ll1=new LinkedList<>();
	
	ll1.add("A");
	ll1.add("B");
    System.out.println(ll1);//[A, B]
    
    ll1.add(1, "C");
    System.out.println(ll1);//[A, C, B]
    
    ll1.addAll(liste);
    System.out.println(ll1);//[A, C, B, X, Y]
    
    ll1.addAll(2, liste);
    System.out.println(ll1);//[A, C, X, Y, B, X, Y]
    
    ll1.addLast("K");
    System.out.println(ll1);//[A, C, X, Y, B, X, Y, K]
    
    /*LinkedList list ve Queue interface'lerine implement ile child olduðundan
     * her iki interface'deki tüm methodlarý override etmek zorundadýr.
     * Iþlev olarak ayni iþi yapan addLast() queue'den ve add() ise List'den inherit edilmiþtir.
     * 
     * Ben bir Linked oluþturmak istiyorum ama sadece list özelliklerini  taþýsýn
     * 
     */
    List<String>listList=new LinkedList<>();
    listList.add("Sadece list'den gelen özellikler var");
    
  Queue<String>QueueList=new LinkedList<>();
  QueueList.add("Sadece queue'den gelen özellikler var");
  
  
    
    
    
    
 
	}

}
