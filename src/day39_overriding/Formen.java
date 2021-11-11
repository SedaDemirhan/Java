package day39_overriding;

public class Formen extends Ýsci {
	
	public String sorumluOldBolum="bakim";
	public String isim="emrullah";
	
	public static void main(String[] args) {
		// Inheritance'da data türü olarak class ismi kullanýmý
		
		//bir class'da obje üretirken data türü olarak class'ýn kendisini
		//veya parent(lar)ýný kullanabiliriz.
		//oluþturduðumuz obje ile variable kullanmamýz gerekirse,hangi degeri
		//alacaðýný anlamak için once Data turu olan class'a gideriz
		//orada aradýðýmýz variable varsa kullanýrýz,yoksa parentlarýna bakarýz,
		//yukarý doðru giderken ilk bulduðumuz deðeri kullanýrýz
		
		Formen fr1=new Formen();
		
		//fr1 objesini kullanarak hangi class'laeýn variable'larý görebilirim
		
		fr1.sorumluOldBolum="marangozhane";
		fr1.maas=10000;
		System.out.println(fr1.isim+" "+fr1.sorumluOldBolum+" "+fr1.maas);
		//emre marangozhane 10000
		
		Ýsci fr2=new Formen();
		//Data türü olarak ýþcý secildiði için
		fr2.bolum="kaynak atölyesi";
		
		System.out.println(fr2.isim+" "+fr2.bolum+" "+fr2.maas);
		//yakup kaynak atölyesi 5000
		
		Personel fr3=new Formen();
		System.out.println(fr3.isim);//emre
	}

}
