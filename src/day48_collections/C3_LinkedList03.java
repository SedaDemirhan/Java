package day48_collections;

import java.util.LinkedList;

public class C3_LinkedList03 {

	public static void main(String[] args) {
		LinkedList<String>ll1=new LinkedList<>();
		
		ll1.add("A");
		ll1.add("B");
	    System.out.println(ll1);//[A, B]
	    
	    System.out.println(ll1.remove(0));//A remove(index) indexdeki elemaný siler ve
	    								//sildiði elemaný bize döndürür
	    
	    //eðer listemiz ýnteger'lardan oluþuyorsa ,
	    //parantez içine yazdýðýmýz sayýnýn index mi yoksa sayý mý olduðunu karýþtýrmamak için
	    //java parantez içine yazýlaný index olarak kabul eder
	    
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
		System.out.println(ll1);//[B] ilk elemaný siler
		
	}

}
