package day44_abstractclasses;

public class Isci extends Personel {

	public static void main(String[] args) {
Isci isci1=new Isci();
isci1.maasHesapla();
isci1.mesaiBilgisi();
isci1.isim="rumeysa";//abstract parent class'daki variable'lar� istersem kullanabilirim
System.out.println(isci1.isim);//rumeysa

isci1.ozelSigorta();//abstract parent class'daki concreate method'u istersem kullan�r�m
//bu methodu override etmedik ama parent-child ili�kisi ile kullanabildik

	}

	@Override
	public void maasHesapla() {
		//parent class'daki abstract method'u implement(uyarlama) etti
		//1-sen abstract bir class'i parent edindiysen mutlaka oradaki abstract method'u
		//implement etmelisin
		//2-parent class'daki method'da body olmad��� i�in onu kullanman�n anlam� yok
		//biz child class'da body olan method(concreta)kullan�p i�lem yapmal�y�z
	
	System.out.println("i��iler i�in maas 5000 tl");
	}

	@Override
	public void mesaiBilgisi() {
	System.out.println("i��iler g�nluk 8 saat cal���r");
		
	}

}
