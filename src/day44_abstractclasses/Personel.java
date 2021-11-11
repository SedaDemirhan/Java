package day44_abstractclasses;

public abstract class Personel {
	// bir class'i abstract yapmak i�in class keyword'unden �nce
	//abstract yazmak yeterlidir
	
	//abstract class�n�n i�inde variable olabilir mi?
	//olabilir
	
	public String isim="Yasin";
	
	//variable'lar abstract olur mu?
	//olmaz!!!
	
	//public abstract int sayi=10;
	
	//abstract class'�n t�m concreate child'lar� abstract class'daki t�m dinamik �zellikleri
	//yani methodlar� override etmek zorundad�r
	
	//bir method abstract olur mu ve nas�l yap�l�r?
	
	public abstract void maasHesapla();
	public abstract void mesaiBilgisi();
	
	//Bir abstract class'da concrete method yaz�labir mi?
	//bir abstract class'da abstract ve concreat methodlar olabilir
	//concreate child class'lar abstract methodlar� override ETMEK Zorundad�r ama
	// concreat methodlar� override ermek iste�e ba�l�d�r
public void ozelSigorta() {
		System.out.println("bu personel sigorta kapsam�ndad�r");
	}
	
	
	public static void main(String[] args) {
		
	}

}
