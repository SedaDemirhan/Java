package day48_collections;

import java.util.LinkedList;

public class C3_LinkedList03 {

	public static void main(String[] args) {
		LinkedList<String>ll1=new LinkedList<>();
		
		ll1.add("A");
		ll1.add("B");
	    System.out.println(ll1);//[A, B]
	    
	    System.out.println(ll1.remove(0));//A remove(index) indexdeki eleman� siler ve
	    								//sildi�i eleman� bize d�nd�r�r
	    
	    //e�er listemiz �nteger'lardan olu�uyorsa ,
	    //parantez i�ine yazd���m�z say�n�n index mi yoksa say� m� oldu�unu kar��t�rmamak i�in
	    //java parantez i�ine yaz�lan� index olarak kabul eder
	    
	    System.out.println(ll1);//[B]
	   
	    ll1.add("A");
		ll1.add("B");
		System.out.println(ll1);//[B, A, B]
		
		System.out.println(ll1.remove("B"));//true
		System.out.println(ll1);//[A, B] ilk B yi sildi
		
		ll1.addFirst("B");
		System.out.println(ll1);//[B, A, B]
		
		System.out.println(ll1.removeFirstOccurrence("B"));//True
		
		System.out.println(ll1.removeFirstOccurrence("C"));//FALSE
		System.out.println(ll1);//[A, B]
		
		ll1.remove();
		System.out.println(ll1);//[B] ilk eleman� siler
		
	}

}
