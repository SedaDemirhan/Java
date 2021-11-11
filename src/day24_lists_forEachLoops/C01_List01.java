package day24_lists_forEachLoops;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class C01_List01 {

	public static void main(String[] args) {
	/*1)Kullanicidan isimler isteyin ve bunlari bir list’te depolayin.
	 *  Kullanici yeter yazana kadar isim istemeye devam edin.
     
      
      Kullanici isim girmeyi bitirdiginde toplam kac isim girdigini ve bunlardan kac
      tanesinin asagidaki listede olan isimlerden oldugunu yazdirin
 isimList=Ali , Veli, Ayse, Fatma, Zeki, Kemal
 Not :yeter için küçük büyük harf önemli deðil ancak isimler için onemli 
 */

		Scanner scan=new Scanner(System.in);
		List<String>girilenIsýmler=new ArrayList<>();
		String isim;
		
		do {
			System.out.println("lütfen listeye eklemek için isim giriniz \nBitirmek icin yeter deyiniz");
		
			
			isim=scan.nextLine();
			if (!isim.equalsIgnoreCase("yeter")) {
				girilenIsýmler.add(isim);
			}
			
			
		
		} while (!isim.equalsIgnoreCase("yeter"));
		System.out.println(girilenIsýmler);
		
		//karþýlaþtýrmak istediðimiz listeyi oluþturalým
		//listenin uzunluðu deðiþmeyeceði için array oluþturup liste çevirebilirz
		//böylece 6 ismi tek tek eklemek zorunda kalmam
		
		String isimler[]= {"Ali" , "Veli", "Ayse", "Fatma", "Zeki", "Kemal"};
		List<String>isimList=Arrays.asList(isimler);
		//elimizde 2 tane liste var
		//1- kullanýcýdan aldýðýmýz isimlerin olduðu girilen isimler
		//2-karþýlaþtýracaðýmýz liste---isimlist--
		
		System.out.println("Toplam :"+girilenIsýmler.size()+"isim girdiniz");
		int count=0;
		for (int i = 0; i < girilenIsýmler.size(); i++) {
			if (isimList.contains(girilenIsýmler.get(i))) {
				count++;
			}
		}
		System.out.println("girdiðiniz isimlerden"+count+"tanesi bendeki liste de kayýtlý");
		scan.close();
		
	}

}
