package day46_Iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Iterator01 {

	public static void main(String[] args) {
	
		List<String>l1=new ArrayList<>(Arrays.asList("z","e","h","r","a"));
		
		System.out.println("listin ilk hali"+l1);
		
		//l1 elemanlar� for loop kullanarak yazd�r�n�z?
		
		for (int i = 0; i <l1.size(); i++) {
          System.out.print(l1.get(i)+ " ");
			
		}
		System.out.println();
		System.out.println("*************");
		
		//l1 elemanlar� foreach kullanarak yazd�r�n�z?
		
		for (String w: l1) {
			System.out.print(w+" ");
			
		}
		System.out.println();
		System.out.println("*************");
		
		//l1 elemanlar� for loop kullanarak her eleman�n yan�na :-) yazd�r�p update yap�n�z?

		for (int i = 0; i <l1.size(); i++) {
	         
			System.out.print(l1.get(i)+ " :-)");
				
			}
		System.out.println();
		System.out.print( " :-) sonras� l1"+l1);//for loop ile elemanlar� :-) concat edildi�i halde
												//l1 de�i�medi update edilmedi
		
		List<String>l2=new ArrayList<>(Arrays.asList("s","a","i","d"));
		
		Iterator it1=l2.iterator();//iterat�r it1 variable create ettik.Bununla yukar�daki listin i�ine giriyoruz
									//iterat�r obj olmaz
		while (it1.hasNext()) {
			  it1.next();
			 
			  it1.remove();
			  
			
		}
	System.out.println();
	System.out.println("l2 nin iterat�r sonras� :"+l2);
	
	
	
	}

}
