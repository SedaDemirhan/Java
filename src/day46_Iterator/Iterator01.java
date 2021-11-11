package day46_Iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Iterator01 {

	public static void main(String[] args) {
	
		List<String>l1=new ArrayList<>(Arrays.asList("z","e","h","r","a"));
		
		System.out.println("listin ilk hali"+l1);
		
		//l1 elemanlarý for loop kullanarak yazdýrýnýz?
		
		for (int i = 0; i <l1.size(); i++) {
          System.out.print(l1.get(i)+ " ");
			
		}
		System.out.println();
		System.out.println("*************");
		
		//l1 elemanlarý foreach kullanarak yazdýrýnýz?
		
		for (String w: l1) {
			System.out.print(w+" ");
			
		}
		System.out.println();
		System.out.println("*************");
		
		//l1 elemanlarý for loop kullanarak her elemanýn yanýna :-) yazdýrýp update yapýnýz?

		for (int i = 0; i <l1.size(); i++) {
	         
			System.out.print(l1.get(i)+ " :-)");
				
			}
		System.out.println();
		System.out.print( " :-) sonrasý l1"+l1);//for loop ile elemanlarý :-) concat edildiði halde
												//l1 deðiþmedi update edilmedi
		
		List<String>l2=new ArrayList<>(Arrays.asList("s","a","i","d"));
		
		Iterator it1=l2.iterator();//iteratör it1 variable create ettik.Bununla yukarýdaki listin içine giriyoruz
									//iteratör obj olmaz
		while (it1.hasNext()) {
			  it1.next();
			 
			  it1.remove();
			  
			
		}
	System.out.println();
	System.out.println("l2 nin iteratör sonrasý :"+l2);
	
	
	
	}

}
