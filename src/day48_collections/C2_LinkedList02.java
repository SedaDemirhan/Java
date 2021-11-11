package day48_collections;

import java.util.LinkedList;

public class C2_LinkedList02 {

	public static void main(String[] args) {
	/*Collection da e�itli�in sol taraf�nda <> i�inde data t�r� yaz�lmasa veya
	 * data t�r� olarak object yaz�lsa collections �al���r.
	 * ama b�yle bir kullan�mda s�rekli casting yap�ld��� i�in zaman ve haf�za a��s�ndan verimli de�ildir
	 */
		LinkedList<Object>ll1=new LinkedList<>();
		
		System.out.println(System.currentTimeMillis());
		for (int i = 0; i < 1000; i++) {
		
		ll1.add("A"+i);//concatination
		ll1.add(20+i);//toplama
		ll1.add('C'+i);//ascii de�erleri
		
		}
		System.out.println(System.currentTimeMillis());
		
		//System.out.println(ll1);//[A, 20, C]
		LinkedList ll2=new LinkedList<>();
		
		ll2.add("B");
		ll2.add(25);
		ll2.add('K');
		System.out.println(ll2);//[B, 25, K]
		
		LinkedList<String>ll3=new LinkedList<>();
		
		ll3.add("D");
		ll3.add(""+15);
		ll3.add(""+'Z');
		System.out.println(ll3);//[D, 15, Z]

	}

}
