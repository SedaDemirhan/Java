package day39_overriding;

public class Formen extends �sci {
	
	public String sorumluOldBolum="bakim";
	public String isim="emrullah";
	
	public static void main(String[] args) {
		// Inheritance'da data t�r� olarak class ismi kullan�m�
		
		//bir class'da obje �retirken data t�r� olarak class'�n kendisini
		//veya parent(lar)�n� kullanabiliriz.
		//olu�turdu�umuz obje ile variable kullanmam�z gerekirse,hangi degeri
		//alaca��n� anlamak i�in once Data turu olan class'a gideriz
		//orada arad���m�z variable varsa kullan�r�z,yoksa parentlar�na bakar�z,
		//yukar� do�ru giderken ilk buldu�umuz de�eri kullan�r�z
		
		Formen fr1=new Formen();
		
		//fr1 objesini kullanarak hangi class'lae�n variable'lar� g�rebilirim
		
		fr1.sorumluOldBolum="marangozhane";
		fr1.maas=10000;
		System.out.println(fr1.isim+" "+fr1.sorumluOldBolum+" "+fr1.maas);
		//emre marangozhane 10000
		
		�sci fr2=new Formen();
		//Data t�r� olarak ��c� secildi�i i�in
		fr2.bolum="kaynak at�lyesi";
		
		System.out.println(fr2.isim+" "+fr2.bolum+" "+fr2.maas);
		//yakup kaynak at�lyesi 5000
		
		Personel fr3=new Formen();
		System.out.println(fr3.isim);//emre
	}

}
