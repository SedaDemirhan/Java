package day24_lists_forEachLoops;

import java.util.ArrayList;
import java.util.List;

public class C02_List02 {

	public static void main(String[] args) {
	/*	2 ) Input olarak verilen 2 listeyi Parameter olarak kabul edip, ortak isimleri yazdiran bir method yaziniz
	 INPUT :  list1={Ali,Veli,Ayse,Fatma,Omer}
	             list2={Ali,Kemal,Hatice,Fatma,Omer,Yusuf}
	 OUTPUT =[Ali,Fatma,Omer]
*/
		
		List<String>list1=new ArrayList<>();
		list1.add("Ali");
		list1.add("Ayþe");
		list1.add("fatma");
		list1.add("ömer");
		
		List<String>list2=new ArrayList<>();
		list2.add("Ali");
		list2.add("kemal");
		list2.add("hatice");
		list2.add("fatma");
		list2.add("ömer");
		list2.add("yusuf");
		
		
		ortakList(list1,list2);
		
		
	}

	private static void ortakList(List<String> list1, List<String> list2) {
		
		List<String>ortakIsýmler=new ArrayList<>();
		
		for (int i = 0; i < list1.size(); i++) {
			
			for (int j = 0; j <list2.size(); j++) {
			
				if (list1.get(i).equalsIgnoreCase(list2.get(j))) {
				
					ortakIsýmler.add(list1.get(i));
				}
			}
		}
		System.out.println(ortakIsýmler);
		
	}

}
