package day39_overriding;

public class Geciciisci extends �sci{
	
	public String calistigiBolum="yemekhane";

	public static void main(String[] args) {
		// OVERR�D�NG(ge�ersiz k�lma)
		//bir child class'da parent class'dan miras al�nana method'u
		//de�i�tirmeye overriding denir
		
		Geciciisci gi1=new Geciciisci();
		System.out.println(gi1.maasHesapla());
		gi1.mesai();
		
	}
	
	//overriding yapmak i�in parent class'daki method signature'i ile
	//child class'da bir method olu�turulur.
	//b�ylece parent class'daki method child class icin gecersiz hale gelir
public int maasHesapla() {
	return 30*8*10;
}

@Override// annotation
public void mesai() {
	//super.mesai();
	System.out.println("gecici i��iler haftada 25 saat �al���r");
}

//annotation: a��klama, dipnot
//java 25. sat�rda kodu inceleyenler icin bir ac�klama getiriyor.

//annotation olmasi ile olmamas� aras�ndaki fark
//annotation sadece bir ac�klama degildir.
//overridden yaptig�m�z method'u s�rekli kontrol eder ve parent class'daki 
//overridden method signature'i de�i�tirilirse CTE verir



//eger ovveride edilen parent class daki method(overriden)'un da
//calismasini istiyorsak overriding method'a super. overridenMethoIsmi yaz�l�r
// eger overriding method'a super.yaz�lmazsa overridden method calismaz(constructor'dan farkl�)
	

// Acess Mpdifier
//child Parent'i s�n�rland�ramaz
//Yani overriding method'un acess modifier'i overridden method'un acess modifier'�ndan daha dar olmaz

// return Type
//overriden method'un return type'i primitive veya void ise 
//overriding method'un return type'i da ayni olmali

//eger return type primitive de�ilse
//(overridding method'un return type'i) IS-A(overridden method'un return type'i)olmalid�r.


}
