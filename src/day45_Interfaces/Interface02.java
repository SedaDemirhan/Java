package day45_Interfaces;

public interface Interface02 {
	
	//soru þu: Buradaki default ve static bizim bildiðimiz default ve static mi?
	//cevap: HAYIR
	public default void deneme() {
		System.out.println("default keyword'lu method çalýþtý");
		
	}
	//Bizim bildiðimiz default acess modifier'di
	//bir method da birden fazla acess modifier olur mu?
	//bizim interface'de oluþturduðumuz tüm method'lar public'dir
	//ýnterface de default keyword kullanarak concreate method oluþturabiliriz
	//buradaki default keyword'u access modifier deðil
	//java'nýn ozel bir çözümüdür
	
	//buradaki default keyword basýna yazýldýðý method'un concrete olduðunu belirtir
	
	static void deneme2() {
		System.out.println("static keywor'lu method çalýþtý");
	}
//yukarýda default keywordü kullanarak oluþturduðumuz method'lar
//override edilmek ZORUNDA DEÐÝLDÝR.
}
