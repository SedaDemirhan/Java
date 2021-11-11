package day39_overriding;

public class İsci extends Personel{
	
	public String bolum="kaynak atölyesi";
	public int maas=5000;
	public String isim="mesut";
	
	
	public int maaasHesapla() {
		return 30*8*15;//30 gün sayısı,8 gunluk mesai,15 saat ucreti
	}

	public void mesai() {
		System.out.println("isciler günlük 8 saat calısır.");
	}
	
	//Overloading: ayni isimde ama farkli method signature'larına sahip methodlar
	public int maasHesapla(int gunSayisi) {
		return gunSayisi*8*15;
		
	}
	public int maasHesapla(int gunlukCalismaSaati,int gunSayısı ) {
		return gunSayısı*gunlukCalismaSaati*15;
	}
	public int maasHesapla(int gunlukCalismaSaati,int gunSayısı, int saatUcreti) {
		return gunSayısı*gunlukCalismaSaati*saatUcreti;
	}
	
}
