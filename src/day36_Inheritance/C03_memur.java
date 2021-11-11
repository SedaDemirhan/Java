package day36_Inheritance;

public class C03_memur extends  C02_muhasebe {

	public static void main(String[] args) {
		
		C03_memur m1=new C03_memur();
		
		C03_memur m2=new C03_memur();
		
		m1.isim="seda";
		m1.soyisim="demirhan";
		m1.adres="falan feþmekan";
		m1.saatUcreti=20;
		m1.statü="sef";
		m1.tel="123456";
		m1.id=m1.idAta();
		m1.maas=m1.maasHesapla();
		
		System.out.println(m1.isim + "\n" + m1.soyisim+  "\n" +m1.tel+ "\n" + m1.adres + "\n" + m1.saatUcreti + "\n" +m1.id + "\n" + m1.maas);
		
		System.out.println("*********************");
		m2.isim="serdar";
		m2.soyisim="demirhan";
		m2.adres="falan feþmekan";
		m2.saatUcreti=50;
		m2.statü="müdür";
		m2.tel="123456";
		m2.id=m1.idAta();
		m2.maas=m2.maasHesapla();
		
		System.out.println(m2.isim + "\n" + m2.soyisim+  "\n" +m2.tel+ "\n" + m2.adres + "\n" + m2.saatUcreti + "\n" +m2.id + "\n" + m2.maas);
		
		
	}

}
