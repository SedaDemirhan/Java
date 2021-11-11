package day22_23_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C07_List07 {

	public static void main(String[] args) {
		
		int sayi1=0;
		int sayi2=1;
		int sayi3=sayi1+sayi2;
		
		int count=0;
		List<Integer>İstenenSayilar=new ArrayList<>();
		
		do {
		sayi1=sayi2;
		sayi2=sayi3;
		sayi3=sayi1+sayi2;
		
		if(sayi3>100) {
			İstenenSayilar.add(sayi3);
			count++;
		  }
		
		}while(count<20);
		
		System.out.println(İstenenSayilar);
		
		
		}

}
