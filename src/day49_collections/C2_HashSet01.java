package day49_collections;

import java.util.HashSet;
import java.util.Set;

public class C2_HashSet01 {

	public static void main(String[] args) {
//verilen bir array'deki tekrarl� elemanlar� silip
//unique elemanlardan olu�an bir Array'e �eviren bir method yaz�n�z

	
	int arr[]={2,3,4,3,5,3,6,4,7,4,8,5};
	
	int tekrars�zArray[]=tekrarlariSil(arr);
	
	

	
		
		
	}

	public static int[] tekrarlariSil(int[] arr) {
		Set<Integer>set1=new HashSet<>();
		for (Integer each :arr ) {
			set1.add(each);
			
		}
		System.out.println(set1);//[2, 3, 4, 5, 6, 7, 8]
		
		int tekrarsizArray[]=new int[set1.size()];
		return tekrarsizArray;
	}

}
