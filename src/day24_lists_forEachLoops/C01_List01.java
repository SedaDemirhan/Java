package day24_lists_forEachLoops;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class C01_List01 {

	public static void main(String[] args) {
	/*1)Kullanicidan isimler isteyin ve bunlari bir list�te depolayin.
	 *  Kullanici yeter yazana kadar isim istemeye devam edin.
     
      
      Kullanici isim girmeyi bitirdiginde toplam kac isim girdigini ve bunlardan kac
      tanesinin asagidaki listede olan isimlerden oldugunu yazdirin
 isimList=Ali , Veli, Ayse, Fatma, Zeki, Kemal
 Not :yeter i�in k���k b�y�k harf �nemli de�il ancak isimler i�in onemli 
 */

		Scanner scan=new Scanner(System.in);
		List<String>girilenIs�mler=new ArrayList<>();
		String isim;
		
		do {
			System.out.println("l�tfen listeye eklemek i�in isim giriniz \nBitirmek icin yeter deyiniz");
		
			
			isim=scan.nextLine();
			if (!isim.equalsIgnoreCase("yeter")) {
				girilenIs�mler.add(isim);
			}
			
			
		
		} while (!isim.equalsIgnoreCase("yeter"));
		System.out.println(girilenIs�mler);
		
		//kar��la�t�rmak istedi�imiz listeyi olu�tural�m
		//listenin uzunlu�u de�i�meyece�i i�in array olu�turup liste �evirebilirz
		//b�ylece 6 ismi tek tek eklemek zorunda kalmam
		
		String isimler[]= {"Ali" , "Veli", "Ayse", "Fatma", "Zeki", "Kemal"};
		List<String>isimList=Arrays.asList(isimler);
		//elimizde 2 tane liste var
		//1- kullan�c�dan ald���m�z isimlerin oldu�u girilen isimler
		//2-kar��la�t�raca��m�z liste---isimlist--
		
		System.out.println("Toplam :"+girilenIs�mler.size()+"isim girdiniz");
		int count=0;
		for (int i = 0; i < girilenIs�mler.size(); i++) {
			if (isimList.contains(girilenIs�mler.get(i))) {
				count++;
			}
		}
		System.out.println("girdi�iniz isimlerden"+count+"tanesi bendeki liste de kay�tl�");
		scan.close();
		
	}

}
