package day39_overriding;

public class �sci extends Personel{
	
	public String bolum="kaynak at�lyesi";
	public int maas=5000;
	public String isim="mesut";
	
	
	public int maaasHesapla() {
		return 30*8*15;//30 g�n say�s�,8 gunluk mesai,15 saat ucreti
	}

	public void mesai() {
		System.out.println("isciler g�nl�k 8 saat cal�s�r.");
	}
	
	//Overloading: ayni isimde ama farkli method signature'lar�na sahip methodlar
	public int maasHesapla(int gunSayisi) {
		return gunSayisi*8*15;
		
	}
	public int maasHesapla(int gunlukCalismaSaati,int gunSay�s� ) {
		return gunSay�s�*gunlukCalismaSaati*15;
	}
	public int maasHesapla(int gunlukCalismaSaati,int gunSay�s�, int saatUcreti) {
		return gunSay�s�*gunlukCalismaSaati*saatUcreti;
	}
	
}
