package day44_abstractclasses;

public class IdariPesonel extends Personel {
	//extends personel yazarak Abstract personele concrete bir child oluþturdum
	//ve java CTE verdi
	//çözüm olarak ürettiði 2 ihtimal var
	//1-Un implemented(uyarlanmamýþ) methodlarý uyarla
	//2-ya da Personel class'sýndan abstract kelimesini kaldýr
	//Bu class'ýn calýþabilmesi için 2 iþlemden birini yapmak zorundayýz

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	//concreate bir class'da abstract bir method olabilir mi?
	
	//public abstract void surekliCalisma();
	//Bastract bir method sadece abstract bir class'da oluþturulabilir
	//The abstract method surekliCalisma in type IdariPesonel can only be defined by an abstract class

	@Override
	public void maasHesapla() {
	System.out.println("idari personel maaþý 4000 tl");
	}

	@Override
	public void mesaiBilgisi() {
		// TODO Auto-generated method stub
		
	}

}
