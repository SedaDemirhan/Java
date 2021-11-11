package day48_collections;

import java.util.LinkedList;

public class C2_LinkedList02 {

	public static void main(String[] args) {
	/*Collection da eþitliðin sol tarafýnda <> içinde data türü yazýlmasa veya
	 * data türü olarak object yazýlsa collections çalýþýr.
	 * ama böyle bir kullanýmda sürekli casting yapýldýðý için zaman ve hafýza açýsýndan verimli deðildir
	 */
		LinkedList<Object>ll1=new LinkedList<>();
		
		System.out.println(System.currentTimeMillis());
		for (int i = 0; i < 1000; i++) {
		
		ll1.add("A"+i);//concatination
		ll1.add(20+i);//toplama
		ll1.add('C'+i);//ascii deðerleri
		
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
