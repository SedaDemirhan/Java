package day44_abstractclasses;

public abstract class Personel {
	// bir class'i abstract yapmak için class keyword'unden önce
	//abstract yazmak yeterlidir
	
	//abstract classýnýn içinde variable olabilir mi?
	//olabilir
	
	public String isim="Yasin";
	
	//variable'lar abstract olur mu?
	//olmaz!!!
	
	//public abstract int sayi=10;
	
	//abstract class'ýn tüm concreate child'larý abstract class'daki tüm dinamik özellikleri
	//yani methodlarý override etmek zorundadýr
	
	//bir method abstract olur mu ve nasýl yapýlýr?
	
	public abstract void maasHesapla();
	public abstract void mesaiBilgisi();
	
	//Bir abstract class'da concrete method yazýlabir mi?
	//bir abstract class'da abstract ve concreat methodlar olabilir
	//concreate child class'lar abstract methodlarý override ETMEK Zorundadýr ama
	// concreat methodlarý override ermek isteðe baðlýdýr
public void ozelSigorta() {
		System.out.println("bu personel sigorta kapsamýndadýr");
	}
	
	
	public static void main(String[] args) {
		
	}

}
