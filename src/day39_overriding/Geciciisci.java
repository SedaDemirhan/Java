package day39_overriding;

public class Geciciisci extends Ýsci{
	
	public String calistigiBolum="yemekhane";

	public static void main(String[] args) {
		// OVERRÝDÝNG(geçersiz kýlma)
		//bir child class'da parent class'dan miras alýnana method'u
		//deðiþtirmeye overriding denir
		
		Geciciisci gi1=new Geciciisci();
		System.out.println(gi1.maasHesapla());
		gi1.mesai();
		
	}
	
	//overriding yapmak için parent class'daki method signature'i ile
	//child class'da bir method oluþturulur.
	//böylece parent class'daki method child class icin gecersiz hale gelir
public int maasHesapla() {
	return 30*8*10;
}

@Override// annotation
public void mesai() {
	//super.mesai();
	System.out.println("gecici iþçiler haftada 25 saat çalýþýr");
}

//annotation: açýklama, dipnot
//java 25. satýrda kodu inceleyenler icin bir acýklama getiriyor.

//annotation olmasi ile olmamasý arasýndaki fark
//annotation sadece bir acýklama degildir.
//overridden yaptigýmýz method'u sürekli kontrol eder ve parent class'daki 
//overridden method signature'i deðiþtirilirse CTE verir



//eger ovveride edilen parent class daki method(overriden)'un da
//calismasini istiyorsak overriding method'a super. overridenMethoIsmi yazýlýr
// eger overriding method'a super.yazýlmazsa overridden method calismaz(constructor'dan farklý)
	

// Acess Mpdifier
//child Parent'i sýnýrlandýramaz
//Yani overriding method'un acess modifier'i overridden method'un acess modifier'ýndan daha dar olmaz

// return Type
//overriden method'un return type'i primitive veya void ise 
//overriding method'un return type'i da ayni olmali

//eger return type primitive deðilse
//(overridding method'un return type'i) IS-A(overridden method'un return type'i)olmalidýr.


}
