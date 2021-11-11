package day44_abstractclasses;

public class Isci extends Personel {

	public static void main(String[] args) {
Isci isci1=new Isci();
isci1.maasHesapla();
isci1.mesaiBilgisi();
isci1.isim="rumeysa";//abstract parent class'daki variable'larý istersem kullanabilirim
System.out.println(isci1.isim);//rumeysa

isci1.ozelSigorta();//abstract parent class'daki concreate method'u istersem kullanýrým
//bu methodu override etmedik ama parent-child iliþkisi ile kullanabildik

	}

	@Override
	public void maasHesapla() {
		//parent class'daki abstract method'u implement(uyarlama) etti
		//1-sen abstract bir class'i parent edindiysen mutlaka oradaki abstract method'u
		//implement etmelisin
		//2-parent class'daki method'da body olmadýðý için onu kullanmanýn anlamý yok
		//biz child class'da body olan method(concreta)kullanýp iþlem yapmalýyýz
	
	System.out.println("iþçiler için maas 5000 tl");
	}

	@Override
	public void mesaiBilgisi() {
	System.out.println("iþçiler günluk 8 saat calýþýr");
		
	}

}
