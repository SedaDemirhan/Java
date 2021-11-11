package day43_Errors_garbagecollector;

import java.util.ArrayList;
import java.util.List;

public class GarbageCollector01 {

	public static void main(String[] args) {
	
		String str="";
		for (int i = 0; i < 1000; i++) {
			str+=i;
		}

		
		// bu kod çalýþtýðýnda kaç tane obje oluþur?
		//1001
		//ilk baþta 1 tane oluþturduk
		//sonra her döngüde str'a concatination yapýlacak
		//ama string class'ý ýmmutable olduðu için her yeni deðeri koymak için
		//yeni bir String objesi oluþturulur ve eski objeden pointer silinir.
		//dolayýsýyla loop bittiðinde str için 1 tane pointer'in iþaret ettiði obje,
		//1000 tane de hiç bir pointer 'ýn iþaret etmediði obje heap memory de bulunur
		
		List<Integer>list=new ArrayList<>();
	//bu satýr javaya yeni bir oluþturmasýný söylüyor
	//java yeni obje için yer var mý diye memoryi kontrol eder ve memory kritik seviyede ise
	//garbage collector'u devreye sokuyor
		
		//garbage collector finalize()methodunu çalýþtýrýr
		//finalize methodu silinecek objeleri iþaretler ve sonra
		//Garbage collector finalized olan objeleri siler
	}

}
