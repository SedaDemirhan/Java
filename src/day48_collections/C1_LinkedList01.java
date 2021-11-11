package day48_collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class C1_LinkedList01 {

	public static void main(String[] args) {
	//linked bagl� demektir.
	//linked list t�m elemalar tren gibi birbirine ba�l�d�r
	
	/*Collections'da obje olu�tururken
	 * olu�turmak istedi�imiz collection'�n class m� yoksa interface mi oldu�una bakmal�y�z
	 * r�er olu�turmak istedi�imiz collection interface ise data t�r� olarak
	 * o interface i constructor olarak ise uygun bir class secmeliyiz
	 * �imdiye kadar lis(interface) olu�tururken constructor olarak ArrayList() se�iyorduk
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
    
    /*LinkedList list ve Queue interface'lerine implement ile child oldu�undan
     * her iki interface'deki t�m methodlar� override etmek zorundad�r.
     * I�lev olarak ayni i�i yapan addLast() queue'den ve add() ise List'den inherit edilmi�tir.
     * 
     * Ben bir Linked olu�turmak istiyorum ama sadece list �zelliklerini  ta��s�n
     * 
     */
    List<String>listList=new LinkedList<>();
    listList.add("Sadece list'den gelen �zellikler var");
    
  Queue<String>QueueList=new LinkedList<>();
  QueueList.add("Sadece queue'den gelen �zellikler var");
  
  
    
    
    
    
 
	}

}
