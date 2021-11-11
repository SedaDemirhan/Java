package day22_23_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C01_List01 {

	public static void main(String[] args) {
		
		List <String>isimler =new ArrayList<>();
		// add() metodu listenin sonuna ekleme yapar
		isimler.add("Ali");
		
		System.out.println(isimler);
		isimler.add("Veli");
		isimler.add("Ayþe");
		isimler.add("Fatma");
		isimler.add("Ali");
		System.out.println(isimler);
	// özel bir index'e eklemek isterseniz,o zaman index'li add metod'unu kullanmalýyýz;
		
		isimler.add(3,"nihan");
		System.out.println(isimler);
		isimler.add(0,"Mehmet");
		System.out.println(isimler);
		
		List<String>yeniList=new ArrayList<>();
		yeniList.add("Firat");
		System.out.println(yeniList);
		// yeniList'Ýn sonuna isimler listesini eklemek istersek;
		
		yeniList.addAll(isimler);
		System.out.println(yeniList);
		
		//bir de int elementlerinin olduðu liste oluþturalým
		List<Integer>sayilar=new ArrayList<>(); //int primitive,Integer wrapper calss non-primitive
sayilar.add(5);
        
        
        // yeni list'e sayilar list'i ekleyebilir miyim ?
        // farkli bir data turunden liste veya element ekleyemeyiz
        
        // yeniList.addAll(sayilar);
        // yeniList.add(5);
	}

}
