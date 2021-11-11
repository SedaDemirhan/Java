package day22_23_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C02_List02 {

	public static void main(String[] args) {
		
		List<Integer>sayilar=new ArrayList<>();
		
		sayilar.add(10);
		sayilar.add(20);
		
		System.out.println(sayilar);//[10,20]
		System.out.println(sayilar.size());//2
		System.out.println(sayilar.isEmpty());//false
		
		
		sayilar.add(30);
		sayilar.add(40);
		System.out.println(sayilar);//[10,20,30,40]
		
		
		
		System.out.println(sayilar.remove(2));//!!!!30 siler ve sildiðini getirir!!
		// remove method'u iki turlu kullanilabilir
        // 1- silmek istedigimiz elementin index'ini yazarsak
        // o elemnti siler ve delil olarak sildigi elementi bize dondurur
      
		int silinenEleman =sayilar.remove(2);
		System.out.println(sayilar);//[10,20,40]
		sayilar.add(silinenEleman);
        System.out.println(sayilar); // [10, 20, 40, 30]
        
 // remove ikinci yontem olarak direk silmek istedigimiz degeri yazabiliriz
        
        // sayilar.remove(20);
        // System.out.println(sayilar);
        // eger listemiz sayilardan olusuyorsa biz silmesini istedigimiz elementi yazdigimizda
        // java index olarak algilar
        // ama String liste icin boyle bir problem olmaz
		

		List<String>isimler=new ArrayList<>();
		isimler.add("Ali");
		isimler.add("Ayþe");
		isimler.add("Zeki");
		System.out.println(isimler.remove("Zeki"));//true
		System.out.println(isimler);
		
		isimler.remove("Ayþe");
		System.out.println(isimler);//[Ali]
		
		boolean sonuc=isimler.remove("mehmet");
		if(sonuc) {
			System.out.println("mehmet'i buldum ve sildim");
		}else {
			System.out.println("mehmeti bulamadým dolayýsýyla da silemedim");
	
		}
		
		isimler.remove(0);
		
		
	}

}
